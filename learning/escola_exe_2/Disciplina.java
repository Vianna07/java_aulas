package escola_exe_2;

public class Disciplina {
	private String nome;
	private int numCreditos;
	
	public Disciplina(String nome, int numCreditos) {
		this.setNome(nome);
		this.setNumCreditos(numCreditos);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCreditos() {
		return numCreditos;
	}

	public void setNumCreditos(int numCreditos) {
		this.numCreditos = numCreditos;
	}
	
	public void estaCompleta() {
		
	}
	
	public void adicionar(Estudante estudante) {
		
	}
}
