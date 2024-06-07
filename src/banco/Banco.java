package banco;

import java.util.ArrayList;
import java.util.List;

import cliente.Cliente;
import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Banco {
	private List<Conta> listaContas;
	
	public Banco() {
		this.listaContas = new ArrayList<Conta>();
	}
	public Conta criarContaCorrente(String nomeCliente) {
		Conta contaCorrente = new ContaCorrente(new Cliente(nomeCliente));
		listaContas.add(contaCorrente);
		return contaCorrente;
	}
	public Conta criarContaPoupanca(String nomeCliente) {
		Conta contaPoupanca = new ContaPoupanca(new Cliente(nomeCliente));
		listaContas.add(contaPoupanca);
		return contaPoupanca;
	}
	public void exibirContas() {
		listaContas.stream().forEach(Conta::exibirInfoComum);
	}
	
}
