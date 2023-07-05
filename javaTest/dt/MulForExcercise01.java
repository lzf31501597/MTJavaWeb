package javaTest.dt;
import java.util.Scanner;
public class MulForExcercise01 {
	//99乘法表
	public static void main(String[] args) {

		//Scanner myScanner = new Scanner(System.in);
		//System.out.println("请输入班级数:");
		//int classNum = myScanner.nextInt();
		//int sum1=0,sum2=0;
		//int counts=0;

		for(int i=1;i<=9;i++)  {
			for(int j=1;j<=i;j++)  {
				System.out.print( i +" * "+ j +" = " +i*j +"\t");
				if(i == j){
					System.out.println(" ");
				}
			}
		}
	}	
}