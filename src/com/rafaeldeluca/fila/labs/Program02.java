package com.rafaeldeluca.fila.labs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Program02 {

	//Fila de senhas. Senha prioritaria ou regular.
	//1 pessoa normal para cada 3 com prioridade
	//Senão houver prioridade, chamar a fila regular pela ordem de chegada


	public static void main(String [] args) {

		final int MAXIMUM_PRIORITY = 3;

		Queue<String> priorityStack = new LinkedList<String>();
		Queue<String> normalStack = new LinkedList<String>();

		normalStack.add("Regular 1");
		normalStack.add("Regular 2");
		normalStack.add("Regular 3");
		normalStack.add("Regular 4");
		priorityStack.add("Old man");
		priorityStack.add("Old man 2");
		priorityStack.add("Obese Man");
		normalStack.add("Regular 5");
		normalStack.add("Regular 6");	
		priorityStack.add("Obese Person");
		priorityStack.add("Pregnant woman");
		priorityStack.add("Blind man");




		while(normalStack.isEmpty()==false || priorityStack.isEmpty()==false) {

			int counter=0;

			while(priorityStack.isEmpty()==false && counter < MAXIMUM_PRIORITY) {

				answerPerson(priorityStack);
				counter++;				
			}		

		
			if(priorityStack.isEmpty()) {
				while(normalStack.isEmpty()==false) {
					answerPerson(normalStack);
				}
			}
			
			if (normalStack.isEmpty()==false) {
				answerPerson(normalStack);
			}	
			
		

		}		


	}

	public static void answerPerson(Queue<String> personQueue) {

		String answerPerson = personQueue.remove();	
		System.out.println(answerPerson + " was attended!");
		try {
			
			Thread.sleep(500);
		} catch (InterruptedException error) {
			error.printStackTrace();
		}	
	



	}


}

