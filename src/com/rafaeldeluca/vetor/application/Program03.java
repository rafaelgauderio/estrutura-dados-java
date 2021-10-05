package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Vetor;

public class Program03 {

	public static void main(String [] args) {

		Vetor vector = new Vetor(2);
		
		try {
			
			vector.adiciona("Rafael");
			vector.adiciona("Julia");
			vector.adiciona("Claudia");
			vector.adiciona("Estrutudas de Dados");
			
		} catch (Exception error) {
			
			error.printStackTrace();
			
		}		
	

	}

}
