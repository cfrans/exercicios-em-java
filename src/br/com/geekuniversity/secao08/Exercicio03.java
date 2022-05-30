package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um valor:");
			vetor[i] = teclado.nextInt();
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		teclado.close();
	}

}
