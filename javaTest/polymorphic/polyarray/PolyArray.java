package javaTest.polymorphic.polyarray;

public class PolyArray {
	//11,多态数组
	public static void main(String[] args) {
		// 应用实例:现有一个继承结构如下:要求创建 1 个 Person 对象、
		// 2 个 Student 对象和 2 个 Teacher 对象, 统一放在数组 中，并调用每个对象
		
		Person[] person = new Person[5];
		person[0] = new Person("jack",20);
		person[1] = new Student("mary",18,100);
		person[2] = new Student("smith",19,30.1);
		person[3] = new Teacher("scott",30,20000);
		person[4] = new Teacher("king",50,25000);
		
		for(int i = 0; i < person.length; i++) {
			System.out.println(person[i].say());//动态绑定机制
			
			if(person[i] instanceof Student) {
				Student student = (Student) person[i];
				student.stuty();
			} else if (person[i] instanceof Teacher) {
				Teacher teacher = (Teacher) person[i];
				teacher.teach();
			} else if (person[i] instanceof Person) {
				//System.out.println("你的类型有误，请自己检查。。。。。。");
			} else {
				System.out.println("你的类型有误，请自己检查。。。。。。");
			}
		}
		
	}

}
