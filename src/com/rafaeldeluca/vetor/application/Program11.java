package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.Lista;

public class Program11 {
	
	public static void main(String [] args) {
		
		Lista<Contact> vector = new Lista<Contact>(1);
		
		Contact c1 = new Contact ("Rafael de Luca","51-983839420","rafael@gmail.com", "Av. Brasil 35");
		Contact c2 = new Contact ("Claudia de Luca","51-984539420","claudia@gmail.com", "Av. Principal 27");
		Contact c3 = new Contact ("Laura de Luca","51-983839123","laura@gmail.com", "Rua Primavera 82, apto:502");
		Contact c4 = new Contact ("Laura de Luca","51-983839123","laura@gmail.com", "Rua Primavera 82, apto:502");
		
		
		vector.adiciona(c1);
		vector.adiciona(c2);
		vector.adiciona(c3);
		vector.adiciona(c4);
		vector.adiciona(c1);
		
		System.out.println(vector);
	}
	
	

}
