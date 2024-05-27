/*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Escreva um programa que gera a série de Fibonacci até um número fornecido pelo usuário.
 */
package Desafios;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner fibonacci = new Scanner(System.in); // Abrindo Scanner
		
		// Pegando número
		System.out.println("Digite um valor: ");
		int n = fibonacci.nextInt();
		
		fibonacci.close(); // Fechando Scanner
		
		// Cálculo e resultado
		int n1 = 0;
		int n2 = 1;
		
		System.out.println("A sequência até " + n + " é: ");
		
		System.out.print(n1 + " " + n2);
		
		while(true){
            int seguinte = n1 + n2;
            if (seguinte > n){
                break;
            }
            System.out.print(" " + seguinte);
            n1 = n2;
            n2 = seguinte;
        }
     }
	
}
