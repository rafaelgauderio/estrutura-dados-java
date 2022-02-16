package com.rafaeldeluca.fila.labs;

import com.rafaeldeluca.fila.Fila;

public class Program01 {
	
	//criar um fila de documentos para ser impressos.
	//imprimir na ordem e a medida que imprimir ir removendo da fila

	public static void main(String[] args) {
		
		Fila <Document> documentsQueue = new Fila<Document> ();
		
		documentsQueue.enfileira(new Document("Finantial Report",20));
		documentsQueue.enfileira(new Document("Human Resources Report",15));
		documentsQueue.enfileira(new Document("Report",11));
		documentsQueue.enfileira(new Document("Horoscope",22));
		documentsQueue.enfileira(new Document("invoice",14));
		
		while(documentsQueue.estaVazia()==false) {
			
			Document doc = documentsQueue.desenfileirar();
			System.out.println("Printing document\n" + doc);
			
			try {
				//time to print each page
				Thread.sleep(300 * doc.getPageNumbers());
			} catch (InterruptedException error) {
				error.printStackTrace();
			}			
			
		}		

	}

}
