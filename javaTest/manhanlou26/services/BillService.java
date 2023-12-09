package com.javaTest.manhanlou26.services;

import com.javaTest.manhanlou26.dao.BillDAO;
import com.javaTest.manhanlou26.dao.MultiTableDAO;
import com.javaTest.manhanlou26.domain.Bill;
import com.javaTest.manhanlou26.domain.MultiTableBean;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

/**
 * @author
 * @version 1.0
 * @date 2023/12/09 11:43
 * @Description 处理和账单相关的业务，通过BIllDAO
 */
public class BillService {

    //定义 BillDAO 属性
    private BillDAO billDAO = new BillDAO();
    //定义 MenuService 属性
    private MenuService menuService = new MenuService();
    //定义 DiningTableService 属性
    private DiningTableService diningTableService = new DiningTableService();
    //定义 MultiTableDAO 属性
    private MultiTableDAO multiTableDAO = new MultiTableDAO();

    //点餐方法
    //1.生成账单
    //2.需要更新对应餐桌的状态
    //3.如果成功返回true，否则失败返回false
    @Test
    public boolean orderMenu(int menuid, int nums, int diningTableId){
        //生成一个账单号,uuid
        String billid = UUID.randomUUID().toString();

        //将生成账单，放入到bill表中,需求直接计算账单金额
        String sql = "insert into bill values(null, ?,?,?,?,?,now(),'未结账')";
        int update = billDAO.update(sql, billid, menuid, nums, menuService.getMenuById(menuid).getPrice() * nums, diningTableId);

        if (update <= 0) {
            return false;
        }

        //2.需要更新对应餐桌的状态
        return diningTableService.updateDiningTableState(diningTableId, "就餐中");
    }

    //返回所有的账单，提供给view调用
    public List<Bill> list() {
        return billDAO.queryMultplay("select * from bill", Bill.class);
    }

    //返回所有的账单,并且带有菜品名，提供给view调用
    public List<MultiTableBean> list2() {
        String sql = "select bill.*, menu.name, menu.price from bill, menu where bill.menuid = menu.id";
        return multiTableDAO.queryMultplay(sql, MultiTableBean.class);
    }

    //查看餐桌是否有未结账的账单
    public boolean hasPayBillByDiningTableId(int diningTableId) {
        String sql = "select * from bill where diningTableId = ? and state = '未结账' limit 0, 1";
        Bill bill = billDAO.querySingle(sql, Bill.class, diningTableId);
        return bill != null;
    }

    //完成结账（如果餐桌存在，并且该餐桌有未结账的账单）
    public boolean payBill(int diningTableId, String payMode) {
        //如果这里使用事务的话，需要用ThreadLocal 来解决，框架中比如mybatis 提供了事务支持**********
        String sql = "update bill set state = ? where diningTableId = ? and state = '未结账'";
        //1.修改bill表
        int update = billDAO.update(sql, payMode, diningTableId);
        if (update <= 0) { //如果没有修改成功，则表示失败。。。
            return false;
        }

        //2.修改 iningTable 表
        //注意：不要直接在这里操作，而应该调用 DiningTableService 方法
        if (!diningTableService.updateDiningTableToFree(diningTableId, "空")) {
            return false;
        }

        return true;
    }
}
