package contas;

import cliente.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	
	public void extrato() {
		System.out.println("Conta poupança");
		this.exibirInfoComum();
	}

}
