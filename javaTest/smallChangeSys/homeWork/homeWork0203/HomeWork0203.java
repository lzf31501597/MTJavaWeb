package javaTest.smallChangeSys.homeWork.homeWork0203;

public class HomeWork0203 {
	//访问修饰符
	//1.public  公开      同包不同包，同类和子类，都可以访问
	//2.protected 受保护   同包，同类和子类，都可以访问；不同包不可以访问
	//3.默认              同包同类，都可以访问；不同包和子类，都不可以访问
	//4.private  私有     同类才可以访问，同包，不同包和子类，都不可以访问

	public static void main(String[] args) {
		Teacher teacher1 = new Professor("tom", 45, "教授", 20000); 
		System.out.println(teacher1.introduce());
		Teacher teacher2 = new Associate_Professor("green", 35, "副教授", 20000);
		System.out.println(teacher2.introduce());
		Teacher teacher3 = new Lecturer("james", 25, "讲师", 20000);
		System.out.println(teacher3.introduce());

	}

}
