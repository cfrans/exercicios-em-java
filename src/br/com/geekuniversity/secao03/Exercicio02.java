package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int qtd_min, qtd_max;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade m�nima: ");
		qtd_min = teclado.nextInt();
		System.out.print("Informe a quantidade m�xima: ");
		qtd_max = teclado.nextInt();
		
		estoque_medio = (qtd_min + qtd_max) / 2;
		
		System.out.print("A quantidade m�dia � de: " + estoque_medio);
		
		teclado.close();

	}

}
