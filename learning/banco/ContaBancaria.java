package banco;

public class ContaBancaria {
	protected double saldo = 0;
	
	/**
	  Deposita dinheiro na conta bancária
	  @param valor a depositar
	  @return void, apenas deposita o valor na saldo e mostra uma mensgaem
	*/
	public void depositar(double valor) {
		System.out.println("Depositado: R$: " + valor);
		this.saldo += valor;
	}
	
	/**
	 Obtém o saldo final da conta bancária
	 @return saldo atual
	*/
	public double retornarSaldo() {
		return this.saldo;
	}
	
	
	/**
	Saca o valor do saldo, caso o valor seja maior que o saldo atual, mostra uma mensgaem dizendo que o valor que a pessoa deseja sacar ultrapassa limite do saldo
	@param valor que deseja sacar
	@return void
	*/
	public void sacar(double valor) {
//		if ((this.saldo - valor) < 0) {
		if (valor > this.saldo) {
			System.out.println("Não é possivel sacar o valor: R$" + valor + " pois excede o limite de saldo");
		} else {
			System.out.println("Sacado: R$: " + valor);
			this.saldo -= valor;
		} 
	}
}
