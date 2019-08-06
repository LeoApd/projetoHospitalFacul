/**
 * 
 */
package br.com.projetoHospital.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.projetoHospital.model.Administrativo;
import br.com.projetoHospital.model.Enfermeiro;
import br.com.projetoHospital.model.Medico;
import br.com.projetoHospital.model.Pessoa;


public class HospitalMain {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		ArrayList<Pessoa> repository = new ArrayList<>();
		
		int opcao = 0;

		do {
			
			System.out.println("<----------- MENU DE OPÇÃO ------------->\n");
			System.out.println("1 - CADASTRAR MEDICO");
			System.out.println("2 - CADASTRAR ENFERMEIRO");
			System.out.println("3 - CADASTRAR ADMINISTRATIVO");
			System.out.println("4 - LISTAR TODOS");
			System.out.println("0 - SAIR\n");
			
			System.out.println("DIGITE A OPÇÃO DESEJADA\n");
			opcao = tc.nextInt();
			
			switch (opcao) {
				case 1:
					cadastrar("MEDICO", repository);
					break;
					
				case 2:
					
					cadastrar("ENFERMEIRO", repository);
					break;
					
				case 3:
					cadastrar("ADMINISTRATIVO", repository);
					break;
					
				case 4:
					System.out.println("-------------- LISTAR ---------------");
					if(repository.size() < 1) {
						System.out.println("SEM CADASTRO");
					}else {
						for(Pessoa p : repository) {
							System.out.println("Nome " + p.getNome() + " Sobrenome " + p.getSobrenome());
						}
					}
					break;
			
				default:
					System.out.println("OPÇÃO INVALIDA");
					break;
				}
			
		} while (opcao != 0);
		
		tc.close();
		
	}
	
	public static void cadastrar(String key, ArrayList<Pessoa> repository) {
	
		String nome;
		String sobrenome;
		String dtNascimento;
		long cpf = 0;
		boolean validarRepository;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("------------CADASTRO " + key + "--------------");
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
		
		
		if(validarRepository(repository)) {
			System.out.println("LIMITE PARA CADASTRO 10");
		}else {
		
			if(key.equalsIgnoreCase("MEDICO")) {
				System.out.println("Digite o Especialidade :");
				String especialidade = tc.next();
				Medico med = new Medico(nome, sobrenome, dtNascimento, cpf, especialidade);
				
				repository.add(med);
				
			}else if(key.equalsIgnoreCase("ENFERMEIRO")) {
				System.out.println("Digite o carga horaria :");
				int cargaHoraria = tc.nextInt();
				Enfermeiro enf = new Enfermeiro(nome, sobrenome, dtNascimento, cpf, cargaHoraria);
				
				repository.add(enf);
			}else if(key.equalsIgnoreCase("ADMINISTRATIVO")) {
				System.out.println("Digite o valor fixo :");
				long valorFixo = tc.nextLong();
				
				Administrativo adm = new Administrativo(nome, sobrenome, dtNascimento, cpf, valorFixo);
				
				repository.add(adm);
			}
		}	
	}
	
	public static boolean validarRepository(ArrayList<Pessoa> repository) {
		if(repository.size() >= 10) {
			return true;
		}else {
			return false;
		}
	}

}
