package javaTest.smallChangeSys.homeWork.homeWork10;

public class HomeWork10 {

	public static void main(String[] args) {
		Docker docker1 = new Docker("tom",30,"it",'男',"2000");
		Docker docker2 = new Docker("toom",30,"it",'男',"2000");
		boolean b1 = docker1.equals(docker2);
		System.out.println(b1);
	}

}
