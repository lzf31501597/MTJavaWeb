package com.itheima.servlet.demo.jstl.model;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.servlet.demo.jstl.domain.Student;
import com.itheima.servlet.demo.jstl.utils.JDBCUtils;


public class StudentModel {
	
	
	public List<Student> findAll() throws SQLException {
		
		QueryRunner queryRunner =  new QueryRunner(JDBCUtils.getDataSource());
		List<Student> list = queryRunner.query("select * from student", new BeanListHandler<Student>(Student.class));
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student.getSname());
			
		}
		return list;
	}
}
