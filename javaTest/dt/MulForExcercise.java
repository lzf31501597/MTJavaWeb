package javaTest.dt;
import java.util.Scanner;
public class MulForExcercise {
	
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		//System.out.println("������༶��:");
		//int classNum = myScanner.nextInt();
		int classNum = 3;
		double sum2=0;
		int counts=0,sumCounts=0;
		int stuNum = 5;

		for(int i=1;i<=classNum;i++)  {
			double sum1 = 0;
			for(int j=1;j<=stuNum;j++)  {
				
				System.out.println("������༶"+i+"��"+j+"��ѧ���ĳɼ�:");
				double score = myScanner.nextInt();
				//sum1 += score;
				//System.out.println("�༶��"+number+"��ѧ���ķ���=" + score);
				if(score >= 60){
					counts++;
					//if(j == 5){
						//System.out.println("�༶"+i+"�ļ���������="+ counts);
						//counts = 0;
					//}
				}
				sum1 += score;
				System.out.println("�༶��"+j+"��ѧ���ķ���=" + score);

				//System.out.println("�༶"+i+"�ļ���������="+ counts);
				
				//System.out.println("�༶"+i+"��ƽ����="+ (sum1/5));
				//sum2 += sum1;
				//	sum1 = 0;
			}
			System.out.println("�༶"+i+"�ܳɼ�="+sum1+" ,ƽ����="+ (sum1/stuNum)
				+"�ļ���������="+ counts);
			sum2 += sum1;
			sumCounts += counts;
			counts = 0;
			//if(i == classNum){
			//	System.out.println(classNum+"���༶��ƽ����="+ (sum2/3/5));	
			//}
			
		}
		System.out.println(classNum+"���༶��ƽ����="+ (sum2/3/5)+"��������="+sumCounts);	
		
	}	
}