package escola;

public class Aluno {
	private static int MATRICULA = 0;
	private String nome;
	private int matricula;
	
	public Aluno(String texto) {
		this.setNome(texto);
		this.setMatricula(++Aluno.MATRICULA);
	}
	
	public Aluno(String texto, int matricula) {
		this.setNome(texto);
		this.setMatricula(matricula);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Vianna");
		System.out.println("Nome: " + aluno.getNome() + " | " + "Matricula: " + aluno.getMatricula());	
	}
}
