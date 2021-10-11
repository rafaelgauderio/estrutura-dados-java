package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program08 {

	public static void main(String[] args) {

		
		//capacidade pequena para verificar se o método increaseCapacity está funcionando quando
		// é necessário aumenta o vetor
		Vetor vector = new Vetor(3);


		System.out.println(vector.toString());

		vector.adiciona("B");
		vector.adiciona("C");
		vector.adiciona("E");
		vector.adiciona("F");
		vector.adiciona("G");

		System.out.println(vector.toString());		
		vector.adiciona(0,"A");
		vector.adiciona(3,"D");		
		vector.adiciona(7,"H");	
		vector.adiciona(8,"I");
		System.out.println(vector.toString());

	}

}
