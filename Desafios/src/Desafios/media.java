/*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Peça ao usuário para inserir uma série de números e calcule a média deles.
 */
package Desafios;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		
		// Variavéis
		int i = 0;
		double n = 0;
		
		String continuar = "S"; // Condição para continuar.
		
		Scanner media = new Scanner(System.in); // Abrindo Scanner
		
		while(continuar.equals("S")) { // Loop
			
			
			// Definindo os valores
			System.out.println("Digite o " + (i +1) + "ª valor: ");
			String numS = media.nextLine();
			double num = Double.parseDouble(numS);
			n += num; 
			i ++; 
			
			// Validação para continuar no loop
			System.out.println("Deseja continuar? [S/N] ");
			continuar = media.nextLine().toUpperCase().trim().substring(0, 1); // Corta os espaços - usa apenas o primeiro caractér
			
			while(!continuar.equals("S") && !continuar.equals("N")) { // Tratamento de erro - caso seja digitado outro valor
				System.out.println("Valor inserido incorreto. Digite novamente: ");
				System.out.println("Deseja continuar? [S/N] ");
				continuar = media.nextLine().toUpperCase();
			}
			
			 
		}
		media.close(); // Fechando o Scanner
		
		// Cálculo
		double resultado = n / i;
		
		// mostrando resultado
		System.out.println("Ao todo foram digitados " + i + " números.");
		System.out.println("A soma de todos é " + n);
		System.out.println("A média dos " + i + " números é = " + resultado);
	}
}
