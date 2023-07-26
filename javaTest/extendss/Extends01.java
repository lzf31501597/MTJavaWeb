package javaTest.extendss;

public class Extends01 {

	//Graduate和Pupil的属性和方法有很多相同
	//继承：解决代码复用性：************
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pupil pupil = new Pupil();
		pupil.setScore(88);
		pupil.age = 10;
		pupil.name = "james";
		pupil.testing();
		pupil.showInfo();

		System.out.println("------------------");
		Graduate graduate = new Graduate();
		graduate.age = 22;
		graduate.setScore(90);
		graduate.name = "hanhan";
		graduate.testing();
		graduate.showInfo();
		
	}

}
