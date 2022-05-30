package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a idade do nadador: ");
		idade = teclado.nextInt();

		if(idade >= 5 && idade <= 7){
			System.out.println("Infantil A");
		}
		if(idade >= 8 && idade <= 11){
			System.out.println("Infantil B");
		}
		if(idade >= 12 && idade <= 13){
			System.out.println("Juvenil A");
		}
		if(idade >= 14 && idade <= 17){
			System.out.println("Juvenil B");
		}
		if(idade >= 18){
			System.out.println("Adulto");
		}
		//parte adicionada por conta própria
		if(idade <= 4) {
			System.out.println("Idade não permitida.");
		}

		teclado.close();
	}
}