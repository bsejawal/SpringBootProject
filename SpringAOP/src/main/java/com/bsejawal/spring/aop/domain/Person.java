package com.bsejawal.spring.aop.domain;

public class Person {

	private int id;
	private String name;

	public Person(){
		
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("I am a person");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
