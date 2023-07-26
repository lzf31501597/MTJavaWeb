package javaTest;

import java.util.Scanner;

public class Dianming {

	public static void main(String[] args) {
		//点名==take a roll call
		RollCall rc = new RollCall();
		rc.takeACall();

	}

}

//实行点名措施：
//1.班上20个学生实行点名，int[] student 
//2.随机获取学生名来点名，switch，不能有重复，
//3.一直要获取，直到输入空格键退出点名
class RollCall{
	
	public void takeACall() {
		String[] name = {"xiaozhang","xiaoli","xiaoliu","xiaozhao"};
		int stuNum = name.length;
		
		int[] student = new int[stuNum];
		
		for(int i=0; i<stuNum-1; i++) {
			System.out.println("student["+i+1+"]:" + student[i]);
		}
	}
	
	
	Scanner scanner = new Scanner(System.in);
	//System.out.println("请输入学生姓名编号1--20：");
	//System.out.println("xiaoliu");
	String str = scanner.nextLine();
	
	
	
	public void callNametoNum(int stuNum) {
		
		switch(stuNum) {
			
			case 1 :
				System.out.println("xiaoliu");
				break;
			case 2 :
				System.out.println("xiaoli");
				break;
			case 3 : 
				System.out.println("xiaozhao");
				break;
			case 4 :
				System.out.println("xiaozhang");
				break;
			default :
				System.out.println("xiaoliu");
				break;	
		}
	}
	
}