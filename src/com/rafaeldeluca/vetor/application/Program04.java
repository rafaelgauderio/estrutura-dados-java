package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program04 {

	public static void main(String[] args) {

		Vetor vector = new Vetor(10);

		System.out.println(vector);
		
		vector.adiciona("Rafael");
		vector.adiciona("Julia");
		vector.adiciona("Claudia");
		vector.adiciona("Estrutudas de Dados");
		
		
		
		System.out.println("Tamanho do vetor " + vector.getSize());
		
		
		System.out.println(vector);

	}
	
	
	

}
