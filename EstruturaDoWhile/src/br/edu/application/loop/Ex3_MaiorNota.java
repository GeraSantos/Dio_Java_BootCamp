package br.edu.application.loop;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorNota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		
		int soma = 0;
		
		int count = 0;
		
		do {
			System.out.println("Número: ");
			numero = sc.nextInt();
			
			soma = soma + numero;
			

			if (numero > maior) maior = numero;
			
			count++;
			
		}while(count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Media: " + (soma / 5));
	}

}
