package javaTest.extendss.exercise;

public class Computer03 {
	private String cpu;
	private int mem;
	private int device;
	
	public Computer03(String cpu, int mem, int device) {
		
		this.cpu = cpu;
		this.mem = mem;
		this.device = device;
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getMem() {
		return mem;
	}

	public void setMem(int mem) {
		this.mem = mem;
	}

	public int getDevice() {
		return device;
	}

	public void setDevice(int device) {
		this.device = device;
	}
	
	public void getDetails() {
		System.out.println("Computer的内存：" + getCpu() + " ,内存：" + getMem() 
				+" ，磁盘：" + getDevice());
		
	}
}
