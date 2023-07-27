package javaTest.objectt;

public class Finalize01 {

	//1) 当对象被回收时，系统自动调用该对象的finalize方法。子类可以重写该方法，做一些释放资源的操作【演示】
	//2) 什么时候被回收:当某个对象没有任何引用时，则jvm就认为这个对象是一个垃圾对象，
		//就会使用垃圾回收机制来 销毁该对象，在销毁该对象前，会先调用 finalize 方法。
	//3) 垃圾回收机制的调用，是由系统来决定(即有自己的GC算法),也可以通过System.gc()主动触发垃圾回收机制，
		//测 试:Car [name]
	//  老韩提示: 我们在实际开发中，几乎不会运用 finalize , 所以更多就是为了应付面试. 代码:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car("bmw");
		//这时 car 对象就是一个垃圾,垃圾回收器就会回收(销毁)对象, 在销毁对象前，会调用该对象的 finalize 方法 
		//,程序员就可以在 finalize 中，写自己的业务逻辑代码(比如释放资源:数据库连接,或者打开文件..) 
		//,如果程序员不重写 finalize,那么就会调用 Object 类的 finalize, 即默认处理
		//,如果程序员重写了 finalize, 就可以实现自己的逻辑
		bmw = null;
		System.gc();//主动调用垃圾回收器  
		System.out.println("程序推出了。。。。。。。。"); 
	}

}

class Car {
	private String name;

	public Car(String name) {
		//super();
		this.name = name;
	}
	@Override
	public void finalize() throws Throwable{
		System.out.println("我们销毁 汽车" + name ); 
		System.out.println("释放了某些资源...");
	}
	
}