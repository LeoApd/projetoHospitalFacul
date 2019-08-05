/**
 * 
 */
package br.com.projetoHospital.model;

public class Enfermeiro extends Pessoa {
	
	private int cargaHoraria;
	
	public Enfermeiro(String nome, String sobrenome, String dtNascimento, long cpf, int cargaHoraria) {
		super(nome, sobrenome, dtNascimento, cpf);
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	

	
	
	
}
