package com.javaTest.manhanlou26.services;

import com.javaTest.manhanlou26.dao.DiningTableDAO;
import com.javaTest.manhanlou26.domain.DiningTable;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2023/12/09 9:52
 * @Description
 */
public class DiningTableService {

    //定义一个  对象
    private DiningTableDAO diningTableDAO = new DiningTableDAO();

    //返回所有餐桌的信息
    public List<DiningTable> list() {
        String sql = "select id, state from diningTable";
        return diningTableDAO.queryMultplay(sql, DiningTable.class);
    }

    //根据 ID，查询对应的餐桌 DiningTable 对象，
    //如果返回null，表示id编号对应的餐桌不存在
    public DiningTable getDiningTableById(int id) {
        String sql = "select * from diningTable where id = ?";
        return diningTableDAO.querySingle(sql, DiningTable.class, id);
    }

    //如果餐桌可以预定，调用方法，对其状态进行更新（包括预订人的名字和电话）
    public boolean orderDiningTable(int id, String orderName, String orderTel) {

        String sql = "update diningTable set state='已预订', orderName = ?, orderTel = ? where id = ?";
        int update = diningTableDAO.update(sql, orderName, orderTel, id);

        return update > 0;
    }

    //需要更新提供一个更新， 餐桌状态的方法
    public boolean updateDiningTableState(int id, String state){
        String sql = "update diningTable set state = ? where id = ?";
        int update = diningTableDAO.update(sql, state, id);
        return update > 0;
    }

    //将指定的餐桌设置为空闲状态的方法
    public boolean updateDiningTableToFree(int id, String state){
        String sql = "update diningTable set state = ?, orderName='', orderTel='' where id = ?";
        int update = diningTableDAO.update(sql, state, id);
        return update > 0;
    }
}
