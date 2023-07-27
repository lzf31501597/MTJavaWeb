package javaTest.objectt;

public class toString01 {

	public static void main(String[] args) {
		/*
		Object 的 toString() 源码
		(1)getClass().getName() 类的全类名(包名+类名 ) 
		(2)Integer.toHexString(hashCode()) 将对象的 hashCode 值转成 16 进制字符串 
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode()); 
		}
		*/
		Monster monster = new Monster("小妖怪", "巡山的", 1000);
		System.out.println("monster.toString()=" + monster.toString() + " hashCode=" + monster.hashCode());
		//monster.toString()=javaTest.objectt.Monster@5eb5c224 
		//hashCode=1588970020
		
		System.out.println("==当直接输出一个对象时，toString 方法会被默认的调用=="); 
		System.out.println(monster); //等价 monster.toString()
	}

}

class Monster {
	private String name;
	private String job;
	private int salary;
	
	public Monster(String name, String job, int salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() { //重写后，一般是把对象的属性值输出，当然程序员也可以自己定制
		return "Monster{" +
				"name='" + name + '\'' +
				", job='" + job + '\'' +
				", salary=" + salary +
				'}';
		
	}
}