package escola_exe_2;

public class Professor extends Usuario {
	private String titulacao;

	public Professor(String nome, String titulacao) {
		super(nome);
		this.setTitulacao(titulacao);
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}
