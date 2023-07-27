package javaTest.objectt;

public class EqualsExercise02 {

	public static void main(String[] args) {
		
		Person02 p1 = new Person02(); 
		p1.name = "hspedu";
		Person02 p2 = new Person02();
		p2.name = "hspedu";
		
		System.out.println(p1 == p2);//false 引用类型判断对象是否相同
		System.out.println(p1.name.equals(p2.name));//true  重写了equals方法，比较的是字符串的值
		System.out.println(p1.equals(p2));//false 对象是否相同
		
		String s1 = new String("asdf");
		String s2 = new String("asdf");
		
		System.out.println(s1.equals(s2));//true  重写了equals方法，内容是否相同
		System.out.println(s1 == s2);//false  对象不同
	}

}

class Person02 {
	
	public String name;
	
}