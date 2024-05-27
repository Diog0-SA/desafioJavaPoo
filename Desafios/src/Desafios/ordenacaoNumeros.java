/*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Peça ao usuário para inserir uma série de números e ordene-os em ordem crescente.
 */
package Desafios;

import java.util.Scanner;
import java.util.Arrays;

public class ordenacaoNumeros {

	public static void main(String[] args) {
		
		Scanner ordem = new Scanner(System.in); // Abrindo Scanner
			
		// Pegando os números
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Ultilize um traço(-) para separar os números. Exemplo: 5-10-50-60-70");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Digite os valores: ");
		String stringN = ordem.nextLine();
	
		String[] n = stringN.split("-");
		
		ordem.close(); // Fechando Scanner	
		
		// Inicializando array
		int[] numeros = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            numeros[i] = Integer.parseInt(n[i].trim());
        }
        
        Arrays.sort(numeros); // Colocando em ordem
        
        // Resultado
        System.out.println("Os números em ordem crescente fica: ");
        for(int ordenados : numeros) {
        	System.out.print(ordenados + ",");

	}
	}
}
	

