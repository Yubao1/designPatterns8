package com.zhulu.test;

public class Development implements Department{
    public Development(Mediator mediator) {
    	mediator.register("development", this);
    }
	@Override
	public void selfAction() {
		System.out.println("Development---专心科研项目");
	}

	@Override
	public void outAction() {
		System.out.println("Development---没钱了，需要资金支持");
	}

}
