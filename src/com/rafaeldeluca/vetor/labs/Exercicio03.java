package com.rafaeldeluca.vetor.labs;

import java.util.ArrayList;

import com.rafaeldeluca.vetor.Lista;

public class Exercicio03 {

	public static void main(String [] args) {

		//m�todo obtem = informa um posicao e obtem o elemento.

		Lista<String> lista = new Lista<String>(5);


		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		System.out.println("\n--M�todo obtem--");
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));
		System.out.println(lista.obtem(0));
		
		

	}

}
