/*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Desenvolva um programa que conta o número de palavras em uma string fornecida pelo usuário. 
 * Considere que as palavras são separadas por espaços.
 */
package Desafios;

import java.util.Scanner;

public class ContadorPalavra {

	public static void main(String[] args) {
		
		
		Scanner palavra = new Scanner(System.in); // Abrindo Scanner
		
		// Pegando a frase
		System.out.println("Digite a frase: ");
		String frase = palavra.nextLine();

		palavra.close(); // Fechando Scanner
		
		// Cálculo
		String[] palavras = frase.split(" ");
        int cont = palavras.length;
		

		// Resultado
		System.out.println("Na frase '" + frase + "' Tem " + cont + " palavras");
	}
}
