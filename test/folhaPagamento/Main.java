package folhaPagamento;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		List<Float> dados = Main.pegarDados();
		mostrarFolhaPagamento(dados.get(0), dados.get(1), dados.get(2));
	}
	
	public static float calcularSalarioBruto(float valorHora, float horasTrabalhadas) {
		return valorHora * horasTrabalhadas;
	}
	
	public static float calcularSalarioLiquido(float salarioBruto, float somaImpostos) {
		return salarioBruto - Main.somarImpostos(salarioBruto);
	}
	
	public static float somarImpostos(float salarioBruto) {
		float IR = Main.pegarValorImposto("IR", salarioBruto);
		float INSS = Main.pegarValorImposto("INSS", salarioBruto);
		float SINDICATO = Main.pegarValorImposto("SINDICATO", salarioBruto);
		
		return IR + INSS + SINDICATO;
	}
	
	public static float pegarValorImposto(String nomeImposto, float salarioBruto) {
		switch (nomeImposto) {
			case "IR": 
				return Main.calcularValorImposto(salarioBruto,  Main.pegarValorPorcentagemImposto(nomeImposto, salarioBruto));			
			case "INSS": 
				return Main.calcularValorImposto(salarioBruto, Main.pegarValorPorcentagemImposto(nomeImposto, salarioBruto));	
			case "SINDICATO": 
				return Main.calcularValorImposto(salarioBruto, Main.pegarValorPorcentagemImposto(nomeImposto, salarioBruto));
			case "FGTS": 
				return Main.calcularValorImposto(salarioBruto, Main.pegarValorPorcentagemImposto(nomeImposto, salarioBruto));	
			default:
	            throw new IllegalArgumentException("Imposto não reconhecido: " + nomeImposto);
		}
	}
	
	public static float calcularValorImposto(float salarioBruto, float porcentagemImposto) {
		return salarioBruto * porcentagemImposto;
	}
	
	public static float pegarValorPorcentagemImposto(String nomeImposto, float salarioBruto) {		
		switch (nomeImposto) {
			case "IR": 
				return Main.pegarValorPorcentagemIR(salarioBruto);
			case "INSS": 
				return 0.1f;			
			case "SINDICATO": 
				return 0.03f;
			case "FGTS": 
				return 0.11f;		
			default:
	            throw new IllegalArgumentException("Imposto não reconhecido: " + nomeImposto);
		}
	}
	
	public static float pegarValorPorcentagemIR(float salarioBruto) {
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
	
	public static void mostrarFolhaPagamento(float horasTrabalhadas, float valorHora, float salarioBruto) {
		float somarImposto = Main.somarImpostos(salarioBruto);
		String resposta;

		System.out.println("");
		System.out.println(String.format("(+) Salário Bruto(%.2f * %.2f): R$%.2f", valorHora, horasTrabalhadas, salarioBruto));
		System.out.println(String.format("(-) IR(%.2f%%)................: R$%.2f", Main.pegarValorPorcentagemImposto("IR", salarioBruto) * 100, Main.pegarValorImposto("IR", salarioBruto)));
		System.out.println(String.format("(-) INSS(%.2f%%)..............: R$%.2f", Main.pegarValorPorcentagemImposto("INSS", salarioBruto) * 100, Main.pegarValorImposto("INSS", salarioBruto)));
		System.out.println(String.format("(-) SINDICATO(%.2f%%).........: R$%.2f", Main.pegarValorPorcentagemImposto("SINDICATO", salarioBruto) * 100, Main.pegarValorImposto("SINDICATO", salarioBruto)));
		System.out.println(String.format("(+) FGTS(%.2f%%)..............: R$%.2f", Main.pegarValorPorcentagemImposto("FGTS", salarioBruto) * 100, Main.pegarValorImposto("FGTS", salarioBruto)));
		System.out.println(String.format("(-) Total de Descontos........: R$%.2f", somarImposto));
		System.out.println(String.format("(+) Salário Líquido...........: R$%.2f", Main.calcularSalarioLiquido(salarioBruto, somarImposto)));
		System.out.println("");
		
		while (true) {	
			System.out.print("Deseja ver outra folha de pagamento[S/N]?: ");

			resposta = Main.scanner.nextLine().toUpperCase();

			if (resposta.equals("S")) {
				Main.limparTela();
				Main.main(null);
			} else if (resposta.equals("N")) {
				System.out.close();
			} else {
				System.out.println("Opção inválida digite novamente...");
			}
		}

	}
	
	public static void limparTela() {  
	    System.out.print("\n".repeat(40));  
	}  
	
	public static List<Float> pegarDados() {
		System.out.print("Digite suas horas trabalhadas: ");
		float horasTrabalhadas = Main.scanner.nextFloat();
		System.out.print("Digite o valor da sua hora: ");
		float valorHora = Main.scanner.nextFloat();
		float salarioBruto = Main.calcularSalarioBruto(valorHora, horasTrabalhadas);
		Main.scanner.nextLine();
		
		return Arrays.asList(horasTrabalhadas, valorHora, salarioBruto);
	}
}
