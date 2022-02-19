package com.rafaeldeluca.fila.labs;

import com.rafaeldeluca.fila.FilaComPrioridade;


public class EmergencyRoomCalls implements Runnable{
	
	private FilaComPrioridade<Person> queue;
	
	public EmergencyRoomCalls(FilaComPrioridade<Person> queue) {
		super();
		this.queue=queue;
	}
	

	@Override
	public void run() {
		
		while(queue.estaVazia()==false) {
			try {
				System.out.println(queue.desenfileirar() + " call to be attended!");
				//cada atendimento(consulta) dura 10 segundos
				Thread.sleep(1000);
			} catch(InterruptedException error) {
				error.printStackTrace();
			}
		}
		
		System.out.println("Patiente attended!");
	}

}
