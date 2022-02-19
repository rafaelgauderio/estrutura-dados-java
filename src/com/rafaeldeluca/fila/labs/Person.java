package com.rafaeldeluca.fila.labs;

public class Person implements Comparable<Person>{


	private String name;
	private int priority;



	public Person(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setPriority(int priority) {
		this.priority = priority;
	}


	@Override
	public int compareTo(Person o) {

		if(priority > o.priority) {
			return 1;
		}

		else if(priority< o.priority) {
			return -1;
		}

		return 0;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", priority=" + priority + "]";
	}





}
