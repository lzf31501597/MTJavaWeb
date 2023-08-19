package javaTest.smallChangeSys.homeWork;

public class HomeWork07 extends Test{

	String name = "Jack";
	public HomeWork07() {
		super();
		System.out.println("HomeWork07()");
	}


	public HomeWork07(String name) {
		super(name);
		
	}
	public void test() {
		System.out.println("super.name="+super.name);
		System.out.println("this.name="+this.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HomeWork07().test();
		System.out.println("================");
		new HomeWork07("john").test();
				
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
