package exercicio.CarroArryList;

public class Carro {
	private String modelo, montadora, cor;
	private double cavalos, velocidadeMax;
	
	public Carro (String modelo, String montadora, String cor, double cavalos, double velocidadeMax) {
		
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMontadora() {
		return montadora;
	}
	
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getCavalos() {
		return cavalos;
	}
	
	public void setCavalos(double cavalos) {
		this.cavalos = cavalos;
	}
	
	public double getVelocidadeMax() {
		return velocidadeMax;
	}
	
	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
}
