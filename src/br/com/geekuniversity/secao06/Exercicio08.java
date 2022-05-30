package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		int n1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira um número: ");
		n1 = teclado.nextInt();

		if(n1 % 2 ==0){
			System.out.println("Número par");
		}else{
			System.out.println("Número ímpar");
		}

		if(n1 > 0){
			System.out.println("Número maior que zero");
		}else{
			System.out.println("Número menor que zero");
		}

		teclado.close();
	}
}