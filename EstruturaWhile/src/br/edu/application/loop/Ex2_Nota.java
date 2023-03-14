package br.edu.application.loop;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Informe a Nota de 0 a 10: ");
		nota = sc.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota Inválida! Digite novamente: ");
				nota = sc.nextInt();
			}
		System.out.println("Nota informada: " + nota);
		sc.close();
		
		}
		
		
		

	}

