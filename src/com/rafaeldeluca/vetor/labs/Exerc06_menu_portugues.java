package com.rafaeldeluca.vetor.labs;

import java.util.Scanner;

import com.rafaeldeluca.vetor.Lista;
import com.rafaeldeluca.vetor.application.Contact;

public class Exerc06_menu_portugues {
	
	
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			Lista<Contact> lista = new Lista<Contact>(20);

			
			criarContactsDinamicamente(10, lista);
			
			int opcao = 1;
			while (opcao != 0){
				opcao = obterOpcaoMenu(scan);
				switch (opcao) {
				case 1:
					adicionarContactFinal(scan, lista);
					break;
				case 2:
					adicionarContactPosicao(scan, lista);
					break;
				case 3: 
					obtemContactPosicao(scan, lista);
					break;
				case 4: 
					obtemContact(scan, lista);
					break;
				case 5: 
					pesquisarUltimoIndice(scan, lista);
					break;
				case 6: 
					pesquisarContactExiste(scan, lista);
					break;	
				case 7: 
					excluirPorPosicao(scan, lista);
					break;	
				case 8: 
					excluirContact(scan, lista);
					break;	
				case 9:
					imprimeTamanhoVetor(lista);
					break;
				case 10:
					limparVetor(lista);
					break;
				case 11:
					imprimirVetor(lista);
					break;	
				default:
					break;
				}
			}
			System.out.println("Usuário digitou 0, programa terminado");
		}
		
		private static void imprimirVetor(Lista<Contact> lista){
			System.out.println(lista);
		}
		private static void limparVetor(Lista<Contact> lista){
			lista.limpar();
			
			System.out.println("Todos os Contacts do vetor foram excluídos");
		}
		private static void imprimeTamanhoVetor(Lista<Contact> lista){
			System.out.println("Tamanho do vetor é de: " + lista.getSize());
		}
		private static void excluirPorPosicao(Scanner scan, Lista<Contact> lista){
			int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
			try {
				lista.remove(pos);
				System.out.println("Contact excluído");
			} catch (Exception e) {
				System.out.println("Posição inválida!");
			}
		}
		private static void excluirContact(Scanner scan, Lista<Contact> lista){
			int pos = leInformacaoInt("Entre com a posição a ser removida", scan);
			try {
				Contact Contact = lista.search(pos);
				lista.remove(Contact);
				System.out.println("Contact excluído");
			} catch (Exception e) {
				System.out.println("Posição inválida!");
			}
		}
		private static void pesquisarContactExiste(Scanner scan, Lista<Contact> lista){
			int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
			try {
				Contact Contact = lista.search(pos);
				boolean existe = lista.contem(Contact);
				if (existe){
					System.out.println("Contact existe, seguem dados:");
					System.out.println(Contact);
				} else {
					System.out.println("Contact não existe");
				}
			} catch (Exception e) {
				System.out.println("Posição inválida!");
			}
		}
		private static void pesquisarUltimoIndice(Scanner scan, Lista<Contact> lista){
			int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
			try {
				Contact Contact = lista.search(pos);
				System.out.println("Contact existe, seguem dados:");
				System.out.println(Contact);
				System.out.println("Fazendo pesquisa do último índice do Contact encontrado:");
				pos = lista.ultimoIndiceDe(Contact);
				System.out.println("Contact encontrado na posição " + pos);
			} catch (Exception e) {
				System.out.println("Posição inválida!");
			}
		}
		private static void obtemContact(Scanner scan, Lista<Contact> lista){
			int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
			try {
				Contact Contact = lista.search(pos);
				System.out.println("Contact existe, seguem dados:");
				System.out.println(Contact);
				System.out.println("Fazendo pesquisa do Contact encontrado:");
				pos = lista.busca(Contact);
				System.out.println("Contact encontrado na posição " + pos);
			} catch (Exception e) {
				System.out.println("Posição inválida!");
			}
		}
		private static void obtemContactPosicao(Scanner scan, Lista<Contact> lista){
			int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);
			try {
				Contact Contact = lista.search(pos);
				System.out.println("Contact existe, seguem dados:");
				System.out.println(Contact);
			} catch (Exception e) {
				System.out.println("Posição inválida!");
			}
		}
		private static void adicionarContactFinal(Scanner scan, Lista<Contact> lista){
			System.out.println("Criando um Contact, entre com as informações:");
			String nome = leInformacao("Entre com o nome", scan);
			String telefone = leInformacao("Entre com o telefone", scan);
			String email = leInformacao("Entre com o email", scan);
			String address = leInformacao("Entre com o endereço", scan);
			Contact Contact = new Contact(nome, telefone, email,address);
			lista.adiciona(Contact);
			System.out.println("Contact adicionado com sucesso!");
			System.out.println(Contact);
		}
		private static void adicionarContactPosicao(Scanner scan, Lista<Contact> lista){
			System.out.println("Criando um Contact, entre com as informações:");
			String nome = leInformacao("Entre com o nome", scan);
			String telefone = leInformacao("Entre com o telefone", scan);
			String email = leInformacao("Entre com o email", scan);
			String address = leInformacao("Entre com o endereço", scan);
			Contact Contact = new Contact(nome, telefone, email,address);
			int pos = leInformacaoInt("Entre com a posição a adicionar o Contact", scan);
			try {
				lista.adiciona(pos, Contact);
				System.out.println("Contact adicionado com sucesso!");
				System.out.println(Contact);
			} catch (Exception e){
				System.out.println("Posição inválida, Contact não adicionado");
			}
		}
		private static String leInformacao(String msg, Scanner scan){
			System.out.println(msg);
			String entrada = scan.nextLine();
			return entrada;
		}
		private static int leInformacaoInt(String msg, Scanner scan){
			boolean entradaValida = false;
			int num = 0;
			while (!entradaValida){
				try {
					System.out.println(msg);
					String entrada = scan.nextLine();
					num = Integer.parseInt(entrada);
					entradaValida = true;
				} catch (Exception e){
					System.out.println("Entrada inválida, digite novamente");
				}
			}
			return num;
		}
		private static int obterOpcaoMenu(Scanner scan){
			boolean entradaValida = false;
			int opcao = 0;
			String entrada;
			while (!entradaValida){
				System.out.println("\nDigite a opção desejada:");
				System.out.println("1: Adiciona Contact no final do vetor");
				System.out.println("2: Adiciona Contact em uma posição específica");
				System.out.println("3: Obtém Contact de uma posição específica");
				System.out.println("4: Consulta Contact");
				System.out.println("5: Consulta último índide do Contact");
				System.out.println("6: Verifica se Contact existe");
				System.out.println("7: Excluir por posição");
				System.out.println("8: Excluir Contact");
				System.out.println("9: Verifica tamanho do vetor");
				System.out.println("10: Excluir todos os Contacts do vetor");
				System.out.println("11: Imprime vetor");
				System.out.println("0: Sair");
				try {
					entrada = scan.nextLine();
					opcao = Integer.parseInt(entrada);
					if (opcao >= 0 && opcao <= 11){
						entradaValida = true;
					} else {
						throw new Exception();
					}
				} catch (Exception e){
					System.out.println("Entrada inválida, digite novamente\n");
				}
			}
			return opcao;
		}
		private static void criarContactsDinamicamente(int quantidade, Lista<Contact> lista){
			Contact Contact;
			for (int i=1; i<=quantidade; i++){
				Contact = new Contact();
				Contact.setName("Contact " + i);
				Contact.setPhone("1111111"+i);
				Contact.setEmail("Contact"+i+"@email.com");
				Contact.setAddress("Rua Brasil, número" + i);
				lista.adiciona(Contact);
			}
		}
	}


