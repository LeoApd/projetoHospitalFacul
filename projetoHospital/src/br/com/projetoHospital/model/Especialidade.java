package br.com.projetoHospital.model;

import java.util.HashMap;
import java.util.Set;

public class Especialidade {

	private String especialidade;
	private HashMap<Integer, String> hEpecialidade;

	public Especialidade() {
		this.carregarEspecilidade();
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	public HashMap<Integer, String> carregarEspecilidade() {
		hEpecialidade = new HashMap<>();
		
		hEpecialidade.put(1, "Dentista");
		hEpecialidade.put(2, "Dermatologista");
		hEpecialidade.put(3, "Cardilogista");
		hEpecialidade.put(4, "Pediatra");
		hEpecialidade.put(5, "Podologo");
		
		return hEpecialidade;
	}
	
	public void listar() {
		HashMap<Integer, String> especialidade = this.carregarEspecilidade();
		Set<Integer> list = especialidade.keySet();
		
		System.out.println("Especialidade cadastradas");
		for(Integer i : list) {
			System.out.println(i + " - " + especialidade.get(i));
		}	
	}
	
	public String getEsp(int opcao) {
		if(this.hEpecialidade.containsKey(Integer.valueOf(opcao))) 
			return hEpecialidade.get(Integer.valueOf(opcao));
		else
			return "Não cadastrado";
	}
	
	
}
