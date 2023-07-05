package javaTest.array;

import java.lang.reflect.Array;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//各个数据类型的初始声明
				int n1 = 0;
				byte b2 = 0;
				short s3 =0;
				long l4 = 0;
				double d5 = 0.0;
				float f6 = (float) 0.0;
				char c7 = '\u0000';
				boolean bn8 = false;
				String str9 = null;
		
		/*double hens1 = 3;
		double hens2 = 5;
		double hens3 = 1;
		double hens4 = 3.4;
		double hens5 = 2;
		double hens6 = 50;
		double totalWeight = 0;
		
		
		totalWeight += hens1 + hens2 + hens3 + hens4 + hens5 + hens6;
		
		System.out.println("totalWeight="+ totalWeight);
		*/
		double[] hens = {3, 5, 1, 3.4, 2, 50}; //静态初始化
		System.out.println("hens.length="+ hens.length);
		//遍历数组==取出数组里面吗的元素值
		for(int i = 0; i < hens.length; i++) {
			System.out.println("hens["+i+"]=" + hens[i]);
		}
		
	}

}
