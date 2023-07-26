package javaTest.extendss.improves;

import javaTest.extendss.Graduate;
import javaTest.extendss.Pupil;

public class Extends01 {
	
	//代码的复用性提高了
	//代码的扩展性和维护性提高了
	public static void main(String[] args) {
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
