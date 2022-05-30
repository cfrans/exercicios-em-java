package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		boolean maior50 = false;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe um valor para o vetor %d/10: ", (i+1));
			vetor[i] = teclado.nextInt();
			}
		
		for(int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
			System.out.printf("Valor %d maior que 50 na posição %d.\n", vetor[i], i);
			maior50 = true;
			}
		}
		
		if(maior50 == false) {
			System.out.println("Não existem valores maiores do que 50.");
		}
		teclado.close();
	}

}
