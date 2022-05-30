package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int valor, maior = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um número: ");
		valor = teclado.nextInt();

		while(valor != 0){
			if(valor > maior){
				maior = valor;
			}
			System.out.println("Informe um número (ou 0 para encerrar): ");
			valor = teclado.nextInt();
		}		

		System.out.println("O maior valor é: " + maior);

		teclado.close();
	}

}