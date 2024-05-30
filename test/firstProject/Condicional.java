package firstProject;

public class Condicional {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		if (20 < 18) {
			System.out.println("20 é menor que 18");
		} else {
			System.out.println("20 é maior que 18");
		}
		
		switch (5) {
			case 1: {
				System.out.println("1");
			}
			case 5: {
				System.out.println("5");
			}
			default: {
				System.out.println("Default, vai ser executado se não colocar o break");
			}
		}
		
		switch (5) {
			case 1: {
				System.out.println("1");
				break;
			}
			case 5: {
				System.out.println("5");
				break;
			}
			default: {
				System.out.println("Default, vai ser executado se não colocar o break");
			}
		}
		
		int tempo = 9;
				
		if (tempo < 12) {
			System.out.println("Bom dia");
		} else if (tempo <= 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
		String ternario = (true ? "True" : "False");
		System.out.println(ternario);
		ternario = (false ? "True" : "False");
		System.out.println(ternario);
	}
}
