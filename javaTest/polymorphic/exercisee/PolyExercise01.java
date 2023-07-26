package javaTest.polymorphic.exercisee;


public class PolyExercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 13.4;//ok
		long l = (long)d;//ok
		System.out.println(l);//13
		
		int in =5;//ok
		//boolean b = (boolean)in;//整数类型不能强制转换布尔型
		
		Object obj = "Hello";//ok,向上转型
		String objStr = (String) obj;//ok，向下转型
		System.out.println(objStr);//Hello
		
		Object objPri = new Integer(5);//OK，向上转型
		//String str = (String) objPri; //Integer -不能强制转换-> String
		Integer str1 = (Integer) objPri;//ok，向下转型
		System.out.println(str1);//5
	}

}
