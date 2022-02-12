package com.rafaeldeluca.fila.application;

import com.rafaeldeluca.fila.Fila;

public class Program01 {
	
	public static void main(String [] args) {
		
		Fila<String> fila = new Fila<String>(15);
		
		System.out.println("Fila = FIFO = First In, First Out");
		System.out.println("Primeiro elemento a entrar é o primeiro a sair, como uma fila de banco.");
		System.out.println("Elemento novo é adicionado ao final da fila.");
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		fila.enfileira("Primeiro da fila");
		fila.enfileira("Segundo");
		fila.enfileira("Último da fila");
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		System.out.println(fila);
		
		
		
		
	}

}
