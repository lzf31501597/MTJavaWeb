package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author
 * @version 1.0
 * @date 2024/05/15 11:52
 * @Description
 */

@WebServlet("/user/delete")
public class UserDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接收请求参数
        String name = req.getParameter("name");
        System.out.println("servlet delete name ==>" + name);

        //2.产生响应
        resp.setContentType("text/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write("{'module':'servlet delete'}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
