package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para ler 5 números, informar o maior número e a média 
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex3MediaNumeros {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		// Declarando e inicializando variáveis.
		int i = 1, numero = 0, maiorNumero = 0, total = 0;
		double media = 0;
		
		// Fazendo a leitura dos números.
		while(i <= 5) {
			System.out.println("Digite um número");
			
			numero = scann.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
	
			total += numero;
			i++;
		}
		
		// Obtendo a média.
		media = (double)total / (double)i;
		// Printando o resumo.
		System.out.println("O total foi de " + total + 
				", a média foi de " + String.format("%.2f", media) + ", e o maior número foi " + maiorNumero);
		
		// Fechando o scanner.
		scann.close();
	}
}
