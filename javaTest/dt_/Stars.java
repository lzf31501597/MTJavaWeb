package com.javaTest.dt_;
import java.util.Scanner;
public class Stars {
	//99�˷���
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������ӡ���ǵĲ���:");
		int totalLevel = myScanner.nextInt();
		//int sum1=0,sum2=0;
		//int counts=0;
		//ֱ��������---------
		/*for(int i=1;i<=totalLevel;i++)  {
			for(int j=1;j<=i;j++)  {
				System.out.print("*");
				//if(i == j){
				//	System.out.println("");
				//}
			}
			System.out.println("");
		}*/

		//������
		//System.out.println("�������ӡ���ǵ�����:");
		//int colLevel = myScanner.nextInt();
		
		/*for(int row = 1; row < totalLevel; row++)  {
			System.out.println("*****");
			
		}*/
		//����������-1
		/*for(int row = 0; row < totalLevel; row++)  {

			for(int col = totalLevel; col > row; col--)  {
				System.out.print(" ");
			}

			for(int col = totalLevel - row; col <= totalLevel; col++)  {
				System.out.print("* ");
			}
			System.out.println("");
		}*/
		//����������-2
		/*for(int i=1;i<=totalLevel;i++)  {

			for(int j = 1; j <= totalLevel - i; j++)  {
				System.out.print(" ");
			}

			for(int k = 1; k <= 2 * i - 1; k++)  {
				System.out.print("*");	
			}

			System.out.println("");
		}*/
		
		/*//����������
		for(int i=1;i<=totalLevel;i++)  {

			for(int j = 1; j <= totalLevel - i; j++)  {
				System.out.print(" ");
			}

			for(int j = 1; j <= 2 * i - 1; j++)  {
				if (j ==1 || j == 2 * i - 1 || i == totalLevel ){
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
				
			}

			System.out.println("");
		}*/
		//��������
		/*for(int i=1;i<=totalLevel;i++)  {

			for(int j = 1; j <= totalLevel - i; j++)  {
				System.out.print(" ");
			}

			for(int k = 1; k <= 2 * i - 1; k++)  {
				if (k ==1 || k == 2 * i - 1  ){
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}

			System.out.println("");
		}
		for(int i=1;i<=totalLevel-1;i++)  {
			for(int k = 1; k <= i; k++)  {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2 * (totalLevel-1) - 2*i +1; j++)  {
				if (j ==1 || j == 2 * (totalLevel-1) - 2*i +1  ){
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}*/
		//��ʵ������
		for(int i=1;i<=totalLevel;i++)  {

			for(int j = 1; j <= totalLevel - i; j++)  {
				System.out.print(" ");
			}

			for(int k = 1; k <= 2 * i - 1; k++)  {
				System.out.print("*");	
				
			}

			System.out.println("");
		}
		for(int i=1;i<=totalLevel-1;i++)  {
			for(int k = 1; k <= i; k++)  {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 2 * (totalLevel-1) - 2*i +1; j++)  {
				System.out.print("*");	
				
			}
			System.out.println("");
		}
		/*//����+ֱ��������--------------
		for(int i=1;i<=totalLevel;i++)  {
			for(int k=1;k<=totalLevel;k++)  {
				System.out.print("*");
				if(i == k){
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=i;j++)  {
				System.out.print("*");
				if(i == j){
					System.out.println("");
				}
			}
		}*/
		//����
		/*for(int i=1;i<=totalLevel;i++)  {

			for(int k = 0; k <= totalLevel -i; k++)  {
				System.out.print(" ");
			}
			for(int j = 2 * totalLevel - 1; j >= 1; j--)  {
				System.out.print("*");
			}

			

			System.out.println("");
		}*/
	}	
}