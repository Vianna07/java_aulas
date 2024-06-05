package escola_exe_2;

public class Estudante extends Usuario {
	private int matricula;

	public Estudante(String nome, int matricula) {
		super(nome);
		this.setMatricula(matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
