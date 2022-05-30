package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int valor, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		valor = teclado.nextInt();
		
		if(valor % 2 == 0) {
			p = valor;
		}else {
			i = valor;
		}
		
		System.out.println(p);
		System.out.println(i);
		
		teclado.close();
	}

}
