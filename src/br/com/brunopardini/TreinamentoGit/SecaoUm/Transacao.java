package br.com.brunopardini.TreinamentoGit.SecaoUm;

import java.util.Calendar;
import java.util.Date;

public class Transacao {
	
	private Conta conta;
	private CaixaEletronico caixaEletronico;
	private String operacao;
	private double valorTransacao;
	private Calendar dataTransacao;
	private boolean transacaoAceita;
	public double saldoDaConta;
	
	public Transacao(Conta conta) {
		this.conta = conta;
	}
	
	public void historicoTransacao(double valor) {
		this.valorTransacao = valor;
		this.saldoDaConta = conta.getSaldo();
		dataTransacao = construirDataTransacao();
	}
	
	private Calendar construirDataTransacao() {
		Date data = new Date(System.currentTimeMillis());
		Calendar dataTransacao = Calendar.getInstance();
		dataTransacao.setTime(data);
		return dataTransacao;
	}
	
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public void setTransacaoAceita(boolean transacaoAceita) {
		this.transacaoAceita = transacaoAceita;
	}

	public String getOperacao() {
		return operacao;
	}

	public double getValorTransacao() {
		return valorTransacao;
	}


	public Calendar getDataTransacao() {
		return dataTransacao;
	}
	
	public double getSaldoDaConta() {
		return saldoDaConta;
	}
}
