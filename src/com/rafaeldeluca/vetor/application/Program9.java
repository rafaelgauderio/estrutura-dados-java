package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program9 {

	public static void main(String[] args) {
		
		Vetor vector = new Vetor(3);


		System.out.println(vector.toString());

		vector.adiciona("A");
		vector.adiciona("X");
		vector.adiciona("B");
		vector.adiciona("C");
		vector.adiciona("D");

		System.out.println(vector.toString());		
		
		vector.remove(1);
		
		System.out.println("\nVetor após remoção do elemento\n"+ vector.toString());

	}

}
