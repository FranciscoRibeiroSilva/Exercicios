package exercicio.src.contacorrente;

public class ContaCorrente {
	private double saldo;
	private Cliente cliente;
	private double numero;
	
	public ContaCorrente() {
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getNumero() {
		return numero;
	}
	
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public boolean saque(double valor) {
		saldo =- valor;
		return true;
	}
	
	public boolean deposito(double valor) {
		saldo =+ valor;
		return true;
	}
}
