package com.rafaeldeluca.vetor;

public class VetorTemperatura {
	
	public static void main(String [] args) {
		
		//declarando um vetor para todas as temperaturas do ano durante um ano
		double [] temp = new double[365];
		temp[0] = 33.3;
		temp[1] = 33.5;
		temp[2] = 31.7;
		temp[3] = 34.1;
		temp[4] = 32.9;
		temp[5] = 33.1;
		
		//vetor começa no indice zero
		System.out.println("O valor da temperatura do dia 4 é " +temp[3]);
		
		System.out.println("O tamanho do vetor é " + temp.length);
		
		for(int i=0; i< temp.length ; i++ ) {
			
			System.out.println("O valor da temperatura no dia " + (i+1) + " é " + temp[i]);
			
		}
		
		System.out.println("\n-------\n");
		
		//laço for each
		for (double apelido : temp) {
			
			System.out.println("O valor da temperatura, de cada dia é " + apelido);
		}
	
		
		
	}

}
