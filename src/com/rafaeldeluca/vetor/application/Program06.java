package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program06 {

	public static void main(String[] args) {
		Vetor vector = new Vetor(10);

		vector.adiciona("Rafael");
		vector.adiciona("Julia");
		vector.adiciona("Claudia");
		vector.adiciona("Mauro");
		vector.adiciona("Estrutudas de Dados");
		vector.adiciona("Algoritmos");		
		
		System.out.println(vector.toString());
		
		System.out.println(vector.busca("Rafael"));
		System.out.println(vector.busca("rafael"));
		System.out.println(vector.busca("Algoritmos"));
		System.out.println(vector.busca("leonardo"));
		
		
		
		

	}

}
