package edu.digital.inovation.bascecamp.fluxo;

public class Main {
	//Decisão: if, if-else, if-else-if, switch e operador ternario
	//Repetição: for, while, do while
	//Interupção: break, continue e return
	public static void main(String[] args) {
		
		//ifFlecha();
		ifSemflecha();
		ifFerias();
		ifMenor();
		
		switchSemana();
		switchNumero();
		switchFerias();
		
	}
	// apliquei sem flecha	
	private static void ifSemflecha() {
		int mes = 9;
		if (mes <= 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if(mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if(mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if(mes == 11) {
			System.out.println("Novembro");
		} else {System.out.println("Dezembro");
			}		
		
	}
	
	private  static void ifFerias() {
		// como não usar
		String mes = "julho";
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("Ferias");
		}
	}
	
	private static void ifMenor() {
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10508d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		//deve ser evitado
		if ((salarioMensal < mediaSalario) && (quantidadeDependentes == mediaDependentes)) {
			System.out.println("Funcionário deve receber auxilio");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes; 
		
		if (salarioBaixo) {
			System.out.println("Funcionário deve receber auxilio ");
		} 
		
		boolean recebeAuxilo = (salarioBaixo) && (muitosDependentes);
		if (recebeAuxilo) {
			System.out.println("Funcionário deve receber auxilio. ");
		} else {
			System.out.println("Funcionário não deve receebr auxilio. ");
		}
		
	}
	
	private static void switchSemana() {
		String dia = "Terça";
		switch (dia) {
			case "Segunda":
			System.out.println(2);
			break;
		case "Terça":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(5);
			break;
		case "Quinta":
			System.out.println(5);
			break;
		case "Sexta":
			System.out.println(6);
			break;
		case "Sabado":
			System.out.println(7);
			break;
		case "Domingo":
			System.out.println(1);
			break;
		default:
			System.out.println(8);
			 System.out.println("Dia invalido");
			break;
		}
	}
	
	private static void switchNumero() {
		int numero = 4;
		switch (numero) {
			case 1:
			case 2:
			case 3:
				System.out.println("Certo");
				break;
			case 4: 
				System.out.println("Errado");
				break;
			case 5: 
				System.out.println("talvez");
				break;
			default:
				System.out.println("Valor indefinido");
				break;
		}
	}
	
	private static void switchFerias() {
		String mes = "Dezembro";
		switch (mes) {
			case "Dezembro":
			case "Julho":
			case "Janeiro":
				System.out.println("Ferias");
				break;
			default: 
				System.out.println("Mês indeferido");
				break;
		}
	}
 
}