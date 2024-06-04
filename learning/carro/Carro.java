package carro;

public class Carro {
	public static int id = 0;
	private int identificador;
	private String nome;
	private float kmPorLitro;
	
	public Carro(String nome, float kmPorLitro) {
		this.identificador = ++Carro.id;
		this.nome = nome;
		this.kmPorLitro = kmPorLitro;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(float kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}
	
	public void  exibirAtributos() {
		System.out.println("Identificador: " + this.identificador);
		System.out.println("nome: " + this.nome);
		System.out.println("kmPorLitro: " + this.kmPorLitro + "\n");
	}
}
