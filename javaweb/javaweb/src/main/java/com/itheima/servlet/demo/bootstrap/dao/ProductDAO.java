package com.itheima.servlet.demo.bootstrap.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.servlet.demo.bootstrap.domain.Product;
import com.itheima.servlet.demo.bootstrap.utils.JDBCUtils;

public class ProductDAO {

	public List<Product> findAllList(int pageNo,int pageSize) throws SQLException{
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from product limit ?,?";
		return queryRunner.query(sql, new BeanListHandler<Product>(Product.class),
				(pageNo - 1) * pageSize, pageSize);
//		System.out.println(list);
//		return list;
		
	}

	public int findAllCount() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from product";
		Long long1 = (Long) queryRunner.query(sql, new ScalarHandler());
		return long1.intValue();
	}
}
