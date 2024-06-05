package escola_exe_1;

public class Professor {
	private String nome;
	private String titulacao;
	
	public Professor(String nome, String titulacao) {
		this.setNome(nome);
		this.setTitulacao(titulacao);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public static void main(String[] args) {
		Professor professor = new Professor("Carlos", "Informática");
		System.out.println("Nome: " + professor.getNome() + " | " + "Titulação: " + professor.getTitulacao());
	}
}
