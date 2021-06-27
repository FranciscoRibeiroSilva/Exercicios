package exercicio.aluno;

public class GestaoAlunos {
	
	public static void main(String[] args) {
		Aluno m1 = new Aluno("Martchélô", 5.5);
		Aluno m2 = new Aluno("Meliante", 10.0);
		Aluno m3 = new Aluno("Creusante", 7.0);
		
		Vetor lista = new Vetor();
		
		lista.adiciona(m1);
		lista.adiciona(m2);
		lista.adiciona(m3);
		
	}

}
