package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para gerar tabuada de qualquer 
 * número inteiro entre 1 e 10.   
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex5GeradorDeTabuada {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		// Declarando e inicializando variáveis.
		String numero = null;
		String operacao = "";
		
		do {
			// Exibindo mensagem e lendo número.
			System.out.println("Digite um número entre 1 e 10");
			
			numero = scann.next();
			
			// Se string não contém um número, skipp.
			if(!isNumero(numero)) {
				continue;
			}
			
			// Exibe mensagem para saber a operação desejada.
			System.out.println("Digite a operação básica desejada (+ ou *)");
			
			operacao = scann.next();			
			boolean operacaoSelecionada = false;
			
			while(!operacaoSelecionada) {
				switch(operacao) {
				case "+":
					// Printando a tabuada de adição.
					System.out.println("Printando a tabuada de " + numero + " (+)");
					
					for (int i = 1; i <= 10; i++) {
						System.out.println(numero + " + " + i + " = " + (Integer.parseInt(numero) + i));
					}
					
					operacaoSelecionada = true;
					break;				
				case "*":
					// Printando a tabuada de multiplicação.
					System.out.println("Printando a tabuada de " + numero + " (*)");
					
					for (int i = 1; i <= 10; i++) {
						System.out.println(numero + " * " + i + " = " + (Integer.parseInt(numero) * i));
					}
					
					operacaoSelecionada = true;
					break;
				default:
					System.out.println("Operação inválida. Digite a operação básica desejada (+ ou *)");
					operacao = scann.next();
				}
			}
						
			break;
		} while(true);
		
		scann.close();
	}
	
	// Função para verificar se a string contém um número ou não.
	public static boolean isNumero(String strNumero) { 
	  try {
		  Double.parseDouble(strNumero);
		  return true;
	  } catch(NumberFormatException e) {
		  return false;  
	  }
	}
}
