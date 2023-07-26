package javaTest.polymorphic;

public class Poly01 {
	
	public static void main(String[] agrs) {
		
		Master master = new Master("tom");
		Dog dog = new Dog("大黄~");
		Bone bone = new Bone("大棒骨~");
		
		master.feed(dog, bone);
		
		Cat cat = new Cat("小花猫~");
		Fish fish = new Fish("小黄鱼~");
		master.feed(cat, fish);
		
		Pig pig = new Pig("小花猪");
		Rice rice = new Rice("米饭");
		master.feed(pig, rice);
	}
}
