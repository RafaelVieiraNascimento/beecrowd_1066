package program;

/*
beecrowd | 1066 - Pares, Ímpares, Positivos e Negativos

Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares,
quantos valores digitados foram ímpares, quantos valores digitados foram positivos
e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha,
não esquecendo o final de linha após cada uma.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		
		for(int i = 0; i < 5; i++) {
			
			int valor = sc.nextInt();
			
			if(valor % 2 == 0) {
				par++;
			}
			
			if(valor % 2 != 0) {
				impar++;
			}
			
			if(valor > 0) {
				positivo++;
			}
			
			if(valor < 0) {
				negativo++;
			}
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		sc.close();
	}
}
