/**
 * 
 */
package br.com.projetoHospital.model;


public class Medico extends Pessoa{

	private String especialidade;

	public Medico(String nome, String sobrenome, String dtNascimento, long cpf, String especialidade) {
		super(nome, sobrenome, dtNascimento, cpf);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	
}
