package br.com.projetoHospital.view;

import java.util.Scanner;

public class Menu {
	
	Scanner tc =  new Scanner(System.in);
	
	public int menuPrincipal() {
		System.out.println("<----------- MENU DE OP��O ------------->\n");
		System.out.println("1 - CADASTRAR FUNCIONARIOS");
		System.out.println("2 - LISTAR TODOS");
		System.out.println("0 - SAIR\n");
		System.out.println("DIGITE A OP��O DESEJADA\n");
		int opcao = tc.nextInt();
		return opcao;
	}
	
	public int menuCadastroFuncionario() {
		System.out.print("================= ESCOLHA A OP��O ================= \n");
		System.out.println(" 1 - MEDICO ");
		System.out.println(" 2 - ENFERMEIRO ");
		System.out.println(" 3 - ADMINISTRATIVO ");
		System.out.println(" 0 - SAIR ");
		int opcao = tc.nextInt();
		return opcao;
	}

}
