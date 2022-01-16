package br.com.fabiosmedeiros;

import java.util.Scanner;

/**
 * Programa para gerar tabuada de qualquer 
 * n�mero inteiro entre 1 e 10.   
 * @author fabiosmedeiros
 * @version 1.0
 */
public class Ex5GeradorDeTabuada {
	public static void main(String[] args) {
		/* Instanciando a classe Scanner, 
		   para poder ler entrada do teclado. */
		Scanner scann = new Scanner(System.in);
		// Declarando e inicializando vari�veis.
		String numero = null;
		String operacao = "";
		
		do {
			// Exibindo mensagem e lendo n�mero.
			System.out.println("Digite um n�mero entre 1 e 10");
			
			numero = scann.next();
			
			// Se string n�o cont�m um n�mero, skipp.
			if(!isNumero(numero)) {
				continue;
			}
			
			// Exibe mensagem para saber a opera��o desejada.
			System.out.println("Digite a opera��o b�sica desejada (+ ou *)");
			
			operacao = scann.next();			
			boolean operacaoSelecionada = false;
			
			while(!operacaoSelecionada) {
				switch(operacao) {
				case "+":
					// Printando a tabuada de adi��o.
					System.out.println("Printando a tabuada de " + numero + " (+)");
					
					for (int i = 1; i <= 10; i++) {
						System.out.println(numero + " + " + i + " = " + (Integer.parseInt(numero) + i));
					}
					
					operacaoSelecionada = true;
					break;				
				case "*":
					// Printando a tabuada de multiplica��o.
					System.out.println("Printando a tabuada de " + numero + " (*)");
					
					for (int i = 1; i <= 10; i++) {
						System.out.println(numero + " * " + i + " = " + (Integer.parseInt(numero) * i));
					}
					
					operacaoSelecionada = true;
					break;
				default:
					System.out.println("Opera��o inv�lida. Digite a opera��o b�sica desejada (+ ou *)");
					operacao = scann.next();
				}
			}
						
			break;
		} while(true);
		
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
