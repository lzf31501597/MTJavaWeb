package javaTest.pkg;

import java.lang.*; //*******lang包是基本包，默认引入，不需要再引入
import java.util.*; //util包是系统提供的工具包，工具类，使用Scanner
import java.net.*; //网络包，网络开发
import java.awt.*; //是做java的界面开发，GUI

public class Import01 {

	public static void main(String[] args) {
		//使用系统提供的Arrays，给数组排序
		int[] arr = {-1, 20, 2, 1, 100, 90, 78};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
	}

}
