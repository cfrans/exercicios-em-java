package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		valor = teclado.nextInt();
		
		if(valor > 100) {
			System.out.println(valor);
		}else {
			valor = 0;
			System.out.println(valor);
		}
		
		teclado.close();
	}

}
