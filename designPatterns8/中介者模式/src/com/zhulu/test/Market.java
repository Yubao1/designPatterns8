package com.zhulu.test;

public class Market implements Department{
    private Mediator mediator;
    public Market(Mediator mediator) {
    	this.mediator = mediator;
    	mediator.register("market", this);
    }
	@Override
	public void selfAction() {
		System.out.println("Market---跑市场");
	}

	@Override
	public void outAction() {
		System.out.println("Market---汇报工作，项目正在进度");
		mediator.command("finacial");
		mediator.command("development");
	}

}
