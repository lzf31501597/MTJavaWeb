package javaTest.smallChangeSys.homeWork.homeWork08;

import java.util.Scanner;

public class HomeWork08 {
	
	boolean loop = true;
	Scanner scanner = new Scanner(System.in);
	String key = "";
	
	public static void main(String[] args) {
		
		
	}

	// 1) 先完成显示菜单，并可以选择 
	public void mainMenu() {
		// 1) 先完成显示菜单，并可以选择 
				do {
					System.out.println("================存取钱菜单===============");
					System.out.println("\t\t\t1 存钱");
					System.out.println("\t\t\t2 取钱");
					System.out.println("\t\t\t3 服务消");
					System.out.println("\t\t\t4 退     出");
					
					System.out.println("请选择（1-4）：");
					key = scanner.next();
					
					
					
					//使用switch分支控制
					switch (key) {
						case "1" :
							//System.out.println("1 零钱通明细");
							//this.details();
							break;
						case "2" :
							//System.out.println("2 收益入账");

							//this.income();
							break;
						case "3" :
							//System.out.println("3 消费"); 
							//this.pay();
							break;
						case "4" :
							//System.out.println("4 退     出");
							//this.exit();
							break;
						default :
							System.out.println("输入的菜单编号有误，请重新选择");
							
					}
					
					
					
				}while(loop);

				System.out.println("--------------退出了零钱通---------------");

	}
}
