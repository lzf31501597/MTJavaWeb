package javaTest.array;


public class ArrayReverse02 {

	public static void main(String[] args) {
		System.out.println("整数翻转--逆序赋值");
		int[] arr = {11,22,33,44,55,66};
		//{66,22,33,44,55,11}
		//{66,55,33,44,22,11}
		//{66,55,44,33,22,11}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]=" + arr[i]);
		}
		
		int len = arr.length;
		int[] arr2 = new int[len];
		
		for(int i = len -1, j = 0; i >=0; i--,j++) {
			arr2[j] = arr[i];
			System.out.println("arr2["+j+"]=" + arr2[j]);
		}
		
		arr = arr2;
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]=" + arr[i]);
		}
		
	}

}
