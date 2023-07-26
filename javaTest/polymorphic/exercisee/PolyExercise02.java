package javaTest.polymorphic.exercisee;


public class PolyExercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		System.out.println("s.count="+s.count);//20
		s.display();//20
		
		Base b = s;
		System.out.println(b==s);//true
		System.out.println("b.count="+b.count);//10
		b.display();//20
	}

}
class Base {//父类
	int count = 10;//属性
	public void display() {
		System.out.println(this.count);
	}
}
class Sub extends Base {//子类
	int count = 20;//属性
	public void display() {
		System.out.println(this.count);
	}
}