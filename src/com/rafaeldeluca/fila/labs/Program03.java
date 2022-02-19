package com.rafaeldeluca.fila.labs;

import com.rafaeldeluca.fila.FilaComPrioridade;

public class Program03 {

	//simular uma fila de um pronto socorro/
	//3 cores para código, a consulta dura 10 segundos
	//A cada 5 segundos chega uma pessoa com prioridade aleatória
	
	public static final int RED=0;
	public static final int YELLOW=1;
	public static final int GREEN=3;
	
	
	public static void main(String[] args) {
	
		FilaComPrioridade<Person> queue = new FilaComPrioridade<Person>();
		//lining up 10 persons in the emergency room
		queue.enfileira(new Person("Rafael",GREEN));
		queue.enfileira(new Person("Juliana",YELLOW));
		queue.enfileira(new Person("Mary", RED));
		queue.enfileira(new Person("Lara", GREEN));
		queue.enfileira(new Person("Iara", GREEN));
		queue.enfileira(new Person("Fernando", RED));
		queue.enfileira(new Person("Valdir", YELLOW));
		queue.enfileira(new Person("Clarisse", RED));
		queue.enfileira(new Person("Kleyton", GREEN));
		queue.enfileira(new Person("Obi-wan", YELLOW));
		
		EmergencyRoomCalls calls = new EmergencyRoomCalls(queue);
		EmergencyRoomNewPatientes patients = new EmergencyRoomNewPatientes(queue);
		
		
		Thread thread1 = new Thread(calls);
		Thread thread2 = new Thread(patients);
		
		
		
		thread1.start();
		thread2.start();
		
		
		
		
		
		

	}

}
