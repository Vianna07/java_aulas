package escola_exe_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Turma {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    private static final LocalTime horarioDeSaida = LocalTime.of(12, 0);
	
	private String codigo;
	private String sala;
	private String horarioEntrada;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	
	public Turma(String codigo, String sala, LocalTime horario) {		
		this.setCodigo(codigo);
		this.setSala(sala);
		this.setHorarioEntrada(formatter.format(horario));
	}
	
	public boolean estaAberta() {		
        final LocalTime _horarioEntrada = LocalTime.parse(horarioEntrada, Turma.formatter);
        final LocalTime horarioAtual = LocalTime.parse(Turma.formatter.format(LocalTime.now()), Turma.formatter) ;
        
        if (horarioAtual.compareTo(_horarioEntrada) > 0 && horarioAtual.compareTo(Turma.horarioDeSaida) < 0) {
        	return true;
        }
		
		return false;
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

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horario) {
		this.horarioEntrada = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void mostrarProfessor() {
		System.out.println("Professor: " + "Nome: " + this.professor.getNome() + " | " + "Titulação: " + this.professor.getTitulacao());
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void mostrarAlunos() {
		for (Aluno aluno : this.alunos) {
			System.out.println("Nome: " + aluno.getNome() + " | " + "Matricula: " + aluno.getMatricula());	
		}
	}
	
	public void incluirAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void removerAluno(int index) {
		this.alunos.remove(index);
	}
	
	public static void main(String[] args) {
		Turma turma = new Turma("2142", "Exatas", LocalTime.of(7, 30));
		System.out.println("Horario de entrada: " + turma.horarioEntrada + " | Turma esta aberta: " + turma.estaAberta());
		System.out.println("Professor: " + turma.professor);
		System.out.println("Alunos: " + turma.alunos);

		
		Professor professor = new Professor("Carlos", "Informática");
		turma.setProfessor(professor);
		
		System.out.println("\nProfessor definido!\n");
		
		turma.mostrarProfessor();
		
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno("Vianna"));
		alunos.add(new Aluno("Laira"));
		alunos.add(new Aluno("Fernando"));
		alunos.add(new Aluno("Joaquim"));
		alunos.add(new Aluno("Lucas"));
		alunos.add(new Aluno("Toshio"));
		alunos.add(new Aluno("Kahuan"));
		alunos.add(new Aluno("Vitor"));
		alunos.add(new Aluno("Tessaro"));
		turma.setAlunos(alunos);
		
		System.out.println("\nAlunos definidos!\n");
		
		turma.mostrarAlunos();
		
		
		Aluno alunoParaAdicionar = new Aluno("Hector");
		turma.incluirAluno(alunoParaAdicionar);
		
		System.out.println("\nAluno " + alunoParaAdicionar.getNome() + " incluido!\n");
		
		turma.mostrarAlunos();
				
//		Aluno alunoParaRemover = new Aluno("Tessaro", 9);
//		turma.removerAluno(turma.getAlunos().indexOf(alunoParaRemover));
//		
//		System.out.println("\nAluno " + alunoParaRemover.getNome() + " removido!\n");
//
//		turma.mostrarAlunos();
	}
}
