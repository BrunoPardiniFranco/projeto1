package br.com.brunopardini.TreinamentoGit.SecaoUm;

import java.util.Calendar;
import java.util.Date;

public class Transacao {
	
	private Conta conta;
	private CaixaEletronico caixaEletronico;
	private String operacao;
	private double valor;
	private double saldoAtual;
	private Calendar dataTransacao;
	
	public Transacao(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	
	public Transacao historicoSaque(Conta conta, double valor) {
		operacao = "Saque";
		this.valor = valor;
		this.conta = conta;
		dataTransacao = construirDataTransacao();
		return this;
	}
	
	private Calendar construirDataTransacao() {
		Date data = new Date(System.currentTimeMillis());
		Calendar dataTransacao = Calendar.getInstance();
		dataTransacao.setTime(data);
		return dataTransacao;
	}

	public Conta getConta() {
		return conta;
	}


	public String getOperacao() {
		return operacao;
	}


	public double getValor() {
		return valor;
	}


	public Calendar getDataTransacao() {
		return dataTransacao;
	}

}
