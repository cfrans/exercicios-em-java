package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		while(nome.equals(senha)) {
			System.out.println("A senha não pode ser igual ao nome.");
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}

		teclado.close();
	}

}
