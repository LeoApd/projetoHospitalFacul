package br.com.projetoHospital.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import br.com.projetoHospital.model.Administrativo;
import br.com.projetoHospital.model.Enfermeiro;
import br.com.projetoHospital.model.Especialidade;
import br.com.projetoHospital.model.Medico;
import br.com.projetoHospital.model.Pessoa;
import br.com.projetoHospital.view.TelaCadastro;

public class PessoaController {

	ArrayList<Pessoa> repository = new ArrayList<>();
	
	TelaCadastro tCadastro = new TelaCadastro();
	
	public void salvarPessoa(int tipo) {
		
		repository.add(tCadastro.cadastro(tipo));
		
	}
	
	
	
}
