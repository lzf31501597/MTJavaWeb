package javaTest.overridee;

public class OverrideExercise{

	//1,子类的方法的参数，方法名称，要和父类方法的参数，方法名称完全一致。
	//2,子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类。
	//  父类的返回类型是object ，子类是String
	//3,子类方法不能缩小父类方法的访问权限
	public static void main(String[] agrs) {
		Person01 person = new Person01("kobe",39);
		System.out.println(person.say());
		Student student = new Student("james",38,01,88);
		System.out.println(student.say());		
	}
	
}

