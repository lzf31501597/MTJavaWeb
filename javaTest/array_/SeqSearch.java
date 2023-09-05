package com.javaTest.array_;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		System.out.println("顺序查找--猜字游戏：");
		// 白眉鹰王，金毛狮王，紫衫龙王，青翼蝠王
		String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("输入你猜的名字：");
		String findName = myScanner.next();
		
		int index = -1;
		for(int i=0; i<names.length; i++) {
			if(findName.equals(names[i])) {  //精轮法王
				System.out.println("找到了你猜的名字："+ findName +", 下标为："+i);	
				index = i;
				break;
			} /*
				 * else { System.out.println("没有找到你猜的名字："+findName); continue; }
				 */
		}
		
		if (index == -1) {
			System.out.println("没有找到你猜的名字："+findName);
		}
		
	}

}
