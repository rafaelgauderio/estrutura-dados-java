package com.rafaeldeluca.fila.application;

import com.rafaeldeluca.fila.FilaComPrioridade;
import com.rafaeldeluca.fila.Paciente;

public class Program04 {

	public static void main(String[] args) {
		
		System.out.println("Prioridade na fila para quem tem mais idade");
		
		FilaComPrioridade<Paciente> queueWithPriority = new FilaComPrioridade<Paciente>();
		
		queueWithPriority.enfileira(new Paciente("A",7));
		queueWithPriority.enfileira(new Paciente("A",78));
		queueWithPriority.enfileira(new Paciente("A",15));
		queueWithPriority.enfileira(new Paciente("A",25));
		
		System.out.println(queueWithPriority);
		
		System.out.println("Dequeue. Primeiro sai os mais velhos!");
		System.out.println(queueWithPriority.desenfileirar());
		System.out.println(queueWithPriority.desenfileirar());
		System.out.println(queueWithPriority.desenfileirar());
		System.out.println(queueWithPriority.desenfileirar());
		
		
		
		
		
		
		

	}

}
