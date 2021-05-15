package com.xe.demo;

public class Context {
	private String[] citys = { "深圳", "东莞" };
	private String[] persons = { "老人", "学生", "儿童" };
	private Expression cityPerson;

	public Context() {
		Expression city = new TerminalExpression(citys);
		Expression person = new TerminalExpression(persons);
		cityPerson = new AndExpression(city, person);
	}

	public void freeRide(String info) {
		boolean b = cityPerson.interpret(info);
		if (b) {
			System.out.println("这是" + info + "，本次进园旅游打5折！");
		} else {
			System.out.println(info + "，不属于享半价优惠人员，按原价收费");

		}
	}
}
