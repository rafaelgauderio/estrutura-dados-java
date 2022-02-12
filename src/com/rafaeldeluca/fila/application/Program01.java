package com.rafaeldeluca.fila.application;

import com.rafaeldeluca.fila.Fila;

public class Program01 {
	
	public static void main(String [] args) {
		
		Fila<String> fila = new Fila<String>(15);
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		
	}

}
