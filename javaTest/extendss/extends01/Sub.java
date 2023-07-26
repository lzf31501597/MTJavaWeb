package javaTest.extendss.extends01;

public class Sub extends Base{
	//继承的细节：
	//1，子类继承了父类所有的属性和方法，非私有属性和方法能在子类直接访问，
	//但是私有属性和方法不能在子类直接访问，要通过公共的方法去访问（间接访问 ）
	//2.子类必须调用父类的构造器，完成父类的初始化
	//3，当创建子对象时，不管使用子类的哪个构造器，默认情况下，总会去调用父类的无参构造器，
	//则必须在子类的构造器中，用super去指定使用父类的哪个构造器完成对父类的初始化，否则，编译不会通过。
	//4,如果希望指定去调用父类的某个构造器，则显示的调用一下:super(参数列表)
	//5，super在使用时，必须放在构造器的第一行（super只能在构造器里面使用）
	//6，super（）和this（）都只能放在构造器的第一行，因此这两个方法不能共存一个构造器
	//7，java所有类都是object类的子类，object是所有类的基类
	//8，父类构造器的调用不限于直接父类！将一直往上追溯直到object类（顶级父类）
	//9，子类最多只能继承一个父类（指直接继承），即java当中是《单继承机制》
	//思考：如何让A类继承B类和C类   （A extends B，B extends C）
	//10，不能滥用继承，子类和父类之间必须满足is-a的逻辑关系
	//
	//
	//
	
	public Sub(String name,int age) {//有参构造器
		//1，调用父类的无参构造器，或什么也不写，默认调用super（）
		//super(); //父类无参构造器
		
		//2.调用父类的Base(String name)构造器
		//super("asd");
		
		//3. 调用父类的Base(String name,int age)构造器
		super("asd",22);
		
		System.out.println("子类Sub(String name,int age)构造器被调用....");
			
	}
		
	//2，子类必须调用父类的构造器，完成父类的初始化
	
	public Sub() { //无参构造器  //隐式超级构造函数 Base() 未定义。必须显式调用另一个构造函数(父类没有无参构造器 )
		//super();//默认调用父类的无参构造器（隐藏了这句话）
		super("simith", 10);
		System.out.println("子类Sub()构造器被调用....");
	}
	//3，当创建子对象时，不管使用子类的哪个构造器，默认情况下，总会去调用父类的无参构造器，
	//则必须在子类的构造器中，用super去指定使用父类的哪个构造器完成对父类的初始化，否则，编译不会通过。
	public Sub(String name) {//有参构造器
		super("james",20);
		// do noting
		System.out.println("子类Sub(String name)构造器被调用....");
		
	}
//	//1，调用父类的无参构造器，或什么也不写，默认调用super（）
//	public Sub(String name,int age) {//有参构造器
//		//super(); //父类无参构造器
//		System.out.println("子类Sub(String name,int age)构造器被调用....");
//		
//	}
	public void sayOk() {
		
		//非私有的属性和方法可以在子类直接访问
		//但是私有属性和方法不能在子类直接访问
		System.out.println("n1=" + n1 + " ,n2=" + n2 + " ,n3=" + n3);
		test100();
		test200();
		test300();
		//test400(); 受保护的方法，没有访问权限
		//要通过父类提供public方法去访问
		System.out.println("n4=" +getN4());
		callGetN4();
		
	}
	
}
