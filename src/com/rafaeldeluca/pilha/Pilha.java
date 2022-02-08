package com.rafaeldeluca.pilha;

import com.rafaeldeluca.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T>{
	
	public Pilha(){
		super();
	}

	public Pilha(int capacity){
		super(capacity);
	}

	//empilha e remove sempre do topo da pilha. equivalente ao push 
	public void empilha(T element) {
		super.adiciona(element);
	}
	
	//espiar no topo, peek. Espia sem excluir o elemento do topo da pilha
	public T topo(){

		if (this.estaVazia()){
			return null;
		} 

		return this.elements[size-1];
	}
	//desempilha equivalente ao pop
	public T desempilha() {
		
		if(this.estaVazia()) {
			return null;
		} else {
					
			T element=this.elements[size-1];
			size--;
			return element;
		
			//codigo equivalente
			//return this.elements[--size];
		}
		
		
		
		
	}
	
	
	

}
