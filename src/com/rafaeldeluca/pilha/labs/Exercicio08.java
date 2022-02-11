package com.rafaeldeluca.pilha.labs;

import com.rafaeldeluca.pilha.Pilha;

public class Exercicio08 {
	
	public static int PASSOS=0;

	public static void main(String[] args) {
		
		Pilha<Integer> inicial = new Pilha <Integer>();
		Pilha<Integer> destino = new Pilha <Integer>();
		Pilha<Integer> auxiliar = new Pilha <Integer>();
		
		inicial.empilha(8);
		inicial.empilha(7);
		inicial.empilha(6);
		inicial.empilha(5);		
		inicial.empilha(4);
		inicial.empilha(3);
		inicial.empilha(2);
		inicial.empilha(1);
		
		
		torreDeHanoi(inicial.tamanho(), inicial, destino, auxiliar);
		System.out.println("Número de passos míminos: " + PASSOS);
		

	}
	
	
	public static void  torreDeHanoi(int n, Pilha<Integer> inicial, Pilha<Integer> destino, Pilha<Integer> auxiliar) {
		
		//usando recursividade
		if (n >0) {
			
			torreDeHanoi(n-1, inicial, auxiliar, destino);
			destino.empilha(inicial.desempilha());
			System.out.println("-------------");
			System.out.println("Inicial:" + inicial);
			System.out.println("Destino:" + destino);
			System.out.println("Auxiliar:" + auxiliar);
			torreDeHanoi(n-1, auxiliar, destino, inicial);
			try {
				PASSOS++;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
	}

}
