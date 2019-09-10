/**
 * 
 */
package br.com.projetoHospital.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.projetoHospital.model.Administrativo;
import br.com.projetoHospital.model.Enfermeiro;
import br.com.projetoHospital.model.Especialidade;
import br.com.projetoHospital.model.Medico;
import br.com.projetoHospital.model.Pessoa;

public class TelaCadastro {
		
	Pessoa pessoa;
	
	public Pessoa cadastro(int key) {

		
		String nome;
		String sobrenome;
		String dtNascimento;
		long cpf = 0;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite o nome :");
		nome = tc.next();
		System.out.println("Digite o sobrenome :");
		sobrenome = tc.next();
		System.out.println("Digite o data de nascimento EX:(10/10/1999) :");
		dtNascimento = tc.next();
		System.out.println("Digite o cpf :");
		try {
			cpf = tc.nextInt();
		}catch(InputMismatchException ex) {
			System.out.println("CAMPO ACEITA APENAS NUMERO TENTE NOVAMENTE");
		}

		if(key == 1) {
			Especialidade esp = new Especialidade();
			esp.listar();
			System.out.println("Escolha a opção deseja");
			int especialidade = tc.nextInt();
			String opcaoSelecionada = esp.getEsp(especialidade);
			esp.setEspecialidade(opcaoSelecionada);
			pessoa = new Medico(nome, sobrenome, dtNascimento, cpf, esp);
			
	
		}else if(key == 2) {
			System.out.println("Digite o carga horaria :");
			int cargaHoraria = tc.nextInt();
			pessoa = new Enfermeiro(nome, sobrenome, dtNascimento, cpf, cargaHoraria);
			
		}else if(key == 3) {
			System.out.println("Digite o valor fixo :");
			long valorFixo = tc.nextLong();
			pessoa = new Administrativo(nome, sobrenome, dtNascimento, cpf, valorFixo);
		}
		
		return pessoa;
	}
}
