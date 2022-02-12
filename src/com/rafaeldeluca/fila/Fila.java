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
	
	

}
