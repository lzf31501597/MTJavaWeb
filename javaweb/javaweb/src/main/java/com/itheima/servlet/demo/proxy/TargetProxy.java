package com.itheima.servlet.demo.proxy;

public class TargetProxy implements ITarget {
	
	private ITarget target;
	
	public TargetProxy(ITarget target) {
		this.target = target;
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		target.show();
	}

}

