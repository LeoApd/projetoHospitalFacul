
package br.com.projetoHospital.model;


public class Administrativo extends Pessoa{

	private double valorFixo;

	public Administrativo(String nome, String sobrenome, String dtNascimento, long cpf, double valorFixo) {
		super(nome, sobrenome, dtNascimento, cpf);
		this.valorFixo = valorFixo;
	}


	public double getValorFixo() {
		return valorFixo;
	}


	public void setValorFixo(double valorFixo) {
		this.valorFixo = valorFixo;
	}
	
	
	public void detalhe() {
		System.out.println(this.valorFixo);
	}
	
	
	
}
