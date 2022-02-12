package com.rafaeldeluca.fila;

import com.rafaeldeluca.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
	}

	public Fila(int capacity) {

		super(capacity);
	}

	//enfileirar = enqueue = adiciona no fim da fila
	public void enfileira(T element) {

		//this.elements[this.size] = element;
		//this.size++;

		//método da adiciona verifica se precisa aumentar a capacidade da fila antes de adicionar
		this.adiciona(element);

	}
	//esticar o pesçoco para ver quem é o primeiro da fila
	//espiar no inicia da fila, peek. Espia sem excluir o elemento do inicio da fila
	public T espiar(){

		if (this.estaVazia()){
			return null;
		} 

		return this.elements[0];
	}

	//FIFO =  primeiro a entrar é o primeiro a sair
	//equivalente ao dequeeu = remove
	public T desenfileirar() {
		 final int POSINICIAL=0;
		
		if(this.estaVazia()) {
			return null;
		} else {

			T elementRemovido=this.elements[POSINICIAL];
			this.remove(POSINICIAL);
			return elementRemovido;
		}
	}	

}
