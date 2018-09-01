package br.com.brunopardini.TreinamentoGit.SecaoUm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Conta {

	private String nomeCliente;
	private int numeroConta;
	private int senha;
	private String cpf;
	private double saldo;
	private List<Transacao> transacoes = new LinkedList<Transacao>();
	
	public boolean sacar(double saque) {
		if (saque <= saldo && (saque > 0)) {
			saldo -= saque;
			return true;
		} 
		return false;
	}
	
	public boolean depositar(double deposito) {
		if (deposito > 0) {
			saldo += deposito;
			return true;
		}
		return false;
	}
	
	public void adicionarTransacoes(Transacao transacao) {
		this.transacoes.add(transacao);
	}
	
	public List<Transacao> getTransacoes(){
		return Collections.unmodifiableList(transacoes);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "mundanca";
	}
	
	

}
