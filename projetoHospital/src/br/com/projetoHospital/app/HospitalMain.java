/**
 * 
 */
package br.com.projetoHospital.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import br.com.projetoHospital.model.Administrativo;
import br.com.projetoHospital.model.Enfermeiro;
import br.com.projetoHospital.model.Especialidade;
import br.com.projetoHospital.model.Medico;
import br.com.projetoHospital.model.Pessoa;


public class HospitalMain {

	static Scanner tc = new Scanner(System.in);
	static ArrayList<Pessoa> repository = new ArrayList<>();
	
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menuPrincipal();

			switch (opcao) {
			case 1: opcao = menuCadastroFuncionario();
				cadastrofuncionario(opcao);
				break;
			case 2:					
				break;					
			default:
				System.out.println("OPÇÃO INVALIDA");
				break;
			}
		} while (opcao != 0);

		tc.close();
	}

	public static int menuPrincipal() {
		System.out.println("<----------- MENU DE OPÇÃO ------------->\n");
		System.out.println("1 - CADASTRAR FUNCIONARIOS");
		System.out.println("2 - LISTAR TODOS");
		System.out.println("0 - SAIR\n");
		System.out.println("DIGITE A OPÇÃO DESEJADA\n");
		int opcao = tc.nextInt();
		return opcao;
	}
	
	public static int menuCadastroFuncionario() {
		System.out.print("================= ESCOLHA A OPÇÃO ================= \n");
		System.out.println(" 1 - MEDICO ");
		System.out.println(" 2 - ENFERMEIRO ");
		System.out.println(" 3 - ADMINISTRATIVO ");
		System.out.println(" 0 - SAIR ");
		int opcao = tc.nextInt();
		return opcao;
	}
	
	public static void cadastrofuncionario(int opcao) {
		do {
			switch (opcao) {
				case 1: cadastro(1, repository);//medico
					opcao = menuCadastroFuncionario();//escolher nova opção
					break;
				case 2: cadastro(2, repository);//enfermeiro
					opcao = menuCadastroFuncionario();//escolher nova opção
					break;
				case 3: cadastro(3, repository);//administrativo
					opcao = menuCadastroFuncionario();
					break;
				default:
					break;
			}
		}while(opcao != 0);
	}

	public static void cadastro(int key, ArrayList<Pessoa> repository) {

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
			HashMap<Integer, String> especialidades = esp.listaEspecialidade();
			Set<Integer> listaEspecialidades = especialidades.keySet();
			System.out.println("Especialidades cadastradas");
			
			for(Integer i: listaEspecialidades) {
				System.out.println(i + " - " + especialidades.get(i));
			}
			
			System.out.println("Escolha a opção deseja");
			int especialidade = tc.nextInt();
			String opcaoSelecionada = null;
			
			if(listaEspecialidades.contains(Integer.valueOf(especialidade))) {
				opcaoSelecionada = especialidades.get(Integer.valueOf(especialidade));
			}else {
				System.out.println("OPÇÃO NÃO CADASTRADA");
			}

			Pessoa med = new Medico(nome, sobrenome, dtNascimento, cpf, opcaoSelecionada);
			repository.add(med);
	
		}else if(key == 2) {
			System.out.println("Digite o carga horaria :");
			int cargaHoraria = tc.nextInt();
			Pessoa enf = new Enfermeiro(nome, sobrenome, dtNascimento, cpf, cargaHoraria);
			repository.add(enf);
			
		}else if(key == 3) {
			System.out.println("Digite o valor fixo :");
			long valorFixo = tc.nextLong();
			Pessoa adm = new Administrativo(nome, sobrenome, dtNascimento, cpf, valorFixo);
			repository.add(adm);
		}
}

public static boolean validarRepository(ArrayList<Pessoa> repository) {
	if(repository.size() >= 10) {
		return true;
	}else {
		return false;
	}
}

public static void listar(ArrayList<Pessoa> repository) {
	System.out.println("-------------- LISTAR ---------------");
	if(repository.size() < 1) {
		System.out.println("SEM CADASTRO");
	}else {
		for(Pessoa p : repository) {
			System.out.println("Nome " + p.getNome() + " Sobrenome " + p.getSobrenome());
		}
	}
}


}
