package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++) {
			System.out.printf("Digite um valor para o vetor %d/20: ", (i+1));
			vetor[i] = teclado.nextInt();
			soma = vetor[i] + soma;
		}
		
		System.out.println("Soma: " + soma);
		teclado.close();

	}

}
