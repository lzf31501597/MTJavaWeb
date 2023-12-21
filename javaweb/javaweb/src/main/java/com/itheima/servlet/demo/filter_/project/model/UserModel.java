package com.itheima.servlet.demo.filter_.project.model;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.servlet.demo.filter_.project.domain.User;
import com.itheima.servlet.demo.login.utils.JDBCUtils;

public class UserModel {

	public User login(User user) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sqlString = "select * from ufilter where username = ? and password = ?";
		User existUser = queryRunner.query(sqlString, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword() );
		return existUser;
		
	}
}
