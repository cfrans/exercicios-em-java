package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int c;
		float salario, extra, n, e =0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu código: ");
		c = teclado.nextInt();
		System.out.println("Informe o número de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		if(n > 50) {
			e = n - 50;
			n = n - e;
		}
		
		extra = e * 20;
		salario = n * 10;
		
		System.out.println("Código: " + c);
		System.out.printf("Salário: R$ %.2f\n", salario);
		System.out.printf("Extra: R$ %.2f\n", extra);
		
		teclado.close();
	
	}

}
