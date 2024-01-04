package com.itheima.servlet.demo.bootstrap.service;

import java.sql.SQLException;
import java.util.List;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.servlet.demo.bootstrap.dao.ProductDAO;
import com.itheima.servlet.demo.bootstrap.domain.PageBean;
import com.itheima.servlet.demo.bootstrap.domain.Product;
import com.itheima.servlet.demo.bootstrap.utils.JDBCUtils;



public class ProductService {

//	public List<Product> findAllList(int pageNo,int pageSize) throws SQLException{
//		ProductDAO dao = new ProductDAO();
//		return dao.findAllList(pageNo, pageSize);
//		
//	}
	
	public PageBean findAllList(int pageNo,int pageSize) throws SQLException{
		ProductDAO dao = new ProductDAO();
		List<Product> pglList = dao.findAllList(pageNo, pageSize);
		
		PageBean<Product> pageBean = new PageBean<Product>();
		pageBean.setPageNo(pageNo);
		pageBean.setContent(pglList);
		pageBean.setPageSize(pageSize);
		
		int totalCount = dao.findAllCount();
		int totalPage = (int) Math.ceil(totalCount * 1.0/pageSize);
		pageBean.setTotalCount(totalCount);
		pageBean.setTotalPage(totalPage);
		
		return pageBean;
		
	}
}
