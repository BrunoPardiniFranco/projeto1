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
	
	public Transacao(Conta conta) {
		this.conta = conta;
	}
	
	public void historicoSaque(boolean transacaoAceita, double valor) {
		operacao = "Saque";
		this.valorTransacao = valor;
		this.transacaoAceita = transacaoAceita;
		dataTransacao = construirDataTransacao();
	}
	
	private Calendar construirDataTransacao() {
		Date data = new Date(System.currentTimeMillis());
		Calendar dataTransacao = Calendar.getInstance();
		dataTransacao.setTime(data);
		return dataTransacao;
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

}
