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
		
		//vetor come�a no indice zero
		System.out.println("O valor da temperatura do dia 4 � " +temp[3]);
		
		System.out.println("O tamanho do vetor � " + temp.length);
		
		for(int i=0; i< temp.length ; i++ ) {
			
			System.out.println("O valor da temperatura no dia " + (i+1) + " � " + temp[i]);
			
		}
		
		System.out.println("\n-------\n");
		
		//la�o for each
		for (double apelido : temp) {
			
			System.out.println("O valor da temperatura, de cada dia � " + apelido);
		}
	
		
		
	}

}
