package javaTest.smallChangeSys.homeWork.homeWork10;

public class Docker {
	
	private String name;
	private int age;
	private String job;
	private char gender;
	private String sal;
	public Docker(String name, int age, String job, char gender, String sal) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.gender = gender;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	public boolean equals(Object obj) {
		Docker docker = (Docker) obj;
		
		if(this.equals(docker)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
}