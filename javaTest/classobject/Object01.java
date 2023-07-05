package javaTest.classobject;

public class Object01 {

	public static void main(String[] args) {
		// 单独定义猫的属性和数组定义猫的属性----都不利于管理数据
		//单独定义猫的属性
		String catName1 = "小白";
		int catAge1 = 3;
		String catColor1 = "白色";
				
		String catName2 = "小花";
		int catAge2 = 2;
		String catColor2 = "花色"	;	
		//数组定义猫的属性
		String[] str1 = {"小白","3","白色"};
		String[] str2 = {"小花","2","花色"};
		
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

class Cat {
	String name;
	int age;
	String color;
	double weight;
}
