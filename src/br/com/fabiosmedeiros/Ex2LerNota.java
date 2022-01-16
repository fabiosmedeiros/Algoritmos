package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para ler uma nota enre 0 e 10.
 * Se algum n�mero inv�lido foi informado, 
 * o programa dever� ser encerrado. 
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
		
		// Verificando se a nota digitada foi v�lida.
		if(isNumero(nota)) {
			System.out.println("A nota digitada foi: " + nota);
		}
		else {
			System.out.println("Um valor inv�lido foi digitado. "
					+ "O programa est� sendo encerrado.");
		}
		
		// Fechando o scanner.
		scann.close();
	}
	
	// Fun��o para verificar se a string cont�m um n�mero ou n�o.
	public static boolean isNumero(String numero) { 
	  try {
		  Double.parseDouble(numero);
		  return true;
	  } catch(NumberFormatException e) {
		  return false;  
	  }
	}
}
