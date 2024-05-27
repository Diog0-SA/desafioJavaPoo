 /*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Verificar se o número informado pelo usuário é primo.
 */
package Desafios;

import java.util.Scanner;

public class VerificarNumeroPrimo {

	public static void main(String[] args) {
		Scanner primo = new Scanner(System.in); // Abrindo Scanner
		
		// Variavéis
		boolean nPrimo = true;
		
		// Pegando o valor
		System.out.println("Digite um valor: ");
		double n = primo.nextDouble(); 
		
		primo.close(); // Fechano Scanner
		
		// Verificação
		if(n <= 0) {
			nPrimo = false;
		}else{
			for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) {
	                nPrimo = false;
	                }
	        }
		}
		
		// Resultado
		if(nPrimo == false) {
			System.out.println("O número " + n + " não é primo." );
		}
		else if(n == 1) {
			System.out.println("A definição de número primo diz que primo é todo número natural que é divisível \n por 1 e por ele mesmo e maior ou igual a dois. Logo, 1 não pode ser primo.");
		}
		else{
			System.out.println("O número " + n + " é primo." );
		}
		
	}
}
