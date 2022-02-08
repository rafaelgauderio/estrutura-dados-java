package com.rafaeldeluca.vetor.labs;

import java.util.Scanner;

import com.rafaeldeluca.vetor.Lista;
import com.rafaeldeluca.vetor.application.Contact;


public class Exercicio06 {

	public static void main(String[] args) {

		// Criar um vetor com a capacidade para 25 contatos
		// criar 20 contatos no vetor via um loop
		// criar um menu

		Scanner sc = new Scanner(System.in);

		Lista<Contact> lista = new Lista<Contact>(25);

		criarContatosDinamicamente(5,lista);		

		int option=1;		

		while(option!=0) {

			option = obterOpcaoMenu(sc);

			switch (option) {

			case 1:
				adicionarContatoFinal(sc, lista);
				break;
				
			case 2:
				adicionarContatoPosition(sc, lista);
				break;
				
			case 3:
				obtemContatoDePosicaoEspeficica(sc, lista);
				break;
			case 4:
				obtemContato(sc, lista);
				break;	
			case 5:
				pesquisarUltimoIndide(sc, lista);
				break;
			case 6:
				pesquisarContatoExiste(sc, lista);
				break;
			case 7:
				excluirContatoPorPosicao(sc, lista);
				break;
			case 8:
				excluirContato(sc, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
			case 11:
				imprimirVetor(lista);

			}

		}		

		System.out.println("\n---PROGRAM CLOSE--");




	}

	public static int obterOpcaoMenu(Scanner sc) {

		boolean validInput = false;
		int option=0;
		String input;



		while (!validInput) {

			System.out.println("\nEnter the desired option:");
			System.out.println("1: Add contact at the end of the vector");
			System.out.println("2: Add contact in a specific position");
			System.out.println("3: Get contact form a specific position");
			System.out.println("4: Concact inquiry");
			System.out.println("5: Query last index of the contact");
			System.out.println("6: Check if concact exists");
			System.out.println("7: Delete contact by position");
			System.out.println("8: Delete contact");
			System.out.println("9: Check vector size");
			System.out.println("10: Delete all contact from vector");
			System.out.println("11: Print vector");
			System.out.println("0: Exict vector");	

			//tratar exceção caso o usuario não digitar um numero inteiro

			try {

				input = sc.nextLine();
				option = Integer.parseInt(input);

				if(option>=0 && option<=11 ) {
					validInput=true;
				}

				else {
					throw new Exception();
				}


			} catch (Exception error) {
				System.out.println("INVALID OPTION. Enter a number between 1 and 11. Zero to exit program!\n");
			}

		}

		return option;		
	}




	public static String lerInformacao(String msg, Scanner sc) {

		System.out.println(msg);
		String input = sc.nextLine();		

		return input;
	}
	
	public static void imprimeTamanhoVetor(Lista<Contact> lista) {
		
		System.out.println("Size of vector of contacts is " + lista.getSize());
		
	}



	public static void imprimirVetor(Lista<Contact> lista) {
		System.out.println(lista);
	}


	public static void limparVetor(Lista<Contact> lista) {

		lista.limpar();
		System.out.println("Delete all data from vector");

	}

	public static int lerInformacaoInt(String msg, Scanner sc) {

		boolean validInput = false;
		int num = 0;

		while(!validInput) {
			try {
				System.out.println(msg);
				String input = sc.nextLine();

				num = Integer.parseInt(input);

				validInput = true;
			} catch (Exception error) {
				System.out.println("Invalid input, enter again:");
			}
		}

		return num;

	}	

	public static void excluirContatoPorPosicao(Scanner sc, Lista<Contact> lista) {

		int pos = lerInformacaoInt("Enter the position to be delete", sc);

		try {

			Contact contact = lista.search(pos);
			lista.remove(pos);

			System.out.println("Contact DELETE");



		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}




	public static void excluirContato(Scanner sc, Lista<Contact> lista) {

		int pos = lerInformacaoInt("Enter the position to be delete", sc);

		try {

			Contact contact = lista.search(pos);
			lista.remove(contact);

			System.out.println("Contact DELETE");



		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}


	public static void pesquisarContatoExiste(Scanner sc, Lista<Contact> lista) {


		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = lista.search(position);

			boolean exist = lista.contem(contact);

			if(exist==true) {
				System.out.println("Contact existe, printing contact information");
				System.out.println(contact);
			}

			else {
				System.out.println("Contact does NOT EXIST");
			}			


		} catch (Exception error) {
			System.out.println("Invalid position");
		}


	}

	public static void pesquisarUltimoIndide(Scanner sc, Lista<Contact> lista) {

		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = lista.search(position);

			System.out.println("Contact existe, printing contact information");
			System.out.println(contact);

			System.out.println("Searching last index of contact found");
			position = lista.ultimoIndiceDe(contact);

			System.out.println("Contact found in the position:" + position);

		} catch (Exception error) {
			System.out.println("Invalid position");
		}





	}


	public static void obtemContato(Scanner sc, Lista<Contact> lista) {

		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = lista.search(position);

			System.out.println("Contact existe, printing contact information");
			System.out.println(contact);

			System.out.println("Searching contact found");
			position = lista.busca(contact);

			System.out.println("Contact found in the position:" + position);

		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}

	public static void obtemContatoDePosicaoEspeficica(Scanner sc, Lista<Contact> lista) {

		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = lista.search(position);

			System.out.println("Contact existe, printing contact information");
			System.out.println(contact);			

		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}


	public static void adicionarContatoPosition(Scanner sc, Lista<Contact> lista) {

		System.out.println("Creating a contact, enter the information");
		String name = lerInformacao("Enter the name", sc);
		String phone = lerInformacao("Enter the phone", sc);
		String email = lerInformacao("Enter the email", sc);
		String address = lerInformacao("Enter the address: street and number", sc);

		Contact contact = new Contact(name, phone, email, address);

		int pos = lerInformacaoInt("Enter the POSTION to add contact", sc);

		try {

			lista.adiciona(contact);
			System.out.println("Contact created successfully");
			System.out.println(contact);

		} catch (Exception error) {
			System.out.println("Invalid position, contact NOT ADD");
		}



	}




	public static void adicionarContatoFinal(Scanner sc, Lista<Contact> lista) {

		System.out.println("Creating a contact, enter the information");
		String name = lerInformacao("Enter the name", sc);
		String phone = lerInformacao("Enter the phone", sc);
		String email = lerInformacao("Enter the email", sc);
		String address = lerInformacao("Enter the address: street and number", sc);

		Contact contact = new Contact(name, phone, email, address);

		lista.adiciona(contact);

		System.out.println("Contact created successfully");
		System.out.println(contact);


	}


	public static void criarContatosDinamicamente(int quantity, Lista<Contact> lista) {

		//boa pratica não criar varias variáveis dentro de loops
		Contact contact;

		for(int i=1; i<=quantity; i++) {
			contact = new Contact();
			contact.setName("Contato: " +i);
			contact.setPhone("9999999"+i);
			contact.setEmail("contact" + i+"@gmail.com");
			contact.setAddress("Street " + i +", number: " +i);

			lista.adiciona(contact);
		}



	}



}
