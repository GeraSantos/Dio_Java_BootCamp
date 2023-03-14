package br.edu.beecrowd.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Numero do funcionário: ");
		int numFuncionario = sc.nextInt();
		
		//System.out.println("Quantidade horas trabalhadas: ");
		int numrHorasTrabalhadas = sc.nextInt();
		
		//System.out.println("Valor por hora: ");
		double valorPorHora = sc.nextDouble();
		
		double calculaSalario = numrHorasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f\n" , calculaSalario);
		
		
		sc.close();
		
	}

}
