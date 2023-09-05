package com.javaTest.recursion_;

public class Recursion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		int n = 64;
		int res = t.fibonacci(n);
		if(res != -1) {
			System.out.println("第"+n+"位的res=" + res);
		}
		
		int day=1;
		int peach = t.eatPeach(day);
		if(peach != -1) {
			System.out.println("第"+day+"位的peach=" + peach);
		}
	}

}

class Test {
	//斐波那契数列（Fibonacci sequence），又称黄金分割数列，因数学家莱昂纳多·斐波那契（Leonardo Fibonacci）
	//以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34
	//F(0)=1，F(1)=1, F(n)=F(n - 1)+F(n - 2)（n ≥ 2，n ∈ N*）
	public int fibonacci(int n) {
		if(n>=1) {
			if(n==1 || n==2) {
				return 1;
			}else {
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}else {
			System.out.println("请输入n>=1的整数");
			return -1;
		}
		
	}
	
	//一堆桃子，猴子每天吃一半+1，当迟到第10天的时候，只有1个桃子了
	//day=10  1
	//day=9 (1+1)*2=4
	//day=8 (4+1)*2=10 依次类推。。。
	public int eatPeach(int day) {
		
		if(day==10) {
			return 1;
		}else if(day>=1 && day<=9) {
			return (eatPeach(day)+1) *2;
		}else {
			System.out.println("请输入day>=1的整数");
			return -1;
		}
		
	}
	
}