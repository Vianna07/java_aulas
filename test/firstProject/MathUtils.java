package firstProject;

public class MathUtils {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 17;
		
		int maiorNumero = Math.max(num1, num2);
		int menorNumero = Math.min(num1, num2);
		
		double raiz = Math.sqrt(144);
		
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Menor número: " + menorNumero);
		System.out.println("Raiz do número 144: " + raiz);
	}
}
