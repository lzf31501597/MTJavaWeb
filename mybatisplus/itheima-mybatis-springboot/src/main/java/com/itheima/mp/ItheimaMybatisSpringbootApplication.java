package com.itheima.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("com.itheima.mp.mapper")
@SpringBootApplication
public class ItheimaMybatisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItheimaMybatisSpringbootApplication.class, args);
	}

}
