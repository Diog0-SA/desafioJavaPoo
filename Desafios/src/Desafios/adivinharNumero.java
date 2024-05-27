/*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Crie um jogo em que o programa gera aleatoriamente um número entre 1 e 100,
		e o usuário tenta adivinhar qual é. O programa deve fornecer dicas indicando se
		o número fornecido é maior ou menor que o número secreto.
 */
package Desafios;

import java.util.Scanner;
import java.util.Random;

public class adivinharNumero {
	
	public static void main(String[] args) {
		
		Scanner jogo = new Scanner(System.in); // Abrindo Scanner
		Random maquina = new Random();
		
		// Variavéis
		int numMaquina = maquina.nextInt(100) + 1; // Escolhendo o número da maquina
		int cont = 1;
		int palpite;
		boolean acertou = false;
		
		// Boas-vindas
		System.out.println("------------------BEM-VINDO------------------");
		System.out.println("Neste jogo você deverá adivinhar que número a máquina(eu) estou pensando. "
				+ "\nAntes algumas considerações:"
				+ "\n"
				+ "\n- O número varia de 1 até 100."
				+ "\n- Você pode tentar quantas vezes quiser."
				+ "\n- Divirta-se."
				+ "\n---------------------------------------------");
		
		// Palpite do jogador
		while(acertou == false) {
			System.out.println("Diga, em qual número estou pensando: ");
			palpite = jogo.nextInt();
			
			if(palpite == numMaquina) {
				System.out.println("MEUS PARABÉNS. o número realmente era " + palpite + "\nVocê acertou em " + cont + " tentativas.");
				acertou = true;
			}
			else if(palpite < numMaquina && palpite < 100 && palpite > 0) {
				System.out.println("O número que pensei é maior que " + palpite);
			}
			else if(palpite > numMaquina && palpite < 100 && palpite > 0) {
				System.out.println("O número que pensei é menor que " + palpite);
			}
			else if(palpite > 100) {
				System.out.println("Calma ai calabreso! O número é menor que 100.");
			}
			else if(palpite < 1) {
				System.out.println("Calma ai calabreso! O número é maior que 0.");
			}
			cont++;
		}
		
		jogo.close(); // Fechando Scanner
	}
}
