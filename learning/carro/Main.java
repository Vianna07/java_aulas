package carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Float> carrosMap = new HashMap<String, Float>();
		carrosMap.put("Fusca", 7f);
		carrosMap.put("Gol", 10f);
		carrosMap.put("Uno", 12.5f);
		carrosMap.put("Vectra", 5f);
		carrosMap.put("Peugeout", 14.5f);
		
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		for (Map.Entry<String, Float> entry : carrosMap.entrySet()) {
			carros.add(new Carro(entry.getKey(),entry.getValue()));
		}
		
		new RelatorioCarros(carros);
		
//		for (Carro carro : carros) {
//			carro.exibirAtributos();
//		}
	}
}
