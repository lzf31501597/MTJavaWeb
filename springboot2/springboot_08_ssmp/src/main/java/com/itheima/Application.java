package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// System.out.println(Arrays.toString(args));

		/* String[] strs = new String[1];
		strs[0] = "--server.port=8080"; */
		// SpringApplication.run(Application.class, strs);

		//可以在启动Boot程序时，断开读取外部临时配置对应的入口，也就是去掉读取外部参数的形参传入值
		SpringApplication.run(Application.class);
	}

}
