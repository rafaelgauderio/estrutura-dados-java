package com.rafaeldeluca.fila.labs;

import java.util.Random;

import com.rafaeldeluca.fila.FilaComPrioridade;

public class EmergencyRoomNewPatientes implements Runnable{


	private FilaComPrioridade<Person> queue;
	private int counter=10;
	private Random priority= new Random();

	public EmergencyRoomNewPatientes(FilaComPrioridade<Person> queue) {
		super();
		this.queue=queue;
	}

	@Override
	public void run() {
		for(int  i=0; i<=10; i++) {
			try {
				//A cada 5 segundos chega uma pessoa com prioridade aleatória				
				Thread.sleep(500);
				Person person = new Person("" + counter,priority.nextInt(3));				
				queue.enfileira(person);
				counter++;
				System.out.println(person + " is on the queue");

			} catch(InterruptedException error) {
				error.printStackTrace();
			}
		}


	}




}
