package javaTest.polymorphic.detaill;

public class PolyDetail {
	
	public static void main(String[] args) {
		
		//1，向上转型： 父类的引用指向了子类的对象
		//2，语法： 父类类型 应用名 = new 子类类型（）；
		
		//1，向下转型：语法：子类类型  引用名 = （子类类型）父类引用
		//2，只能强制转换父类的引用，不能强转父类的对象
		//3，要求父类的引用，必须指向的是当前当前目标类型的对象
		//4，当向下转型后，可以调用子类类型中所有的成员
		
		Animal animal = new Cat();
		Object obj = new Cat(); //Object 也是Cat类的父类
		//多态向上转型
		//特点：1，可以调用父类中的所有成员（需遵循访问权限）
		//2，但是不能调用子类的特有成员
		//3，因为在编译阶段，能调用哪些成员，是由编译类型来决定的
		//animal.catchMouse(); //子类的特有的方法不能调用，编译报错
		//最终的运行结果，要看子类（运行类型）的具体实现:即调用方法时，按照从子类（运行类型）开始查找方法
		//然后调用，规则我前面我们讲的方法调用规则一致
		System.out.println("多态向上转型================");
		animal.eat();  //猫吃鱼。。。。
		animal.run();  //跑。。。。
		animal.show();  //hello，你好！！！
		animal.sleep();  //睡。。。。
		
		//**********希望调用Cat的catchMouse（）方法
		//多态向下转型
		// 1，向下转型：语法：子类类型  引用名 = （子类类型）父类引用
		// 2，只能强制转换父类的引用，不能强转父类的对象
		// 3，要求父类的引用，必须指向的是当前当前目标类型的对象
		// 4，当向下转型后，可以调用子类类型中所有的成员
		System.out.println("多态向下转型==================");
		// 1，向下转型：语法：子类类型  引用名 = （子类类型）父类引用
		Cat cat = (Cat) animal;
		cat.catchMouse();
		// 2，要求父类的引用，必须指向的是当前当前目标类型的对象
		Dog dog = (Dog) animal; //java.lang.ClassCastException  运行报错
	}
	
}
