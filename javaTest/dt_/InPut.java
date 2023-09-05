package com.javaTest.dt_;
import java.util.Scanner;//������ı�ɨ�����İ�Scanner��
public class InPut {
	
	public static void main(String[] args) {
		//�����û�������
		//Scanner�����ڵİ� java.util��--���ı�ɨ����
		Scanner myScanner = new Scanner(System.in);

		System.out.println("������������");
		String name = myScanner.next();

		System.out.println("���������䣺");
		int age = myScanner.nextInt();

		System.out.println("������нˮ��");
		double sal = myScanner.nextDouble();

		System.out.println("�˵���Ϣ���£�");
		System.out.println("����=" + name);
		System.out.println("����=" + age);
		System.out.println("нˮ=" + sal);

	
	}
}