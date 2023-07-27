package javaTest.objectt;

public class EqualsExercise03 {

	public static void main(String[] args) {
		
		int it = 65;
		float fl = 65.0f;
		System.out.println("65 和 65.0f 是否相等?" + (it == fl));//T 基本数据类型，比较值相同

		char ch1 = 'A'; 
		char ch2 = 12;
		System.out.println("65 和‘A’是否相等?" + (it == ch1));//T 基本数据类型，比较值相同
		System.out.println("12 和 ch2 是否相等?" + (12 == ch2));//T 基本数据类型，比较值相同
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1 和 str2 是否相等?"+ (str1 == str2)); //F 对象不同
		System.out.println("str1 是否 equals str2?"+(str1.equals(str2)));//T 重写方法，比较是否为同一对象
		//System.out.println("hello" == new java.sql.Date()); //编译错误 数据类型不同
	}

}

