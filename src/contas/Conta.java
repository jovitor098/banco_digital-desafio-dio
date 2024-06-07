package contas;

import cliente.Cliente;

public abstract class Conta {
	private static int SEQUENCIAL = 1;
		
	private int numero;
	private int agencia = 1;
	private double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.numero = SEQUENCIAL++;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	public void sacar(double saque) {
		if (saque > saldo)
			System.out.println("Saque maior que o saldo");
		else
			this.saldo -= saque;
	}
	public void transferir(Conta contaDestino, double valor) {
		if (valor > this.saldo)
			System.out.println("Valor a ser transferido é maior que o saldo");
		else
			this.saldo -= valor;
			contaDestino.depositar(valor);
	}
	public void exibirInfoComum() {
		System.out.println(String.format("Cliente: %s, numero: %s, agencia: %s, saldo: %.2f",
				this.cliente.getNome(), getNumero(), getAgencia(), getSaldo()));
	}
	

	public abstract void extrato();

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
