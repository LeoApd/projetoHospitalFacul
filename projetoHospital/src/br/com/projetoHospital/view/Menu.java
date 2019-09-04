package br.com.projetoHospital.view;

import java.util.Scanner;

public class Menu {
	
	Scanner tc =  new Scanner(System.in);
	
	public int menuPrincipal() {
		System.out.println("<----------- MENU DE OPÇÃO ------------->\n");
		System.out.println("1 - CADASTRAR FUNCIONARIOS");
		System.out.println("2 - LISTAR TODOS");
		System.out.println("0 - SAIR\n");
		System.out.println("DIGITE A OPÇÃO DESEJADA\n");
		int opcao = tc.nextInt();
		return opcao;
	}
	
	public int menuCadastroFuncionario() {
		System.out.print("================= ESCOLHA A OPÇÃO ================= \n");
		System.out.println(" 1 - MEDICO ");
		System.out.println(" 2 - ENFERMEIRO ");
		System.out.println(" 3 - ADMINISTRATIVO ");
		System.out.println(" 0 - SAIR ");
		int opcao = tc.nextInt();
		return opcao;
	}

}
