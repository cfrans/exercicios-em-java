package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int maior = -999, menor = 9999, soma = 0, valor;
		float media;
		Scanner teclado = new Scanner(System.in);

		for(int i = 0; i < 10; i++){
			System.out.println("Informe um número: ");
			valor = teclado.nextInt();
			while(valor < 0){
				System.out.println("Informe um número: ");
				valor = teclado.nextInt();
			}if(valor > maior) {
				 maior = valor;
			}if(valor < menor) {
				menor = valor;
			}
			soma = soma + valor;
		}
		media = soma / 10;
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + media);
		
		teclado.close();
	}

}