package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para ler 8 números inteiros, 
 * calcular e mostrar a quantidade de números 
 * pares, e a quantidade de números ímpares. 
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex4ParEImpar {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		// Declarando e inicializando variáveis.
		int numeroPar = 0, numeroImpar = 0;
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite um número.");
			String numero = scann.next();
			
			// Enquanto o número passado for inválido, solicitar nova entrada de dados.
			while(!isNumero(numero)) {
				System.out.println("Número inválido.\nDigite um número.");
				numero = scann.next();	
			}
			
			// Verificando se o número passado é par ou ímpar.
			if(isPar(Integer.parseInt(numero))) {
				numeroPar++;
			} else {
				numeroImpar++;
			}
		}
		
		// Printando um resumo.
		System.out.println("Foram encontrados " + numeroPar + 
						   " números pares, e " + numeroImpar + " números ímpares.");
		
		// Fechando o scanner.
		scann.close();
	}

	// Função para verificar se um número é par ou não.
	public static boolean isPar(int numero) {
		return (numero % 2 == 0);
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
