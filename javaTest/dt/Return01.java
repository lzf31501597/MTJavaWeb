package javaTest.dt;

public class Return01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			if(i==3) {
				System.out.println("java教育"+ i);
				continue; //return; break;continue;
			}
			System.out.println("HelloWorld!!!"+ i);
		}
		System.out.println("go on");
	}
	//return/1、当return在方法中是，跳出当前方法；2、在main主方法，则跳出程序
	/*
	 * HelloWorld!!!1 
	 * HelloWorld!!!2 
	 * java教育3
	 */
	//break 终止for循环，执行main方法中for循环下面的代码
	/*
	 * HelloWorld!!!1 
	 * HelloWorld!!!2 
	 * java教育3 
	 * go on
	 */
	//continue; 终止本次循环，继续运行下次循环代码
	/*
	 * HelloWorld!!!2 
	 * java教育3 
	 * HelloWorld!!!4 
	 * HelloWorld!!!5 
	 * go on
	 */
}
