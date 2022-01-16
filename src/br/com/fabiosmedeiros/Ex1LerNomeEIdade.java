package br.com.fabiosmedeiros;

import java.util.Scanner;
/**
 * Programa para ler um nome e uma idade.
 * Case seja digitado zero no nome, o 
 * programa deverá ser encerrado. 
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex1LerNomeEIdade {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		// Declarando e inicializando variáveis.
		String nome = null;
		String idade = null;
		
		do {
			// Exibindo mensagem e lendo nome.
			System.out.println("Digite o nome");
			
			nome = scann.next();
			
			// Exibindo mensagem e lendo nome.
			System.out.println("Digite a idade");
			
			idade = scann.next();
			
			/* Enquanto uma idade inválida for digitada, 
			   solicitar nova entrada de dados. */
			while (!isNumero(idade)) {
				System.out.println("Digite a idade");
				idade = scann.next();
			}
			
			// Exibindo dados digitados.
			System.out.println("Nome digitado : " + nome + " , Idade : " + idade + "\n");
			
		} while(!nome.equals("0"));
		
		System.out.println("Encerrando o programa.");		
		// Fechando o scanner.
		scann.close();
	}
	
	// Função para verificar se a string contém um número ou não.
	public static boolean isNumero(String numero) { 
	  try {
		  Double.parseDouble(numero);
		  return true;
	  } catch(NumberFormatException e) {
		  return false;  
	  }
	}
}
