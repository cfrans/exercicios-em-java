package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int codigo;
		float[] vetor = new float[5];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - Executa na ordem direta");
		System.out.println("2 - Executa na ordem inversa");
		System.out.println("0 - Encerra o programa");
		System.out.printf("Digite o código: ");
		codigo = teclado.nextInt();
		
		while(codigo > 2 || codigo < 0) {
			System.out.println("Código desconhecido.");
			System.out.println("Digite o código: ");
			codigo = teclado.nextInt();
		}
		
		if(codigo > 0) {
			for(int i = 0; i < 5; i++) {
				System.out.printf("Digite o valor %d/5: ", (i+1));
				vetor[i] = teclado.nextFloat();
			}
			if(codigo == 1) {
				for(int i = 0; i < 5; i++) {
					System.out.println(vetor[i]);
				}
			}
			if(codigo == 2) {
				for(int i = 4; i >= 0; i-- ) {
					System.out.println(vetor[i]);
				}
			}
		}
		teclado.close();
	}

}
