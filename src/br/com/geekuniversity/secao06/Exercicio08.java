package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		int n1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira um n�mero: ");
		n1 = teclado.nextInt();

		if(n1 % 2 ==0){
			System.out.println("N�mero par");
		}else{
			System.out.println("N�mero �mpar");
		}

		if(n1 > 0){
			System.out.println("N�mero maior que zero");
		}else{
			System.out.println("N�mero menor que zero");
		}

		teclado.close();
	}
}