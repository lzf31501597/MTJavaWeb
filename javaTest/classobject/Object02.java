package javaTest.classobject;

public class Object02 {

	public static void main(String[] args) {
		Car car = new Car();
		car.name = "保时捷";
		car.color = "紫色";
		car.price = 100000;
		
		System.out.println("car:"+car.name+", "+car.color+", "+car.price);
		//实例化猫对象
				Cat cat1 =new Cat();
				cat1.name = "小白";
				cat1.age =  3;
				cat1.color = "白色";
				cat1.weight = 60;
				System.out.println("cat1:"+cat1.name+", "+cat1.age+", "+cat1.color+", "+cat1.weight);
				
				Cat cat2 =new Cat();
				cat2.name = "小花";
				cat2.age = 2;
				cat2.color = "花色";
				cat2.weight = 30;
				System.out.println("cat2:"+cat2.name+", "+cat2.age+", "+cat2.color+", "+cat2.weight);
					
		
		
	}
}

class Car {
	String name;
	String color;
	double price;
}
