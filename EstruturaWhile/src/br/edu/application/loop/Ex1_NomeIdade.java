package br.edu.application.loop;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeIdade {

	public static void main(String[] args) {
		//fluxo de entrada classe Scanner
		Scanner sc = new Scanner(System.in);
		//variaveis
		String nome;
		int idade;
		//loop
		while(true) {
			System.out.println("Nome: ");
			nome = sc.next();
			if (nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade = sc.nextInt();
			
		}
		
		System.out.println("Continue aqui ....");
		
		
		sc.close();
		

	}

}
