package com.javaTest.manhanlou26.view;

import com.javaTest.manhanlou26.domain.*;
import com.javaTest.manhanlou26.services.BillService;
import com.javaTest.manhanlou26.services.DiningTableService;
import com.javaTest.manhanlou26.services.EmployeeService;
import com.javaTest.manhanlou26.services.MenuService;
import com.javaTest.manhanlou26.utils.Utility;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2023/12/08 17:11
 * @Description
 */
public class MHLView {

    //控制是否退出菜单
    private boolean loop = true;
    private String key = "";//接收用户选择编码
    //定义 EmployeeService 属性
    private EmployeeService employeeService = new EmployeeService();
    //定义 EmployeeService 属性
    private DiningTableService diningTableService = new DiningTableService();
    //定义 MenuService 属性
    private MenuService menuService = new MenuService();
    //定义 BillService 属性
    private BillService billService = new BillService();

    public static void main(String[] args) {
        new MHLView().mainMenu();
    }

    //完成结账(如果餐桌存在，并且该餐桌有未结账的账单)
    //如果成功，返回true,否则返回false
    public void payBill(){
        System.out.println("========================结账服务========================");
        System.out.println("请输入要结账的餐桌号（-1：退出）：");
        int diningTableId = Utility.readInt();
        if (diningTableId == -1) {
            System.out.println("=========================取消结账=======================");
            return;
        }
        //验证餐桌是否存在
        DiningTable diningTable = diningTableService.getDiningTableById(diningTableId);
        if (diningTable == null) {
            System.out.println("=========================结账的餐桌不存在=======================");
            return;
        }

        //验证餐桌是否有需要结账的账单
        if (!(billService.hasPayBillByDiningTableId(diningTableId))){
            System.out.println("=========================该餐位没有未结账的账单=======================");
            return;
        }

        System.out.println("结账方式（现金/支付宝/微信）");
        String payMode = Utility.readString(20, "");//说明如果回车，就是返回 ""
        if ("".equals(payMode)) {
            System.out.println("=========================取消结账=======================");
            return;
        }
        char key = Utility.readConfirmSelection();
        if (key == 'Y') {//结账
            //调用我们写的方法
            if (billService.payBill(diningTableId, payMode)){
                System.out.println("=========================完成结账=======================");
            } else {
                System.out.println("=========================结账失败=======================");
            }
        }{
            System.out.println("=========================取消结账=======================");
        }

    }

    //显示账单信息
    public void listBill(){
        /*List<Bill> bills = billService.list();
        System.out.println("\n编号\t\t菜品号\t\t菜品量\t\t金额\t\t桌号\t\t日期\t\t\t\t\t\t\t状态");
        for (Bill bill : bills){
            System.out.println(bill);
        }
        System.out.println("========================所有账单显示完毕========================");*/
        List<MultiTableBean> multiTableBeans = billService.list2();
        System.out.println("\n编号\t\t菜品号\t\t菜品量\t\t金额\t\t桌号\t\t日期\t\t\t\t\t\t\t状态\t\t\t菜品名\t\t价格");
        for (MultiTableBean bill : multiTableBeans){
            System.out.println(bill);
        }
        System.out.println("========================所有账单显示完毕========================");
    }

    //点餐服务
    public void orderMenu() {
        System.out.println("=========================点餐服务=======================");
        System.out.println("请输入点餐的餐桌号（-1：退出）：");
        int orderDiningTableId = Utility.readInt();
        if (orderDiningTableId == -1) {
            System.out.println("=========================取消点餐=======================");
            return;
        }

        System.out.println("请输入点餐的菜品号（-1：退出）：");
        int orderMenuId = Utility.readInt();
        if (orderMenuId == -1) {
            System.out.println("=========================取消点餐=======================");
            return;
        }

        System.out.println("请输入点餐的菜品量（-1：退出）：");
        int orderNums = Utility.readInt();
        if (orderNums == -1) {
            System.out.println("=========================取消点餐=======================");
            return;
        }

        //验证餐桌号是否存在，
        DiningTable diningTable = diningTableService.getDiningTableById(orderDiningTableId);
        if (diningTable == null) {
            System.out.println("=========================餐桌号不存在=======================");
            return;
        }

        //验证菜品编号
        Menu menu = menuService.getMenuById(orderMenuId);
        if (menu == null) {
            System.out.println("=========================菜品号不存在=======================");
            return;
        }

        //点餐
        boolean b = billService.orderMenu(orderMenuId, orderNums, orderDiningTableId);
        if (b) {
            System.out.println("=========================点餐成功=======================");
        } else {
            System.out.println("=========================点餐失败=======================");
        }

    }

    //显示所有菜品
    public void listMenu() {
        List<Menu> list = menuService.list();
        System.out.println("\n菜品编号\t\t菜品名\t\t类别\t\t\t价格");
        for(Menu menu : list){
            System.out.println(menu);
        }
        System.out.println("========================所有菜品显示完毕========================");
    }

    //完成订座
    public void orderDiningTable(){
        System.out.println("========================预定餐桌========================");
        System.out.println("请选择要预定的餐桌号（-1：退出）：");
        int orderId = Utility.readInt();
        if (orderId == -1) {
            System.out.println("========================取消预定餐桌========================");
            return;
        }
        //该方法得到的是 Y 或 N
        char key = Utility.readConfirmSelection();
        if (key == 'Y') {

            //根据orderId 返回对应DiningTable对象，如果位null，说明该对象不存在
            DiningTable diningTable = diningTableService.getDiningTableById(orderId);
            if (diningTable == null) {
                System.out.println("========================预定餐桌不存在========================");
                return;
            }

            //判断该餐桌的状态是是否为"空"
            if (!("空".equals(diningTable.getState()))) {//说明当前这个餐桌不是 "空"状态
                System.out.println("========================餐桌已预定或就餐中========================");
                return;
            }

            //接收预定人的信息
            System.out.println("预订人的名字：");
            String oerderName = Utility.readString(50);
            System.out.println("预订人的电话：");
            String oerderTel = Utility.readString(50);

            //这是说明可以真的预定，更新餐桌状态
            if (diningTableService.orderDiningTable(orderId, oerderName, oerderTel)) {
                System.out.println("========================预定餐桌成功========================");
            }else {
                System.out.println("========================预定餐桌失败========================");
            }
        }else {
            System.out.println("========================取消预定餐桌========================");
            return;
        }
    }

    //显示所有餐桌
    public void listDiningTable(){
        List<DiningTable> list = diningTableService.list();
        System.out.println("\n餐桌编号\t\t餐桌状态");
        for(DiningTable diningTable : list) {
            System.out.println(diningTable);
        }
        System.out.println("=======================显示完毕========================");
    }

    //显示主菜单
    public void mainMenu() {

        while(loop) {
            System.out.println("=======================满汉楼========================");
            System.out.println("\t\t 1 登录满汉楼");
            System.out.println("\t\t 2 退出满汉楼");
            System.out.print("请输入你的选择：");
            key = Utility.readString(1);
            switch (key) {
                case "1" :
                    //System.out.println("登录满汉楼");
                    System.out.println("输入员工号：");
                    String empid = Utility.readString(50);
                    System.out.println("输入密  码：");
                    String pwd = Utility.readString(50);
                    Employee employee = employeeService.getEmployeeByIdAndPwd(empid, pwd);

                    if (employee != null) {//说明用户存在
                        System.out.println("=======================登录成功["+employee.getEmpid()+"]========================\n");
                        //显示二级菜单，这里二级菜单是循环操作，所以做成while
                        while(loop) {
                            System.out.println("=======================满汉楼(二级菜单)========================\n");
                            System.out.println("\t\t 1 显示餐桌状态");
                            System.out.println("\t\t 2 预定餐桌");
                            System.out.println("\t\t 3 显示所有菜品");
                            System.out.println("\t\t 4 点餐服务");
                            System.out.println("\t\t 5 查看账单");
                            System.out.println("\t\t 6 结账");
                            System.out.println("\t\t 9 退出满汉楼");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    //System.out.println("显示餐桌状态");
                                    listDiningTable();
                                    break;
                                case "2":
                                    //System.out.println("预定餐桌");
                                    orderDiningTable();
                                    break;
                                case "3":
                                    //System.out.println("显示所有菜品");
                                    listMenu();
                                    break;
                                case "4":
                                    //System.out.println("点餐服务");
                                    orderMenu();
                                    break;
                                case "5":
                                    //System.out.println("查看账单");
                                    listBill();
                                    break;
                                case "6":
                                    //System.out.println("结账");
                                    payBill();
                                    break;
                                case "9":
                                    System.out.println("退出满汉楼");
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("输入有误，重新输入：");
                                    break;
                            }
                        }

                    } else {
                        System.out.println("=======================登录失败========================");

                    }
                    break;
                case "2" :
                    //System.out.println("退出满汉楼");
                    loop = false;
                    break;
                default :
                    System.out.println("输入有误，重新输入：");
                    break;
            }

        }
    }

}
