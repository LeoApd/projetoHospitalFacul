package br.com.projetoHospital.controller;

import java.util.ArrayList;

import br.com.projetoHospital.model.Pessoa;
import br.com.projetoHospital.view.Menu;

public class ControllerMain {
	
	Menu menu = new Menu();
	ArrayList<Pessoa> repository = new ArrayList<>();
	PessoaController cPessoa = new PessoaController();
	
	public void startApp() {
		int opcao;
		do {
			opcao = menu.menuPrincipal();
	
			switch (opcao) {
			case 1: opcao = menu.menuCadastroFuncionario();
				cadastrofuncionario(opcao);
				break;
			case 2:					
				break;					
			default:
				System.out.println("OPÇÃO INVALIDA");
				break;
			}
		} while (opcao != 0);
	}

	public void cadastrofuncionario(int opcao) {
		do {
			switch (opcao) {
				case 1: cPessoa.cadastro(1, repository);//medico
					opcao = menu.menuCadastroFuncionario();//escolher nova opção
					break;
				case 2: cPessoa.cadastro(2, repository);//enfermeiro
					opcao = menu.menuCadastroFuncionario();//escolher nova opção
					break;
				case 3: cPessoa.cadastro(3, repository);//administrativo
					opcao = menu.menuCadastroFuncionario();
					break;
				default:
					break;
			}
		}while(opcao != 0);
	}
	
	
}
