package vetor.labs;

import com.rafaeldeluca.vetor.Lista;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Agora tem o método remove tanto informando a posicao ou o elemento
		
		Lista<String> lista = new Lista<String>(5);


		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		lista.remove("A");		
		lista.remove("E");
		lista.remove(3);
		
		System.out.println("\n--Imprimindo depois de remover--");
		System.out.println(lista);
	
		
		
		

	}

}
