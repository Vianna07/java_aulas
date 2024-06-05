package escola_exe_2;

import java.time.LocalTime;

public class Turma {
	private String codigo;
	private String sala;
	private LocalTime horario;
	private int numAlunos;
	private boolean completa;

	public Turma(String codigo, String sala, LocalTime horario, int numAlunos, boolean completa) {
		super();
		this.codigo = codigo;
		this.sala = sala;
		this.horario = horario;
		this.numAlunos = numAlunos;
		this.completa = completa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public int getNumAlunos() {
		return numAlunos;
	}

	public void setNumAlunos(int numAlunos) {
		this.numAlunos = numAlunos;
	}

	public boolean isCompleta() {
		return completa;
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}	
	
	public void estaCompleta() {
		
	}
}
