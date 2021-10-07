package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program07 {

	public static void main(String[] args) {
		
		Vetor vector = new Vetor(10);
		
		
		System.out.println(vector.toString());

		vector.adiciona("B");
		vector.adiciona("C");
		vector.adiciona("E");
		vector.adiciona("F");
		vector.adiciona("G");
		
		
		
		System.out.println(vector.toString());		
		vector.adiciona(0,"A");
		vector.adiciona(3,"D");
		
		
		System.out.println(vector.toString());
		vector.adiciona(7,"H");		
		System.out.println(vector.toString());
	

	}

}
