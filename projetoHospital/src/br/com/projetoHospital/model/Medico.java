/**
 * 
 */
package br.com.projetoHospital.model;


public class Medico extends Pessoa{

	/*private String especialidade;*/
	private Especialidade especialidade;

	public Medico(String nome, String sobrenome, String dtNascimento, long cpf, Especialidade especialidade) {
		super(nome, sobrenome, dtNascimento, cpf);
		this.especialidade = especialidade;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
	
}
