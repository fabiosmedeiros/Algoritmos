package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para ler 5 n�meros, informar o maior n�mero e a m�dia 
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex3MediaNumeros {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		// Declarando e inicializando vari�veis.
		int i = 1, numero = 0, maiorNumero = 0, total = 0;
		double media = 0;
		
		// Fazendo a leitura dos n�meros.
		while(i <= 5) {
			System.out.println("Digite um n�mero");
			
			numero = scann.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
	
			total += numero;
			i++;
		}
		
		// Obtendo a m�dia.
		media = (double)total / (double)i;
		// Printando o resumo.
		System.out.println("O total foi de " + total + 
				", a m�dia foi de " + String.format("%.2f", media) + ", e o maior n�mero foi " + maiorNumero);
		
		// Fechando o scanner.
		scann.close();
	}
}
