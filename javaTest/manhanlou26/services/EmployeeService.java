package com.javaTest.manhanlou26.services;

import com.javaTest.manhanlou26.dao.EmployeeDAO;
import com.javaTest.manhanlou26.domain.Employee;

/**
 * @author
 * @version 1.0
 * @date 2023/12/08 17:42
 * @Description 该类完成对employee表的各种操作（通过调用EmployeeDAO对象完成）
 */
public class EmployeeService {

    //定义一个 EmployDAO 属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private String key = "";//接收用户选择编码

    //根据empid和pwd 返回一个Employee对象
    //如果查询不到，就返回一个null
    public Employee getEmployeeByIdAndPwd(String empid, String pwd){
        String sql = "select * from employee where empid = ? and pwd=md5(?)";
        Employee employee = employeeDAO.querySingle(sql, Employee.class, empid, pwd);
        return employee;
    }

}
