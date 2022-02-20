package com.rafaeldeluca.fila.labs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Program04 {
	
	//Simulação da brincadeira batata quente

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int i=0;
		while(i < 20) {
			queue.add(i);
			i++;
		}
		
		Random random = new Random();
		
		int number =0;
		while(number==0) {
			number=random.nextInt(20);
		}
		
		//Só pode haver um ganhador da brincadeira no final
		while(queue.size() > 1) {
			for(i=0; i<number ; i++) {
				queue.add(queue.remove());
			}
			System.out.println("Eliminated from the game: " + queue.remove());
		}
		
		System.out.println("Winer:" + queue.remove());		
		

	}

}
