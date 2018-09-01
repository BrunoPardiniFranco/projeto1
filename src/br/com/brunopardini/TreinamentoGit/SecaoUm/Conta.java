package br.com.brunopardini.TreinamentoGit.SecaoUm;

import java.util.LinkedList;
import java.util.List;

public class Conta {
	
	private String nomeCliente;
	private int numeroConta;
	private int senha;
	private String cpf;
	private double saldo;
	private List<Transacao> transacoes = new LinkedList<Transacao>();
	
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
	public boolean sacar(double saque) {
		if(saque <= saldo && (saque > 0)) {
			saldo -= saque;
			Transacao transacao = new Transacao(saldo);
			transacao.historicoSaque(this, saque);
			return true;
		} else {
			return false;
		}
	}	
	
	private void notificarConclusaoSaque(Transacao Transacao) {
		
	}
	

}
