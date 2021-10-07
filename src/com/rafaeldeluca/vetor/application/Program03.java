package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program03 {

	public static void main(String [] args) {

		Vetor vector = new Vetor(4);
		
		try {
			
			vector.adiciona("Rafael");
			vector.adiciona("Julia");
			vector.adiciona("Claudia");
			vector.adiciona("Estrutudas de Dados");
			
			System.out.println(vector.toString());
			
		} catch (Exception error) {
			
			error.printStackTrace();
			
		}		
	

	}

}
