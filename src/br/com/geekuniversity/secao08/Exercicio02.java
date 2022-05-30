package br.com.geekuniversity.secao08;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		ArrayList<Integer> vetor1 = new ArrayList<Integer>();
		ArrayList<Integer> vetor2 = new ArrayList<Integer>();
		ArrayList<Integer> soma = new ArrayList<Integer>();
		int valor1, valor2;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i <10; i++) {
			System.out.println("Digite um valor para o primeiro vetor: ");
			valor1 = teclado.nextInt();
			System.out.println("Digite um valor para o segundo vetor:");
			valor2 = teclado.nextInt();
			vetor1.add(valor1);
			vetor2.add(valor2);
			soma.add(valor1 + valor2);
		}
		for(Integer n : soma) {
			System.out.println(n);
		}
		teclado.close();
	}

}
