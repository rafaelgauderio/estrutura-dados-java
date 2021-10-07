package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program05 {

	public static void main(String[] args) {

		Vetor vector = new Vetor(10);

		vector.adiciona("Rafael");
		vector.adiciona("Julia");
		vector.adiciona("Claudia");
		vector.adiciona("Estrutudas de Dados");
		vector.adiciona("Algoritmos");
		
		
		
		
		System.out.println("posicao 3: " +vector.search(2));
		System.out.println("posicao 5: " +vector.search(4));
		//System.out.println("posicao 5: " +vector.search(80));
		//System.out.println("posicao 5: " +vector.search(-4));
		
		System.out.println(vector.toString());
		

	}	
	
	



}
