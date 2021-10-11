package com.rafaeldeluca.vetor.application;

import com.rafaeldeluca.vetor.VetorObjetos;

public class Program10 {
	
	public static void main(String [] args) {
		
		
		
		VetorObjetos vector = new VetorObjetos(3); 
		
		//Autoboxing = passar um tipo primitivo e ele ser transformado em um objeto
		
		vector.adiciona(17);
		vector.adiciona(12);
		vector.adiciona("Rafael de Luca");
		vector.adiciona(34.2);
		
		
		System.out.println("Size = " + vector.getSize());
		System.out.println("\n"+vector);
		
		
		Contact c1 = new Contact ("Rafael de Luca","51-983839420","rafael@gmail.com", "Av. Brasil 35");
		Contact c2 = new Contact ("Claudia de Luca","51-984539420","claudia@gmail.com", "Av. Principal 27");
		Contact c3 = new Contact ("Laura de Luca","51-983839123","laura@gmail.com", "Rua Primavera 82, apto:502");
		Contact c4 = new Contact ("Laura de Luca","51-983839123","laura@gmail.com", "Rua Primavera 82, apto:502");
		
		VetorObjetos vetorContatos = new VetorObjetos(2);
		vetorContatos.adiciona(c1);
		vetorContatos.adiciona(c2);
		vetorContatos.adiciona(c3);
		
		System.out.println(vetorContatos);
		
		//Devido a implementacação do médoto equal, mesmo c3 e c4 ocupando referencias de memorias diferentes, desde 
		//que todos atributos sejam iguais.
		
		int position = vetorContatos.busca(c4);
		if (position > -1) {
			System.out.println("\nElemento existe no vetor");
		}
		else {
			System.out.println("\nElemento NÃO existe no vetor");
		}
		
		
		
		
		
		
		
		
		
	}

}
