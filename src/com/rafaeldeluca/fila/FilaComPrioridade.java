package com.rafaeldeluca.fila;

public class FilaComPrioridade<T> extends Fila<T> {
	
	
	//poliformismo do método adiciona. Agora adicionando com prioridade
	
	public void enfileira(T element) {
		
		Comparable<T> key = (Comparable<T>) element;
		
		int i=0;

		for (i=0; i<this.size; i++) {
			
			if(key.compareTo(this.elements[i]) < 0) {
				break;
			}
			
		}
		
		this.adiciona(i,element);
	}
	

}
