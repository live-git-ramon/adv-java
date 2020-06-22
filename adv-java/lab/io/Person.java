package io;

import java.io.Serializable;

class Person implements Serializable
{
	// declare fields
	private String name;
	private int age;
	private char gender;
	
	// parameterized constructor
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}