package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para calcular o fatorial de um 
 * inteiro fornecido pelo usu�rio.
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
		System.out.println("Digite um n�mero, para calcular seu fatorial");
		
		// Entrada de dados para o c�lculo do fatorial.
		String strNumero = scann.next();
		
		// Enquanto a string n�o tiver um n�mero, loop.
		while(!isNumero(strNumero)) {
			System.out.println("O n�mero digitado � inv�lido. "
					+ "Por favor, digite um n�mero v�lido para calcular seu fatorial");
			
			strNumero = scann.next();
		}
		
		// Enquanto o n�mero digitado for inv�lido, loop.
		while(Integer.parseInt(strNumero) < 0) {
			System.out.println("O n�mero digitado � negativo. "
					+ "N�o existe fatorial de n�meros negativos. "
					+ "Por favor, digite um n�mero v�lido.");
			
			strNumero = scann.next();
		}
		
		// Convertendo a string para int.
		int numero = Integer.parseInt(strNumero);
		
		// Calculando o fatorial do n�mero passado como par�metro.
		while(numero > 0) {
			fatorial *= numero;
			numero--;
			
			System.out.println(fatorial);
		}
		
		// Printando o resumo.
		System.out.println("O fatorial de " + strNumero + " � : " + fatorial);
		
		// Fechando o Scanner.
		scann.close();
	}
	
	// Fun��o para verificar se a string cont�m um n�mero ou n�o.
	public static boolean isNumero(String strNumero) { 
	  try {
		  Double.parseDouble(strNumero);
		  return true;
	  } catch(NumberFormatException e) {
		  return false;  
	  }
	}
}
