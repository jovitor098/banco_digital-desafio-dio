package banco;

import contas.Conta;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		Conta conta1 = banco.criarContaCorrente("Maria");
		
		System.out.println(conta1.getSaldo());
		conta1.depositar(500);
		System.out.println(conta1.getSaldo());
		conta1.sacar(600);
		conta1.sacar(400);
		System.out.println(conta1.getSaldo());
		conta1.extrato();
		
		Conta conta2 = banco.criarContaPoupanca("João");
		
		conta2.depositar(300);
		conta2.transferir(conta1, 500);
		System.out.println(conta2.getSaldo());
		conta2.transferir(conta1, 100);
		System.out.println(conta2.getSaldo());
		
		banco.exibirContas();
		
	}
}
