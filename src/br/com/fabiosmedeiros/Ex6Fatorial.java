package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para calcular o fatorial de um 
 * inteiro fornecido pelo usuário.
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex6Fatorial {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		int fatorial = 1;
		
		// Exibindo mensagem para solicitar entrada de dados.
		System.out.println("Digite um número, para calcular seu fatorial");
		
		// Entrada de dados para o cálculo do fatorial.
		String strNumero = scann.next();
		
		// Enquanto a string não tiver um número, loop.
		while(!isNumero(strNumero)) {
			System.out.println("O número digitado é inválido. "
					+ "Por favor, digite um número válido para calcular seu fatorial");
			
			strNumero = scann.next();
		}
		
		// Enquanto o número digitado for inválido, loop.
		while(Integer.parseInt(strNumero) < 0) {
			System.out.println("O número digitado é negativo. "
					+ "Não existe fatorial de números negativos. "
					+ "Por favor, digite um número válido.");
			
			strNumero = scann.next();
		}
		
		// Convertendo a string para int.
		int numero = Integer.parseInt(strNumero);
		
		// Calculando o fatorial do número passado como parâmetro.
		while(numero > 0) {
			fatorial *= numero;
			numero--;
			
			System.out.println(fatorial);
		}
		
		// Printando o resumo.
		System.out.println("O fatorial de " + strNumero + " é : " + fatorial);
		
		// Fechando o Scanner.
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
