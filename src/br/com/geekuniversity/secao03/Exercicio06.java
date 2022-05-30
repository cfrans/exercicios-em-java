package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		float salario, valor_hora;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor recebido por hora: ");
		valor_hora = teclado.nextFloat();
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		horas_trabalhadas = teclado.nextInt();
		
		salario = horas_trabalhadas * valor_hora;
		
		System.out.println("O salário referido no mês é de R$ " + salario);
		
		teclado.close();

	}

}
