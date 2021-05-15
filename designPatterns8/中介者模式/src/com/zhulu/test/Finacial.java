package com.zhulu.test;

public class Finacial implements Department{
    public Finacial(Mediator mediator) {
    	mediator.register("finacial", this);
    }
	@Override
	public void selfAction() {
		System.out.println("Finacial---数钱");
	}

	@Override
	public void outAction() {
		System.out.println("Finacial---汇报工作，出账");
	}

}
