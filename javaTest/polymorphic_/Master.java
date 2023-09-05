package com.javaTest.polymorphic_;

public class Master {

	private String name;

	public Master(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//使用多态机制，可以统一的管理主人喂食的问题
	//animal编译类型是Animal，可以指向(接收)Animal的子类对象
	//food 编译类型是Food，可以指向（接收）Food子类对象
	public void feed(Animal animal, Food food) {
		System.out.println("主人："+name+"给"+animal.getName()+"吃"+food.getName());
	}
	
//	//主任喂小狗吃骨头
//	public void feed(Dog dog, Bone bone) {
//		System.out.println("主人："+name+"给"+dog.getName()+"吃"+bone.getName());
//	}
//	
//	//主任喂小狗吃骨头
//	public void feed(Cat cat, Fish fish) {
//		System.out.println("主人："+name+"给"+cat.getName()+"吃"+fish.getName());
//	}
	
	//如果动物很多，且实物很多
	// feed()的重载很多，代码复用性不高，不便于管理和维护
	// Pig --> Rice
	// Tiger --> Meat
	// 引出方法和对象具有多种形态
}
