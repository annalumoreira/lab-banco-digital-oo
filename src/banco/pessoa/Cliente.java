package banco.pessoa;

import banco.conta.Conta;
import banco.conta.ContaPoupanca;
import banco.conta.ContaCorrente;
import banco.exception.SaldoInsuficienteException;
import banco.exception.ValorInvalidoException;

public class Cliente extends Pessoa {

	private ContaPoupanca contaPoupanca;
	private ContaCorrente contaCorrente;

	public Cliente(int cpf, String nome, String senha) {
		super(cpf, nome, senha);
		this.contaPoupanca = null;
		this.contaCorrente = null;
	}

	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void depositar(double valor, Conta conta) throws ValorInvalidoException {
		conta.depositar(valor);
	}

	public void sacar(double valor, Conta conta) throws ValorInvalidoException, SaldoInsuficienteException {
		conta.sacar(valor);
	}

	public void transferir(double valor, Conta conta, Conta contaDestino) throws SaldoInsuficienteException, ValorInvalidoException {
		conta.transferir(valor, contaDestino);
	}

}
