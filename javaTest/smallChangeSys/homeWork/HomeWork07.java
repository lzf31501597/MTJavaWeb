package javaTest.smallChangeSys.homeWork;

public class HomeWork07 extends Test{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo().test();
		System.out.println("================");
		new Demo("john").test();
//	Test()
//	Demo()
//	super.name=Rose
//	this.name=Jack
//	================
//	super.name=john
//	this.name=Jack
				
	}
}

class Test {
	String name = "Rose";

	public Test() {
		System.out.println("Test()");
	}

	public Test(String name) {
		//super();
		this.name = name;
	}

}
class Demo extends Test{

	String name = "Jack";
	public Demo() {
		System.out.println("Demo()");
	}


	public Demo(String name) {
		super(name);

	}
	public void test() {
		System.out.println("super.name="+super.name);
		System.out.println("this.name="+this.name);
	}

//	public static void main(String[] args) {
//		new Demo().test();
//		System.out.println("================");
//		new Demo("john").test();
//	}

}