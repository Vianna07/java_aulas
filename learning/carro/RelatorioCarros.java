package carro;

import java.util.ArrayList;

public class RelatorioCarros {
	private ArrayList<Carro> carros;
	private Carro carroMenorConsumo;
	
	public RelatorioCarros(ArrayList<Carro> carros) {
		this.carros = carros;
		this.exibirRelatorio();
	}
	
	public void exibirRelatorio() {
		int maiorKmPorLitro;
		
		for (Carro carro: this.carros) {
			System.out.println(carro.getIdentificador() + " - " + carro.getNome() + " - " + carro.getKmPorLitro() + " - " + (1000/carro.getKmPorLitro()) + " litros");
		}
	}
}
