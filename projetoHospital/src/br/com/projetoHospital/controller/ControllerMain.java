package br.com.projetoHospital.controller;

import java.util.ArrayList;

import br.com.projetoHospital.model.Pessoa;
import br.com.projetoHospital.view.Menu;
import br.com.projetoHospital.view.TelaCadastro;

public class ControllerMain {
	
	Menu menu = new Menu();
	
	PessoaController pController = new PessoaController();
	
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
				case 1: pController.salvarPessoa(1);//medico
					opcao = menu.menuCadastroFuncionario();//escolher nova opção
					break;
				case 2: pController.salvarPessoa(2);//enfermeiro
					opcao = menu.menuCadastroFuncionario();//escolher nova opção
					break;
				case 3: pController.salvarPessoa(3);//administrativo
					opcao = menu.menuCadastroFuncionario();
					break;
				default:
					break;
			}
		}while(opcao != 0);
	}
	
	
}
