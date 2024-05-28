package folhaPagamento;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite suas horas trabalhadas: ");
		int horasTrabalhadas = scanner.nextInt();
		System.out.print("Digite o valor da sua hora: ");
		float valorHora = scanner.nextFloat();
		float salarioBruto = calcularSalarioBruto(valorHora, horasTrabalhadas);
		
		mostrarFolhaPagamento(valorHora, horasTrabalhadas, salarioBruto);
	}
	
	public static float calcularSalarioBruto(float valorHora, int horasTrabalhadas) {
		return valorHora * horasTrabalhadas;
	}
	
	public static float calcularSalarioLiquido(float salarioBruto, float somaImpostos) {
		return salarioBruto - somarImpostos(salarioBruto);
	}
	
	public static float somarImpostos(float salarioBruto) {
		float IR = pegarImposto("IR", salarioBruto);
		float INSS = pegarImposto("INSS", salarioBruto);
		float sindicato = pegarImposto("SINDICATO", salarioBruto);
		
		return IR + INSS + sindicato;
	}
	
	public static float pegarImposto(String nomeImposto, float salarioBruto) {
		float imposto = 0;
		switch (nomeImposto) {
			case "IR": {
				imposto = calcularIR(salarioBruto);
				break;
			}
			case "INSS": {
				imposto = calcularImposto(salarioBruto, pegarPorcentagemImposto(nomeImposto, salarioBruto));	
				break;
			}
			case "SINDICATO": {
				imposto = calcularImposto(salarioBruto, pegarPorcentagemImposto(nomeImposto, salarioBruto));			
			}
			case "FGTS": {
				imposto = calcularImposto(salarioBruto, pegarPorcentagemImposto(nomeImposto, salarioBruto));			
			}
		}
		
		return imposto;
	}
	
	public static float pegarPorcentagemImposto(String nomeImposto, float salarioBruto) {
		float porcentagem = 0;
		switch (nomeImposto) {
			case "IR": {
				porcentagem = pegarPorcentagemIR(salarioBruto);
				break;
			}
			case "INSS": {
				porcentagem = 0.1f;			
				break;
			}
			case "SINDICATO": {
				porcentagem = 0.03f;		
			}
			case "FGTS": {
				porcentagem = 0.11f;		
			}
		}
		
		return porcentagem;
	}
	
	public static float calcularIR(float salarioBruto) {
		return salarioBruto * pegarPorcentagemIR(salarioBruto);
	}
	
	public static float pegarPorcentagemIR(float salarioBruto) {
		if (salarioBruto <= 900) {
			return 0;
		} else if (salarioBruto <= 1500) {
			return 0.05f;
		} else if (salarioBruto <= 2500) {
			return 0.1f;
		} else {
			return 0.2f;
		}
	}
	
	public static float calcularImposto(float salarioBruto, float porcentagemImposto) {
		return salarioBruto * porcentagemImposto;
	}
	
	public static void mostrarFolhaPagamento(float valorHora, int horasTrabalhadas, float salarioBruto) {
		float somarImposto = somarImpostos(salarioBruto);
	
		System.out.print("\n");
		System.out.println(String.format("(+) Salário Bruto(%.2f * %d): R$%.2f", valorHora, horasTrabalhadas, salarioBruto));
		System.out.println(String.format("(-) IR(%.2f%%)................: R$%.2f", pegarPorcentagemImposto("IR", salarioBruto) * 100, pegarImposto("IR", salarioBruto)));
		System.out.println(String.format("(-) INSS(%.2f%%).............: R$%.2f", pegarPorcentagemImposto("INSS", salarioBruto) * 100, pegarImposto("INSS", salarioBruto)));
		System.out.println(String.format("(+) FGTS(%.2f%%).............: R$%.2f", pegarPorcentagemImposto("FGTS", salarioBruto) * 100, pegarImposto("FGTS", salarioBruto)));
		System.out.println(String.format("(-) Total de Descontos.......: R$%.2f", somarImposto));
		System.out.println(String.format("(+) Salário Líquido..........: R$%.2f", calcularSalarioLiquido(salarioBruto, somarImposto)));
	}
}
