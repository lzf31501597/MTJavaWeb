package javaTest.extendss.exercise;

public class ExtendsExercise02 {
	public static void main(String []args) {
		CC c =new CC(); //找无参构造器
	}
}

class AA {
	public AA() {//super();默认调用父类无参构造函数super();
		System.out.println("我是 AA类的无参构造");//1
	}
}
 
class BB extends AA {
	public BB() {
		System.out.println("我是 BB类的无参构造");
	}
	public BB(String name) {//super();默认调用父类无参构造函数super();
		System.out.println(name + "我是 BB类的有参构造");//2
	}
}

class CC extends BB {//main 方法中: C c =new C(); 输出么内容? 3min 
	public CC() {
		this("hello");
		System.out.println("我是 CC类的无参构造");//4
	}
	public CC(String name) {
		super("haha");
		System.out.println("我是 CC类的有参构造");//3
	}
}

/*
*输出如下——：
我是 AA类的无参构造
hahah我是 BB类的有参构造
我是 CC类的有参构造
我是 CC类的无参构造
*/