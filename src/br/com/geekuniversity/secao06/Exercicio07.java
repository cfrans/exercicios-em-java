package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		int n1, n2, n3, n4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero: ");
		n1 = teclado.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		n2 = teclado.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		n3 = teclado.nextInt();
		System.out.println("Insira o quarto n�mero: ");
		n4 = teclado.nextInt();

		q1 = n1 * 2;
		q2 = n2 * 2;
		q3 = n3 * 2;
		q4 = n4 * 2;

		if(q3 >= 1000){
			System.out.println(q3);
		}else{
			System.out.printf("O quadrado de %d � %d.\n", n1, q1);
			System.out.printf("O quadrado de %d � %d.\n", n2, q2);
			System.out.printf("O quadrado de %d � %d.\n", n3, q3);
			System.out.printf("O quadrado de %d � %d.", n4, q4);
		}
		
		teclado.close();
	}
}