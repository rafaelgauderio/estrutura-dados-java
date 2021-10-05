package com.rafaeldeluca.vetor;

public class Vetor {
	
	private String [] elements;
	private int size;	
	
	public Vetor() {
		
	}
	
	public Vetor (int capacity) {
		this.elements= new String[capacity];
		this.size=0;// inicializa o vetor com tamanho zero
		
		}	
	
	/*
	public void adiciona(String element ) {
		for (int i=0; i< this.elements.length; i ++) {
			if(this.elements[i]==null) {
				this.elements[i] = element;
				//Parar de executar o código quando encontrar a primeira posição nula e não percorrer todo o vetor
				break;
			}
		}
	}
	*/
	
	//Para não precisar percorrer todo o vetor atrás da primeiro posição nula eu atribuo um tamanho para o vetor
	public void adiciona(String element) throws Exception {
		
		//verificar se o tamanho é menor que a capacity de elementos do vetor
		if (this.size < this.elements.length) {
			
			this.elements[this.size] = element;
			this.size++;	
		}
		else {
			throw new Exception ("Vetor cheio, não é possível adicionar mais elementos!Aumente a capacidade do vetor.");
		}		
		
	}

}
