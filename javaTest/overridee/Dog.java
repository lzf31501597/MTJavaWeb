package javaTest.overridee;

public class Dog extends Animal {
	//重载和重写的比较
	//1,重载（overload）  范围：本类  方法名：必须一样  形参列表：类型，个数或者顺序至少有一个不同  
		//返回类型：无要求  修饰符：无要求  
	//2,重写（override）  范围：父子类  方法名：必须一样  形参列表：相同  
	//返回类型：子类重写的方法，返回的类型和父类返回的类型一致，或者是其子类  修饰符：子类方法不能缩小父类方法的访问范围。  
	
	
	
	// 1.Dog是Animal(父类)的子类
	// 2.子类Dog的cry方法和父类Animal的cry方法，定义的形式一样（名称，返回类型，参数）
	// 3.这是我们就说Dog的cry（），重写了Animal的cry（）

	public void cry() {
		System.out.println("小狗汪汪叫..");
	}

	//1,子类的方法的形参列表，方法名称，要和父类方法的参数，方法名称完全一致。
	//2,子类方法的返回类型和父类方法返回类型一样，或者是父类返回类型的子类。
	//  父类的返回类型是object ，子类是String
	//3,子类方法不能缩小父类方法的访问权限 public > protected > 默认 > private
//	public String m1() {
//		return null;
//		
//	}

	public Object m1() {
		return null;

	}

	// 这里Object不是String的子类，因此编译报错
	// AAA是没有被定义的类型
//	public Object m2() {
//		return null;
//	}

	public String m3() {
		return null;
	}

	
	// 子类方法不能缩小父类方法的访问权限 public > protected > 默认 > private
	protected void eat() {

	}
}

class AAA {

}

class BBB {

}
