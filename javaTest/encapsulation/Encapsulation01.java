package javaTest.encapsulation;

public class Encapsulation01 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setAge(30);
		person.setName("james");
		person.setSalary(20000.0);
		person.setJob("it");
		
		System.out.println(person.info());
		System.out.println(person.getName());
		
		Person person2 = new Person("simith", 30, 30000.0, "IT");
		System.out.println(person2.info());
		
	}
	
}


//Person类
class Person {
	
	
	public Person() {
		
	}
	
	public Person(String name, int age, double salary, String job) {
		
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//		this.job = job;
		setName(name);
		setAge(age);
		setSalary(salary);
		setJob(job);
	}


	public String name; //名字共有化
	private int age; //年龄私有化
	private double salary; //薪水私有化
	private String job; //工作私有化
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//加入对数据的校验
		if(name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		} else {
			System.out.println("名字不符合长度！！！，需要输入2-6长度，默认位无名");
			this.name = "无名";
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 1 && age <=120) {
			this.age = age;
		}else {
			System.out.println("你输入的年龄要在1--120之间，默认为18");
			this.age = 18;
		}
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public String info() {
		return "信息为 name:"+ name + ", age:" +age + ", salary:" + salary + ", job:" +job;
	}
	
	
}