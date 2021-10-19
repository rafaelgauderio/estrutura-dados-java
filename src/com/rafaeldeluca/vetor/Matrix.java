package com.rafaeldeluca.vetor;

import java.util.Scanner;

public class Matrix { 
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=0, j=0, k=1;
		Integer	tamanho = 0;
		
		System.out.println("Informe o tamanho de um matriz quadrada: ");
		
			while (tamanho instanceof Integer==false ) {
			System.out.println("Tu não informaste um numero inteiro:");
		}
		tamanho= Integer.parseInt(sc.nextLine());
			
		
		int [][] matriz = new int[tamanho][tamanho];
		
		//preenchendo a matriz e já imprimindo
		System.out.println("MATRIZ de tamanho:" + tamanho + " por " + tamanho);
		for(i=0; i<matriz.length; i++) {			
			for(j=0; j<matriz[i].length; j++) {				
				matriz[i][j]=k;
				k++;
				System.out.print("["+matriz[i][j]+"]");				
			}
			System.out.println();			
		}		
		
		sc.close();
		
		String [][] matrizString = new String [3][3];
		matrizString[0][0]="Rafael";
		matrizString[0][1]="Larissa";
		matrizString[0][2]="Manuela";
		matrizString[1][0]="Joao";
		matrizString[1][1]="Alexandra";
		matrizString[1][2]="Marlon";
		matrizString[2][0]="Laurinha";
		matrizString[2][1]="Ayrton";
		matrizString[2][2]="Aristides";
		
		
		System.out.println("\n--Matriz de String--");
		for(i=0; i<matrizString.length; i++) {			
			for(j=0; j<matrizString[i].length; j++) {				
				System.out.printf("["+matrizString[i][j]+"]");	
				
			}
			System.out.println();			
		}		
		
		
		
		
		
		
	}

}
