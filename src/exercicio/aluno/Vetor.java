package exercicio.aluno;

public class Vetor {
	
	private Aluno[] alunos = new Aluno[15];
	private int cont;
	
	public Vetor() {
		this.cont = 0;
	}
	
	public boolean adiciona(Aluno aluno) {
		if(cont < 15) {
			alunos[cont] = aluno;
			cont ++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean buscar(int pos) {
		if (pos >= 0 && pos < cont) {
			return true;
		}
		else {
			return false;
		}
	}
}
