package exercicio.aluno;

public class Aluno {
	
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		setNome(nome);
		setNota(nota);
	}
	public Aluno() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
}
