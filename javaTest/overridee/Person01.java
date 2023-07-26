package javaTest.overridee;

public class Person01 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String say() {
		return "自我介绍，我叫："+ name +" ，年龄：" +age;
	}

}
