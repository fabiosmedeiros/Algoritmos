package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para ler 8 n�meros inteiros, 
 * calcular e mostrar a quantidade de n�meros 
 * pares, e a quantidade de n�meros �mpares. 
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex4ParEImpar {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		// Declarando e inicializando vari�veis.
		int numeroPar = 0, numeroImpar = 0;
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Digite um n�mero.");
			String numero = scann.next();
			
			// Enquanto o n�mero passado for inv�lido, solicitar nova entrada de dados.
			while(!isNumero(numero)) {
				System.out.println("N�mero inv�lido.\nDigite um n�mero.");
				numero = scann.next();	
			}
			
			// Verificando se o n�mero passado � par ou �mpar.
			if(isPar(Integer.parseInt(numero))) {
				numeroPar++;
			} else {
				numeroImpar++;
			}
		}
		
		// Printando um resumo.
		System.out.println("Foram encontrados " + numeroPar + 
						   " n�meros pares, e " + numeroImpar + " n�meros �mpares.");
		
		// Fechando o scanner.
		scann.close();
	}

	// Fun��o para verificar se um n�mero � par ou n�o.
	public static boolean isPar(int numero) {
		return (numero % 2 == 0);
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
