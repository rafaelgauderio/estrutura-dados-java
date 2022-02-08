package com.rafaeldeluca.vetor.labs;

import java.util.ArrayList;

import com.rafaeldeluca.vetor.Lista;

public class Exercicio05 {
	
	public static void main(String [] args) {
		
ArrayList<String> arrayList = new ArrayList<String>(5);
		
   	   //Fazer um método limpar, similar ao clear() do arraylist
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("Joao");
		arrayList.add("Rafael");
		arrayList.add("Claudia");		
		System.out.println(arrayList);
		
		arrayList.clear();
		System.out.println(arrayList);	
		
		System.out.println();
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("Joao");
		lista.adiciona("Rogerio");
		lista.adiciona("X");
		lista.adiciona("Javali");
		System.out.println(lista);
		
		lista.limpar();
		System.out.println(lista);
		
		
		
	}

}
