package com.rafaeldeluca.fila.application;

import java.util.LinkedList;
import java.util.Queue;

public class Program03 {

	public static void main(String[] args) {

		//API java; Queue
		//Queue � uma interface e n�o pode ser instanciada
		//Implementar uma fila com a classe Lista Ligada, Lista Encadeada (Estrutura Din�mica)
		
		Queue<String> filaAPI = new LinkedList<String>();
		
		filaAPI.add("Primeiro da fila"); //enqueue
		filaAPI.add("Rafael De Luca");
		filaAPI.add("�ltimo da fila");
		
		System.out.println(filaAPI);
		
		System.out.println("peek: " + filaAPI.peek()); //espiar o primeiro elemento da fila
		System.out.println("remove:" + filaAPI.remove()); //dequeue, remove o primeiro da fila
		
		System.out.println(filaAPI);
		
		

	}

}
