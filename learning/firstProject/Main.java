package firstProject;

public class Main {
	public static void main(String[] args) {
		Variaveis variaveis = new Variaveis();
		variaveis.mostrarInformacoes();
		
		Retangulo retangulo1 = new Retangulo(5, 6);
		Retangulo retangulo2 = new Retangulo(8, 11);

		retangulo1.mostrarArea();
		retangulo2.mostrarArea();
	}
}
