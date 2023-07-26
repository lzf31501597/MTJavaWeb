package javaTest.extendss.exercise;

public class NotePad03 extends Computer03{
	private String color;

	
	public NotePad03(String cpu, int mem, int device, String color) {
		super(cpu, mem, device);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println("Pad的信息：" );
		System.out.println("内存：" + getCpu() + " ,内存：" + getMem() 
				+" ，磁盘：" + getDevice()+ " ,颜色：" + getColor() );
		//System.out.println(getDetails() + " ,颜色：" + getColor()  );
	}
}
