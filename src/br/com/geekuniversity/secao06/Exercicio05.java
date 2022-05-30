package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		float peso, excesso = 0, multa = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o peso dos peixes: ");
		peso = teclado.nextFloat();
		
		if(peso > 50) {
			excesso = peso - 50;
			multa = excesso * 4;
		}
		
		System.out.println("Peso total: " + peso);
		System.out.printf("Excesso: %.2f\n", excesso);
		System.out.printf("Multa: R$ %.2f", multa);
		
		teclado.close();

	}

}