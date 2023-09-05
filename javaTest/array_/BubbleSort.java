package com.javaTest.array_;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("冒泡排序:隐藏了要比较的次数=N-2次");
		int[] arr = {24,69,80,57,13,7,77};
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+ "\t");
		}
		
			int len = arr.length;
			int numMax = 0;
			System.out.println("\nlen=" + arr.length);
			
			/*数组缩容
			24	69	80	57	13	7	77	
			len=7
			这是第1轮排序
			24	69	57	13	7	77	80	
			这是第2轮排序
			24	57	13	7	69	77	80	
			这是第3轮排序
			24	13	7	57	69	77	80	
			这是第5轮排序
			13	7	24	57	69	77	80	
			这是第4轮排序
			7	13	24	57	69	77	80
			*/
		//1-通过内外循环嵌套排序
		for(int j = 1; j <len-1; j++) {
			for(int i = 0; i <len-j; i++) {
				if ( arr[i] >= arr[(i+1)] ) {
					numMax = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = numMax;
				} else if(arr[i] < arr[(i+1)]){
					//numMax = arr[i+1];
					arr[i+1] = arr[i+1];
					arr[i] = arr[i];
					
				}
			}
			System.out.println("\n这是第"+j+"轮排序");
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] + "\t");
				
			}			
		}
			System.out.println("\n排序后的结果输出");
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] + "\t");
				
			}	
			
		//2-一步一步排序输出***********************	
			//24	69	57	13	7	77	80	
			for(int i = 0; i <len-1; i++) {
				if ( arr[i] >= arr[(i+1)] ) {
					numMax = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = numMax;
				} else if(arr[i] < arr[(i+1)]){
					//numMax = arr[i+1];
					arr[i+1] = arr[i+1];
					arr[i] = arr[i];
				}
				
			}
			System.out.println("\n这是第1轮排序");
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] + "\t");
				
			}
			
			//24	57	13	7	69	77	80
			for(int i = 0; i <len-2; i++) {
				if ( arr[i] >= arr[(i+1)] ) {
					numMax = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = numMax;
				} else if(arr[i] < arr[(i+1)]){
					//numMax = arr[i+1];
					arr[i+1] = arr[i+1];
					arr[i] = arr[i];
				}
				
			}
			System.out.println("\n这是第2轮排序");
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] + "\t");
				
			}
			
			//24	13	7	57	69	77	80
			for(int i = 0; i <len-3; i++) {
				if ( arr[i] >= arr[(i+1)] ) {
					numMax = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = numMax;
				} else if(arr[i] < arr[(i+1)]){
					//numMax = arr[i+1];
					arr[i+1] = arr[i+1];
					arr[i] = arr[i];
				}
				
			}
			System.out.println("\n这是第3轮排序");
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] + "\t");
				
			}
			
			//17	13	24	57	69	77	80
			for(int i = 0; i <len-5; i++) {
				if ( arr[i] >= arr[(i+1)] ) {
					numMax = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = numMax;
				} else if(arr[i] < arr[(i+1)]){
					//numMax = arr[i+1];
					arr[i+1] = arr[i+1];
					arr[i] = arr[i];
				}
				
			}
			System.out.println("\n这是第4轮排序");
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] + "\t");
				
			}
		    
			for(int i = 0; i <len-4; i++) {
				if ( arr[i] >= arr[(i+1)] ) {
					numMax = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = numMax;
				} else if(arr[i] < arr[(i+1)]){
					//numMax = arr[i+1];
					arr[i+1] = arr[i+1];
					arr[i] = arr[i];
				}
				
			}
			System.out.println("\n这是第5轮排序");
			for(int k = 0; k < len; k++) {
				System.out.print(arr[k] + "\t");
				
			}
	}

}
