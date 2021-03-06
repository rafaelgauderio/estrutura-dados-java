package com.rafaeldeluca.fila.application;

import com.rafaeldeluca.fila.Fila;

public class Program02 {

	public static void main(String[] args) {
		
		
		Fila<Object> fila = new Fila<Object>();
		
		fila.enfileira("Primeiro");
		fila.enfileira(2);
		fila.enfileira(3.0);
		fila.enfileira("Quarto Elemento");
		
		
		//Vai espiar o primeiro elemento da fila. O que foi adiciona por primeiro
		System.out.println(fila.espiar());
		System.out.println(fila);
		
		System.out.println("Elemento removido do inicio: " + fila.desenfileirar());
		System.out.println(fila);
		
		fila.desenfileirar();
		fila.desenfileirar();
		fila.desenfileirar();
		System.out.println(fila.estaVazia());

	}

}
