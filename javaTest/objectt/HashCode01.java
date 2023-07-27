package javaTest.objectt;

public class HashCode01 {

	public static void main(String[] args) {
		// 1) 提高具有哈希结构的容器的效率!
		// 2) 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的! 
		// 3) 两个引用，如果指向的是不同对象，则哈希值是不一样的
		// 4) 哈希值主要根据地址号来的!，不能完全将哈希值等价于地址。
		// 5) 案例演示[HashCode_.java]: obj.hashCode() [测试:A obj1 = new A(); A obj2 = new A(); A obj3 = obj1] 
		AA aa1 = new AA(); 
		AA aa2 = new AA(); 
		AA aa3 = aa1;
		System.out.println("aa1.hashCode()=" + aa1.hashCode());//1407343478
		System.out.println("aa2.hashCode()=" + aa2.hashCode());//183264084
		System.out.println("aa3.hashCode()=" + aa3.hashCode());//1407343478
		// 6) 后面在集合，中hashCode如果需要的话，也会重写,在讲解集合时，老韩在说如何重写hashCode() 代码

	}

}

class AA{
	
}