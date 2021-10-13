package com.rafaeldeluca.vetor.application;

import java.util.ArrayList;

public class Program12 {

	public static void main(String [] args) {

		System.out.println("Collections: estruturas de dados prontas do java." );

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Rafael");
		arrayList.add("De Luca");		
		System.out.println(arrayList);		
		arrayList.add(1, "Da Silva");
		arrayList.add("Claudinha");
		arrayList.add("Loureiro");
		System.out.println(arrayList);		
		arrayList.remove(1);
		arrayList.remove("Loureiro");
		System.out.println(arrayList);

		boolean exist = arrayList.contains("Rafaela");		
		if (exist==true) {
			System.out.println("ELemento 'Rafaela'existe no array");
		}

		else {
			System.out.println("Elemento 'Rafaela' NÃO existe no array");
		}

		int position = arrayList.indexOf("De Luca");
		if (position > -1) {
			System.out.println("ELemento existe no array na posição " + position);
		}

		else {
			System.out.println("Elemento NÃO existe no array " + position);
		}
		
		//Busca retornando o objeto
		System.out.println(arrayList.get(1));
		
		System.out.println("Tamano da lista é " + arrayList.size());

	}

}
