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
	
	public Aluno buscar(int pos) {
		if (pos >= 0 && pos < cont) {
			return alunos[pos];
		}
		else {
			return null;
		}
	}
	
	public boolean remover(int pos) {
		if(pos >= 0 && pos < cont) {
			for(int i = pos; i < cont - i; i++) {
				alunos[i] = alunos[i+1];
			}
			alunos[cont] = null;
			cont --;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void getLista() {
		for(int i = 0; i < cont; i++) {
			System.out.println(alunos[i]);
		}
	}
}
