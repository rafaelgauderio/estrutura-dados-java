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
				//Parar de executar o c�digo quando encontrar a primeira posi��o nula e n�o percorrer todo o vetor
				break;
			}
		}
	}
	*/
	
	//Para n�o precisar percorrer todo o vetor atr�s da primeiro posi��o nula eu atribuo um tamanho para o vetor
	public void adiciona(String element) throws Exception {
		
		//verificar se o tamanho � menor que a capacity de elementos do vetor
		if (this.size < this.elements.length) {
			
			this.elements[this.size] = element;
			this.size++;	
		}
		else {
			throw new Exception ("Vetor cheio, n�o � poss�vel adicionar mais elementos!Aumente a capacidade do vetor.");
		}		
		
	}

}
