package javaTest.array;

import java.util.Scanner;

public class BubbleSort01 {

	public static void main(String[] args) {
		System.out.println("数组缩容");
		int[] arr = {24,69,80,57,13,7,77};
		
		for(int k = 0; k < arr.length; k++) {
			System.out.println("00arr["+k+"]=" + arr[k]);
		}
					
			int len = arr.length;
			int numMax = 0;
			int numMin = 0;
			System.out.println("len=" + arr.length);
			
			//排序-arr.length 和arr.length-1比较大小
			for(int i = len-1; i >=1; i--) {
				//System.out.println("--arr["+i+"]=" + arr[i]	+", 11arr["+(i-1)+"]=" + arr[i-1]);
				if ( arr[i] >= arr[(i-1)] ) {
					//numMax = arr[i];
					arr[i] = arr[i];
					arr[i-1] = arr[i-1];
					//System.out.println("11arr["+i+"]=" + arr[i]
					//		+", 11arr["+(i-1)+"]=" + arr[i-1]);
					
				} else if(arr[i] < arr[(i-1)]){
					numMax = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = numMax;
					//System.out.println("22arr["+i+"]=" + arr[i]
					//		+", 22arr["+(i-1)+"]=" + arr[i-1]);
				}
				for(int k = 0; k < len; k++) {
					System.out.print(arr[k] + "\t");
					
				}
				System.out.print("\n");
				//System.out.println("len=" + arr.length);
				//排序-arr.length 和arr.length-2比较大小
				for(int j = len-1; j >=2; j--) {
					//System.out.println("--arr["+i+"]=" + arr[i]	+", 11arr["+(i-1)+"]=" + arr[i-1]);
					if ( arr[j] >= arr[(j-2)] ) {
						//numMax = arr[i];
						arr[j] = arr[j];
						arr[j-2] = arr[j-2];
						//System.out.println("11arr["+j+"]=" + arr[j]
						//		+", 11arr["+(j-2)+"]=" + arr[j-2]);
					} else if(arr[j] < arr[(j-2)]){
						numMax = arr[j-2];
						arr[j-2] = arr[j];
						arr[j] = numMax;
						//System.out.println("22arr["+j+"]=" + arr[j]
						//		+", 22arr["+(j-2)+"]=" + arr[j-2]);
					}				
					//System.out.println("len=" + arr.length);
				}
				
			}
			//排序-arr.length 和arr.length-2比较大小
			/*for(int i = len-1; i >=2; i--) {
				//System.out.println("--arr["+i+"]=" + arr[i]	+", 11arr["+(i-1)+"]=" + arr[i-1]);
				if ( arr[i] >= arr[(i-2)] ) {
					//numMax = arr[i];
					arr[i] = arr[i];
					arr[i-2] = arr[i-2];
					System.out.print("11arr["+i+"]=" + arr[i]
							+", 11arr["+(i-2)+"]=" + arr[i-2]);
				} else if(arr[i] < arr[(i-2)]){
					numMax = arr[i-2];
					arr[i-2] = arr[i];
					arr[i] = numMax;
					System.out.println("22arr["+i+"]=" + arr[i]
							+", 22arr["+(i-2)+"]=" + arr[i-2]);
				}				
				//System.out.println("len=" + arr.length);
				
				
			}*/
			//排序-arr.length 和arr.length-1比较大小
			for(int i = len-1; i >=1; i--) {
				//System.out.println("--arr["+i+"]=" + arr[i]	+", 11arr["+(i-1)+"]=" + arr[i-1]);
				if ( arr[i] >= arr[(i-1)] ) {
					//numMax = arr[i];
					arr[i] = arr[i];
					arr[i-1] = arr[i-1];
					//System.out.println("11arr["+i+"]=" + arr[i]
					//		+", 11arr["+(i-1)+"]=" + arr[i-1]);
				} else if(arr[i] < arr[(i-1)]){
					numMax = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = numMax;
					//System.out.println("22arr["+i+"]=" + arr[i]
					//		+", 22arr["+(i-1)+"]=" + arr[i-1]);
				}				
				//System.out.println("len=" + arr.length);

			}
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] +"\t");
			}	
			
	}

}
