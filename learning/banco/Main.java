package banco;

public class Main {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		System.out.println("Saldo atual: " + conta.retornarSaldo());
		conta.depositar(5);
		System.out.println("Saldo atual: " + conta.retornarSaldo());
		conta.sacar(3);
		System.out.println("Saldo atual: " + conta.retornarSaldo());
		conta.sacar(10);
	}
}
