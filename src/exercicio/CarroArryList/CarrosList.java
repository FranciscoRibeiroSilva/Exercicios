package exercicio.CarroArryList;

import java.util.ArrayList;
import java.util.Scanner;



public class CarrosList {
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList <Carro> carros = new ArrayList<Carro>();
	
	public static void main(String[] args) {
		
		boolean executar = true;
		while(executar) {
			exibirMenu();
			int opcao = capturaOpcao();
			switch(opcao) {
			case 1:
				listarCarros();
				break;
			case 2:
				carros.add(criarCarro());
				break;
			case 3:
				int pos;
				listarCarros();
				System.out.println("De qual carro deseja alterar os dados");
				pos = capturaOpcao();
				alterarCarro(pos);
				break;
			case 4:
			case 5:
				listarCarros();
				removerCarro();
				break;
			case 0:
			default:
				System.out.println("Por favor escolha outra opção");
				break;
			}
		}
	}
	
	private static void exibirMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("RESGISTRO AUTOMOTIVO\n");
		sb.append("1. Listar carros\n");
		sb.append("2. Adicionar carro\n");
		sb.append("3. Alterar dados de veiculo\n");
		sb.append("4. Buscar veiculo\n");
		sb.append("5. Remover carro\n");
		sb.append("0. Encerrar\n");
		System.out.println(sb.toString());
	}
	
	private static int capturaOpcao(){
		System.out.println("O que quer fazer?");
		int opcao = Integer.parseInt(sc.next());
		return opcao;
	}
	
	
	private static void alterarCarro(int posicao) {
		Carro selecionado = carros.get(posicao);
		System.out.println("O que o deseja alterar? \n1. Modelo \n2. Montadora \n3. Cor \n4. Cavalos \n5. Velocidade Maxima \n6. Todos os registros");
		
		int opcao = capturaOpcao();
		String modelo, montadora, cor;
		double cavalos, velocidadeMax;
		
		switch(opcao) {
		case 1:
			modelo = capturaModelo();
			selecionado.setModelo(modelo);
			break;
		case 2:
			montadora = capturaMontadora();
			selecionado.setMontadora(montadora);
			break;
		case 3:
			cor = capturaCor();
			selecionado.setCor(cor);
			break;
		case 4:
			cavalos = capturaCavalos();
			selecionado.setCavalos(cavalos);
			break;
		case 5:
			velocidadeMax = capturaVelocidadeMax();
			selecionado.setVelocidadeMax(velocidadeMax);
			break;
		case 6:
			modelo = capturaModelo();
			montadora = capturaMontadora();
			cor = capturaCor();
			cavalos = capturaCavalos();
			velocidadeMax = capturaVelocidadeMax();
			selecionado.setModelo(modelo);
			selecionado.setMontadora(montadora);
			selecionado.setCor(cor);
			selecionado.setCavalos(cavalos);
			selecionado.setVelocidadeMax(velocidadeMax);
			break;
		default:
			System.out.println("Escolha uma opção valida");
			break;
		}
	}
	private static Carro criarCarro() {
		String modelo = capturaModelo();
		String montadora = capturaMontadora();
		String cor = capturaCor();
		double cavalos = capturaCavalos();
		double velocidadeMax = capturaVelocidadeMax();
		return new Carro(modelo, montadora, cor, cavalos, velocidadeMax);
	}
	
	private static String capturaModelo() {
		System.out.println("Digite o modelo do carro");
		String modelo = sc.next();
		return modelo;
	}
	
	private static String capturaMontadora() {
		System.out.println("Digite o nome da montadora do veiculo");
		String montadora = sc.next();
		return montadora;
	}
	
	private static String capturaCor() {
		System.out.println("Digite a cor do automovél");
		String cor = sc.next();
		return cor;
	}
	
	private static double capturaCavalos() {
		System.out.println("Digite a quantidades de cavalos do motor do veiculo");
		double cavalos = Double.parseDouble(sc.next());
		return cavalos;
	}
	
	private static double capturaVelocidadeMax() {
		System.out.println("Digite a velocidade maxima do carro");
		double velocidadeMax = Double.parseDouble(sc.next());
		return velocidadeMax;
	}
	
	private static void listarCarros() {

		if(carros.isEmpty()) {
			System.out.println("Nenhum carro registrado!");
		}
		else {
			int pos = 0;
			for(Carro a : carros) {
				System.out.println(pos+"\nModelo: "+a.getModelo()+"\nMontadora: "+a.getMontadora()+"\nCor: "+a.getCor()+"\nCavalos: "+a.getCavalos()+"\nVelocidade Maxima: "+a.getVelocidadeMax()+"\n________________________");
				pos++;
			}
		}
	}

	private static void removerCarro() {
		System.out.println("Qual carro deseja remover?");
		carros.remove(capturaOpcao());
	}
}
