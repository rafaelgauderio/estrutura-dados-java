package com.rafaeldeluca.fila.application;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

import com.rafaeldeluca.fila.Paciente;

public class Program05 {

	public static void main(String[] args) {
		
		Queue<Paciente> queueWithPriority = new PriorityQueue<>(

				new Comparator<Paciente>()
				{
					@Override
					public int compare(Paciente p1, Paciente p2) {
						return Integer.valueOf(p2.getIdade()).compareTo(p1.getIdade());
					}

				}
				);
		
		queueWithPriority.add(new Paciente("A",19));
		queueWithPriority.add(new Paciente("B",25));
		queueWithPriority.add(new Paciente("C",25));
		queueWithPriority.add(new Paciente("Vovozinho",95));
		queueWithPriority.add(new Paciente("D",81));
		
		//Ordena primeiro pela idade e depois pela ordem de chegada FIFO
		System.out.println(queueWithPriority);
				
		System.out.println(queueWithPriority.remove());
		System.out.println(queueWithPriority.remove());
		System.out.println(queueWithPriority.remove());
		System.out.println(queueWithPriority.remove());
		System.out.println(queueWithPriority.remove());
	}

}
