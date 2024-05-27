 /*
 * Aluno: Diogo Silva Almeida
 * Universidade: Cruzeiro do sul
 * Campus: Santo Amaro
 * Matéria: Programação Orientada a Objeto
 * Professor: Diego Rocha
 * 
 * Objetivo: Criar uma simples calculadora, ela vai realizar operações de adição, subtração, 
	multiplicação e divisão.
 * */

package Desafios;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		System.out.println("-----------------CALCULADORA-----------------");
		System.out.println("você pode realizar as seguintes operações: \n-Adição \n-Subtração \n-Multiplicação \n-Divisão");
		System.out.println("---------------------------------------------");
			
			Scanner input = new Scanner(System.in); // Chamando o Scanner
			
			System.out.print("Digite o primeiro número: ");
			String n1 = input.nextLine();
			
			System.out.print("Digite o segundo número: ");
			String n2 = input.nextLine();
			
			System.out.println("Digite a operação: (+) (-) (*) (/)");
			String operador = input.nextLine();
			
			input.close(); // Fechando Scanner.
			double resultado = 0;
			boolean validador = true;
			
			// Convertendo para double
			double num1 = Double.parseDouble(n1);
			double num2 = Double.parseDouble(n2);
			
			// Fazendo a operação
			switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Desculpe ocorreu um erro. Tente novamente!");
                return;
			}
			
			// Monstrando resultado
			if(validador == true) {
				System.out.println("O resultado da operação( " + num1 + " "+ operador + " " + num2 + ") é: " + resultado );
			}
			
			
	}
			
}