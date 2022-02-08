package com.rafaeldeluca.pilha.application;

import com.rafaeldeluca.pilha.Pilha;

public class Program04 {
	
	public static void main(String [] agrs) {
		
	//espiar os itens do topo da pilha
	
		Pilha<Integer> pilha = new Pilha<Integer>(15);
		
		//não tem nada para espiar no topo (null)
		System.out.println(pilha.topo());
		
		pilha.empilha(12);
		pilha.empilha(17);
		pilha.empilha(31);
		
		//Aparece o ultimo elemento espilhado
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
		
		
		
		
	}

}
