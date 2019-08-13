
package br.com.projetoHospital.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	private String dtNascimento;
	private long cpf;

	public Pessoa(String nome, String sobrenome, String dtNascimento, long cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = gerarIdade(dtNascimento);
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getDtNascimento() {
		return dtNascimento;
	}


	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}


	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	

	private int gerarIdade(String mDtNascimento) {
		
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		int ano = Integer.parseInt(mDtNascimento.substring(6, 10));
		
		return anoAtual - ano;
	}
	
	public double calcularSalario() {
		return 0.0;
	}
	
	public void detalhe() {
		System.out.println("");
	}
	
	
	
}
