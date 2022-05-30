package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		float poluicao;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o índice de poluição: ");
		poluicao = teclado.nextFloat();

		if(poluicao >= 0.3 && poluicao < 0.4){
			System.out.println("Grupo 1 suspender atividades.");
		}
		if(poluicao >= 0.4 && poluicao < 0.5){
			System.out.println("Grupo 2 suspender atividades.");
		}
		if(poluicao >= 0.5){
			System.out.println("Todos os grupos suspender atividades");
		}
		if(poluicao <= 0.2){
			System.out.println("Níveis aceitáveis.");
		}
		teclado.close();
	}
}