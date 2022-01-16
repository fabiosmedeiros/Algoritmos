package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para ler uma nota enre 0 e 10.
 * Se algum número inválido foi informado, 
 * o programa deverá ser encerrado. 
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex2LerNota {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Digite uma nota");
		
		// Lendo a nota.
		String nota = scann.next();
		
		// Verificando se a nota digitada foi válida.
		if(isNumero(nota)) {
			System.out.println("A nota digitada foi: " + nota);
		}
		else {
			System.out.println("Um valor inválido foi digitado. "
					+ "O programa está sendo encerrado.");
		}
		
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
