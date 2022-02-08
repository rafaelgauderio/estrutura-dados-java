package com.rafaeldeluca.vetor.labs;

import java.util.ArrayList;

import com.rafaeldeluca.vetor.Lista;

public class Exercicio02 {
	
	public static void main (String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		//array lista aceita dado repetidos
		// metodo lastIndexOf = mostra a posição da ultima vez que o elemento aparece na lista, retorna -1 se o elemento não
		// existe na lista
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("Joao");
		arrayList.add("A");
		arrayList.add("Joao");		
		
		System.out.println(arrayList.lastIndexOf("A"));
		System.out.println(arrayList.lastIndexOf("Joao"));
		System.out.println(arrayList.lastIndexOf("daadadas"));
		
		System.out.println("\n");
		
		Lista<String> newLista = new Lista<String>(5);
		newLista.adiciona("A");
		newLista.adiciona("B");
		newLista.adiciona("Joao");
		newLista.adiciona("A");
		newLista.adiciona("Joao");
		
		System.out.println(newLista.ultimoIndiceDe("A"));
		System.out.println(newLista.ultimoIndiceDe("Joao"));
		System.out.println(newLista.ultimoIndiceDe("dadasee"));		
		
		
		
		
		
	}

}
