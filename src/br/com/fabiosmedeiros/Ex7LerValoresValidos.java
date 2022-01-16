package br.com.fabiosmedeiros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa para calcular o fatorial de um 
 * inteiro fornecido pelo usuário.
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex7LerValoresValidos {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scan = new Scanner(System.in);
		
		// Exibindo mensagem para solicitar entrada de dados.
		System.out.println("Digite um número");
		
		// Lendo entrada do teclado.
		int numero = scan.nextInt();
		// Instanciando um ArrayList para armazenar os números digitados.
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
		
		// Enquanto números válidos forem digitados, armazenar no ArrayList.
		while (numero >= 0 && numero <= 10 ) {		
			System.out.println("Digite outro número");
			
			numero = scan.nextInt();
			
			listaDeNumeros.add(numero);
		}
		
		System.out.println("O número digitado é inválido. "
				+ "Exibindo os números digitados, e encerrando o programa");
		
		// Printando a lista de números.
		for(int item: listaDeNumeros) {
			System.out.println("[" + item + "]");
		}
		
		// Fechando o scanner.
		scan.close();
	}
}
