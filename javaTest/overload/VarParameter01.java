package javaTest.overload;

public class VarParameter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HspMethod hm = new HspMethod();
		int max = hm.max(2,5,3,6,9,7,10);
		System.out.println("main()。max=" + max);
		
		int max1 = hm.max1(2,5,3,6,9,7,10);
		System.out.println("main()。max1=" + max1);
		
		int sum = hm.sum(2,5,3,6,9,7,10);
		System.out.println("main()。sum=" + sum);
	}

}

class HspMethod {
	//三个方法名称相容，功能相同，参数个数不通--》使用可变参数优化
	public int max1(int a, int b) {
		return a > b ? a : b;		
	}
	public double max1(double a, double b) {
		return a > b ? a : b;	
	}
	public double max1(double a, double b, double c) {
		double max = a > b ? a : b;
		return max > c ? max : c ;
	}
	
	public int max(int... nums) {
		int max = 0;
		for(int i=0; i<nums.length-2; i++) {
			max = nums[i] > nums[i+1] ? nums[i] : nums[i+1];
			max = (nums[i] > nums[i+1] ? nums[i] : nums[i+1]) > nums[i+2] ? (nums[i] > nums[i+1] ? nums[i] : nums[i+1]) : nums[i+2] ;
			System.out.println("HspMethod。max=" + max);
		}
		return max;
	}
	
	
	public int max1(int... nums) {
		int max1 = 0;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] >= nums[i+1]) {
				max1 = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = max1;
			}else {
				max1 = nums[i+1];
				nums[i] = nums[i];
				nums[i+1] = nums[i+1];
			}
			//max = nums[i] > nums[i+1] ? nums[i] : nums[i+1];
			System.out.println("HspMethod。max1=" + max1);
		}
		return max1;
	}	
	
	public int sum(int... nums) {
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			System.out.println("HspMethod。sum=" + sum);
		}
		return sum;
	}
}
