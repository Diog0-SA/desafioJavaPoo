/*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Escreva um programa que recebe uma string do usuário e a imprime invertida.
		Por exemplo, se o usuário fornecer "hello", o programa deve imprimir "olleh".
 */
package Desafios;

import java.util.Scanner;

public class inverterString {

	public static void main(String[] args) {
		
		Scanner palavra = new Scanner(System.in); // Abrindo Scanner
		
		// Pegando a palavra
		System.out.println("Escreva uma palavra: ");
		String p = palavra.nextLine();
		
		palavra.close(); // Fechando Scanner
		
		// Invertendo
		StringBuilder invertida = new StringBuilder(p).reverse();
		
		// Resultado
		System.out.println("A palavra '" + p + "' invertida fica: " + invertida);
	}
}
