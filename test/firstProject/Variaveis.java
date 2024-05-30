package firstProject;

public class Variaveis {
	public String nome = "Maria";
	public String sobrenome = "DB";
	public char sexo = 'F';
	public int idade = 40;
	public float salario = 10240.74f;
	public boolean casado = false;
	
	public void mostrarInformacoes() {
		String mensagem = "Nome: " + this.nome + ", Sobrenome: " + this.sobrenome + ", Idade: " + this.idade + ", Sexo: " + this.sexo + ", Salário: " + this.salario + ", Casado: " + this.casado;
		System.out.println(mensagem);
		System.out.println(String.format("Nome: %s, Sobrenome: %s, Idade: %d, Sexo: %c, Salario: %f, Casado: %b\n", this.nome, this.sobrenome, this.idade, this.sexo, this.salario, this.casado) );
		System.out.println(this.salario + this.idade);
		System.out.println();
	}
}
