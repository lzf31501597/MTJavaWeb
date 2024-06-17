package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @author
 * @version 1.0
 * @date 2024/05/31 14:51
 * @Description
 */

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
    * 员工登录
    * @param request
    * @param employee
     * @return
    */
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee){

        //1.将页面输入提交的密码进行md5加密
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        //2.将页面输入提交的用户名查询数据库
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Employee::getUsername, employee.getUsername());
        Employee emp = employeeService.getOne(lambdaQueryWrapper);

        //3.查询没有，就返回登录失败结果
        if(emp == null){
            return R.error("登录失败！！！！");
        }

        //4.密码对比，如果不一致则返回登录失败结果
        if (!emp.getPassword().equals(password)) {
            return R.error("登录失败！！！！");
        }

        //5.查看员工状态，如果为0，则已被禁用，则返回员工已禁用的结果
        if (emp.getStatus() == 0) {
            return R.error("账号已禁用！！！！");
        }

        //6.登录成功，将员工id存入session并返回登陆成功结果
        request.getSession().setAttribute("employee1", emp.getId());
        Long employeeId = (Long) request.getSession().getAttribute("employee1");
        log.info("用户"+emp.getName()+"已登录，用户id: " + employeeId);
        return R.success(emp);
    }

    /**
     * 员工退出
     * @param request
     * @return
     */
    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request) {
        //退出后，清理session保存的当前员工的id
        request.getSession().removeAttribute("employee1");
        return R.success("退出成功！！！！");
    }

    /**
     * 员工添加
     * @param emp
     * @return
     */
    @PostMapping
    public R<String> save(HttpServletRequest request, @RequestBody Employee emp){
        log.info("新增员工，员工信息：{}", emp.toString());

        //初期パスワードの設定にはMD5暗号化が必要です。
        emp.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        /* emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());

        //現在のユーザーIDを取得する
        Long employeeId = (Long) request.getSession().getAttribute("employee1");


        emp.setCreateUser(employeeId);
        emp.setUpdateUser(employeeId); */

        employeeService.save(emp);
        /*try {
            employeeService.save(employee);
        } catch (Exception e) {
            R.error("新增员工失败");
        }*/

        return R.success("新增员工成功！！！");
    }


    /**
     * @Author
     * @Description 员工信息分页查询
     * @Date 14:56 2024/06/05
     * @param page
     * @param pageSize
     * @param name
     * @return
    **/
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name){
        log.info("page = {}, pageSize = {}, name = {}", page, pageSize, name);

        //构建分页构造器
        Page pageInfo = new Page(page, pageSize);

        //构建条件构造器
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper();

        //添加过滤条件
        lambdaQueryWrapper.like(StringUtils.isNotEmpty(name), Employee::getName, name);

        //添加排序条件
        lambdaQueryWrapper.orderByDesc(Employee::getUpdateTime);

        //执行查询
        employeeService.page(pageInfo, lambdaQueryWrapper);

        return R.success(pageInfo);
    }


   /**
    * @Author
    * @Description 根据id修改员工信息
    * @Date 17:26 2024/06/05
    * @param employee
    * @return
   **/
   @PutMapping
    public R<String> update(HttpServletRequest request, @RequestBody Employee employee){
        log.info(employee.toString());

       Long id = Thread.currentThread().getId();
       log.info("线程id：{}" + id);

        long employeeId = (long) request.getSession().getAttribute("employee1");

        /* employee.setUpdateTime(LocalDateTime.now());
        employee.setUpdateUser(employeeId); */
        employeeService.updateById(employee);

        return R.success("员工信息修改成功！！！");
    }

    /**
     * @Author
     * @Description 根据id查询员工信息
     * @Date 16:30 2024/06/06
     * @param id
     * @return
    **/
    @GetMapping("/{id}")
    public R<Employee> getById(@PathVariable Long id){
        log.info("根据id查询员工信息！！！");
        Employee employee = employeeService.getById(id);

        return R.success(employee);
    }
}
