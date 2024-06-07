package contas;

import cliente.Cliente;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void extrato() {
		System.out.println("Conta Corrente");
		this.exibirInfoComum();
	}
	
}
