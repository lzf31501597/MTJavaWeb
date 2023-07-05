package javaTest.overload;

public class VarParameterExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		System.out.println("这是分别定义各科成绩的不可变参数方法+++++++++++++");
		s.showScores1("小明1", 66.0, 77.0);
		s.showScores1("小明2", 66.0, 77.0, 88.0);
		s.showScores1("小明3", 66.0, 77.0, 88.0, 99.0, 89.0);
		
		System.out.println("这是定义各科成绩的可变参数方法+++++++++++++");
		double[] arr1 = {66.0, 77.0};
		double[] arr2 = {66.0, 77.0, 88.0};
		double[] arr3 = {66.0, 77.0, 88.0, 99.0, 89.0};
		
		String res1 = s.showScores("小明1",arr1);
		System.out.println("main().res1=" + res1);
		String res2 = s.showScores("小明2",arr2);
		System.out.println("main().res1=" + res2);
		String res3 = s.showScores("小明3",arr3);
		System.out.println("main().res1=" + res3);
		
	}

}

class Student {
	
	//String name;
	double sum = 0;
	public String showScores(String name, double... scores) {
		//this.name = name; 
		System.out.println("Student.showScores()");
		for(int i=0; i<scores.length; i++) {
			
			System.out.println("这是:" + name + ", 的第"+(i+1)+"门课程的成绩:" 
					+ scores[i]);
			sum += scores[i];
		}
		return "这是"+ name + "的"+scores.length+"门课的总成绩分数:" +sum;
	}

	public String showScores1(String name, double scores1, double scores2) {
		//this.name = name; 
		System.out.print("Student.showScores12()");
		System.out.println("这是:" + name + ", 的第1门课程的成绩:" 
					+ scores1 +", 的第2门课程的成绩:" + scores2 );
		sum = scores1 + scores2 ;
		return "这是"+ name + "的总成绩分数:" +sum;
	}
	public String showScores1(String name, double scores1, double scores2, double scores3) {
		//this.name = name; 
		System.out.print("Student.showScores13()");
		System.out.println("这是:" + name + ", 的第1门课程的成绩:" 
					+ scores1 +", 的第2门课程的成绩:" + scores2 +", 的第3门课程的成绩:" + scores3 );		
		sum = scores1 + scores2 + scores3;
		return "这是"+ name + "的总成绩分数:" +sum;
	}
	public String showScores1(String name, double scores1, double scores2, double scores3, double scores4, double scores5) {
		//this.name = name; 
		System.out.print("Student.showScores15()");
		System.out.println("这是:" + name + ", 的第1门课程的成绩:" 
					+ scores1 +", 的第2门课程的成绩:" + scores2 
					+", 的第3门课程的成绩:" + scores3 +", 的第4门课程的成绩:" + scores4 
					+", 的第5门课程的成绩:" + scores5);	
		sum = scores1 + scores2 + scores3 + scores4 + scores5;
		return "这是"+ name + "的总成绩分数:" +sum;
	}
}
