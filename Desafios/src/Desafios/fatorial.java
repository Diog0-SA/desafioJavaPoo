/*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Escreva um programa para calcular o fatorial de um número fornecido pelo usuário.
 */
package Desafios;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
        
        Scanner fatorial = new Scanner(System.in); // Abrindo scanner
        
        System.out.println("Digite um número para calcular o fatorial: ");
        int n = fatorial.nextInt(); 
        
        fatorial.close(); // Fechando Scanner
        
        // Verifica se o número é não negativo
        if(n < 0){
            System.out.println("O fatorial não está definido para números negativos.");
        } 
        else{
            long F = 1; 
            
            // Cálculo
            for (int i = 1; i <= n; i++) {
                F *= i;
            }
            
            // resultado
            System.out.println("O fatorial de " + n + " é " + F);
        }
        
        
    }

}
