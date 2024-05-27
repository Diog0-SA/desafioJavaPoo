/* 
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Converter Celsius para Fahrenheit
 */
package Desafios;

import java.util.Scanner;

public class ConversorDeTemperatura {

		public static void main(String[] args) { 
			
			System.out.println("Conversor de temperatura. Converte de Celsius(°C) para Fahrenheit(°F).");
			System.out.println("------------------------------------------------------------------------");
			
			Scanner input = new Scanner(System.in); // Abrindo Scanner.
			
			// Pegando a temperatura:
			
			System.out.print("Digite a temperatura(em Celsius(°C)): ");
			String temp = input.nextLine().replace(",", ".");
			
			input.close(); // Fechando Scanner.

			// Converterndo de String para double.
			double temperatura = Double.parseDouble(temp);
			
			// Fórmula: (0 °C × 9/5) + 32 = 32 °F;
			
			double F = (temperatura * 9/5) + 32;
			
			System.out.println(temperatura + " Celsius(°C) em Fahrenheit(°F) é igual a " + F);

		}
	}
