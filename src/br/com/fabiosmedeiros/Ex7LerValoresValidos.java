package br.com.fabiosmedeiros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa para calcular o fatorial de um 
 * inteiro fornecido pelo usu�rio.
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex7LerValoresValidos {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scan = new Scanner(System.in);
		
		// Exibindo mensagem para solicitar entrada de dados.
		System.out.println("Digite um n�mero");
		
		// Lendo entrada do teclado.
		int numero = scan.nextInt();
		// Instanciando um ArrayList para armazenar os n�meros digitados.
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
		
		// Enquanto n�meros v�lidos forem digitados, armazenar no ArrayList.
		while (numero >= 0 && numero <= 10 ) {		
			System.out.println("Digite outro n�mero");
			
			numero = scan.nextInt();
			
			listaDeNumeros.add(numero);
		}
		
		System.out.println("O n�mero digitado � inv�lido. "
				+ "Exibindo os n�meros digitados, e encerrando o programa");
		
		// Printando a lista de n�meros.
		for(int item: listaDeNumeros) {
			System.out.println("[" + item + "]");
		}
		
		// Fechando o scanner.
		scan.close();
	}
}
