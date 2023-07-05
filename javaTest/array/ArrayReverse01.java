package javaTest.array;


public class ArrayReverse01 {

	public static void main(String[] args) {
		System.out.println("整数翻转-规律-直接通过中间值，调换收尾相接的值");
		int[] arr = {11,22,33,44,55,66};
		//{66,22,33,44,55,11}
		//{66,55,33,44,22,11}
		//{66,55,44,33,22,11}
		int temp = 0;
		int len = arr.length + 1;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]=" + arr[i]);
		}
		
		for(int i = 1; i <= len/2; i++) {
			temp = arr[i-1];
			arr[i-1] = arr[len-i-1];
			arr[len-i-1] = temp;
			System.out.println("arr["+(i-1)+"]="+arr[i-1]+", arr["+(len-i-1)+"]="
					+arr[len-i-1]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]=" + arr[i]);
		}
		
		/*
		 * for(int i = 0; i < arr.length; i++) { System.out.println("arr["+i+"]=" +
		 * arr[i] +", arr["+arr.length+"]="+ arr[arr.length]); }
		 */
		
		
	}

}
