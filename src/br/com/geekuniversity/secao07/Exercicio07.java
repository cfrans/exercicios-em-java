package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
			int sit1 = 0, sit2 = 0, sit3 = 0, sit4 = 0, total = 0, id, defeito;
			float p1, p2, p3, p4;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Informe o ID do mouse (ou 0 para encerrar): ");
			id = teclado.nextInt();
			
			while(id != 0) {
				System.out.println("Identifique o defeito: ");
				System.out.println("1 - Necessita de esfera");
				System.out.println("2 - Necessita de limpeza");
				System.out.println("3 - Necessita troca do cabo ou conector");
				System.out.println("4 - Quebrado ou inutilizado");
				System.out.printf("Insira o defeito: ");
				defeito = teclado.nextInt();
				
				if(defeito == 1) {
					sit1 = sit1 + 1;
				}if(defeito == 2) {
					sit2 = sit2 + 1;
				}if(defeito == 3) {
					sit3 = sit3 + 1;
				}if(defeito == 4) {
					sit4 = sit4 + 1;
				}if(defeito > 4) {
					System.out.println("Defeito desconhecido");
				}
				total = total + 1;
				System.out.println("Digite o ID do mouse (ou 0 para encerrar): ");
				id = teclado.nextInt();
			}
			
			p1 = ((float)sit1 * (float)100) / (float)total;
			p2 = ((float)sit2 * (float)100) / (float)total;
			p3 = ((float)sit3 * (float)100) / (float)total;
			p4 = ((float)sit4 * (float)100) / (float)total;
			
			System.out.println("Quantidade total de mouses: " + total);
			System.out.printf("Situação \t\t\t\t Quantidade \t\t\t Percentual\n");
			System.out.printf("1 - Necessita de esfera \t\t\t %d \t\t\t %.2f%% \n", sit1, p1);
			System.out.printf("2 - Necessita de limpeza \t\t\t %d \t\t\t %.2f%% \n", sit2, p2);
			System.out.printf("3 - Necessita troca do cabo ou conector \t %d \t\t\t %.2f%% \n", sit3, p3);
			System.out.printf("4 - Quebrado ou inutilizado \t\t\t %d \t\t\t %.2f%% \n", sit4, p4);

			teclado.close();
	}

}
