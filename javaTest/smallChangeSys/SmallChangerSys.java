package com.javaTest.smallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangerSys {
	// 化繁为简.
	// 1) 先完成显示菜单，并可以选择 
	// 2) 完成零钱通明细.
	// 3) 完成收益入账
	// 4) 消费
	// 5) 退出
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean loop = true;
		Scanner scanner = new Scanner(System.in);
		String key = "";
		
		// 2) 完成零钱通明细.
		// (1.可以把收益入账和消费，保存到数组。2.可以使用对象。3.简单的话可以使用String拼接) 
		String details = "-----------------零钱通明细-------------------";
		
		// 3) 完成收益入账 (完成功能驱动程序员，增加新的变化和代码)
		// 定义收益变量
		double money = 0;
		double balance = 0;
		Date date = null;  //date 是java.util.Date类型，表示日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化
		
		// 4) 消费
		//定义消费变量
		String note = "";
		
		// 1) 先完成显示菜单，并可以选择 
		do {
			System.out.println("\n\n================零钱通菜单===============");
			System.out.println("\t\t\t1 零钱通明细");
			System.out.println("\t\t\t2 收益入账");
			System.out.println("\t\t\t3 消费");
			System.out.println("\t\t\t4 退     出");
			
			System.out.println("请选择（1-4）：");
			key = scanner.next();
			
			
			
			//使用switch分支控制
			switch (key) {
				case "1" :
					//System.out.println("1 零钱通明细");
					System.out.println(details);
					break;
				case "2" :
					//System.out.println("2 收益入账");
					System.out.println("收益入账金额：");
					money = scanner.nextDouble();
					// money的值应该校验--（找出不正确金额条件，给出提示，直接break）
					if(money <= 0) {
						System.out.println("收益入账金额需要>0");
						break;
					}
					// money的值应该校验--（找出不正确和正确的金额条件，给出提示，直接break）
//					if(money > 0) {
//						balance += money;
//						//拼接收益信息入账信息到details
//					    date = new Date();//获取当前日期
//					    //System.out.println(sdf.format(date));
//					    details +=  "\n收益入账:\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
//					    //System.out.println(details);	
//					}else if(money <= 0) {
//						System.out.println("收益入账金额需要>0");
//						
//					}
					
				    balance += money;
				    
				    //拼接收益信息入账信息到details
				    date = new Date();//获取当前日期
				    //System.out.println(sdf.format(date));
				    details +=  "\n收益入账:\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
				    //System.out.println(details);		
					break;
				case "3" :
					//System.out.println("3 消费"); 
					System.out.println("消费金额：");
					money = scanner.nextDouble();
					// money的值应该校验--（找出不正确金额条件，给出提示，直接break）
					if(money <= 0 || money > balance) {
						System.out.println("您的消费金额，必须在0--" + balance +"之间。");
						break;
					}
					System.out.println("消费说明：");
					note = scanner.next();
					
					balance -= money;
					
					//拼接消费信息到details
					date = new Date();//获取当前日期
					
				    details +=  "\n" + note + "：\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
					
					
					break;
				case "4" :
					//System.out.println("4 退     出");
					//loop = false;
					//用户输入4退出时，给出的提示“你确定要退出吗？y/n”，必须输入正确的y/n
					//否则循环输入指令，直到输入y 或 n
					//1.定义接收用户输入的值的变量： choice
					//2.使用 while + break， 来处理接收到的y 或 n
					//3.退出while后，再判断choice是y还是n，就可以决定是否退出
					//4.建议一段代码，完成一个小功能，精良不要混在一起
					String choice = "";
					while(true) {//要求用户一直输入y/n,否则就一直循环
						System.out.println("你确定要退出吗？ y/n");
						choice = scanner.next();
						//判断输入的是y、n
						if("y".equals(choice) || "n".equals(choice)) {
							break;
						} 
						//判断输入的是y、n，和当用户退出while，进行判断
//						if("y".equals(choice)) {
//							loop = false;
//							break;
//						} else if ("n".equals(choice)) {
//							break;
//						}
						
					}
					//当用户退出while，进行判断
					if(choice.equals("y")) {
						loop = false;
					}
					break;
				default :
					System.out.println("输入的菜单编号有误，请重新选择");
					
			}
			
			
			
		}while(loop);

		System.out.println("--------------退出了零钱通---------------");
	}

}
