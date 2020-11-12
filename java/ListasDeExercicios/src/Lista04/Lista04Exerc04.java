package Lista04;

import java.util.Random;
import java.util.Scanner;

public class Lista04Exerc04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random numRandom = new Random();

		final int LINHA = 3;
		final int COLUNA = 3;
		int matriz[][] = new int[LINHA][COLUNA];
		int l = 0, c = 0, soma = 0, somaDiagonal = 0;

		System.out.print("A matriz é:\n");
		for (l = 0; l < LINHA; l++) {
			System.out.print("\n");
			for (c = 0; c < COLUNA; c++) {

				matriz[l][c] = numRandom.nextInt(10 - 1) + 1;

				System.out.print("[ " + matriz[l][c] + " ]");

				if (l == c) {
					somaDiagonal = somaDiagonal + matriz[l][c];
				}

				soma = soma + matriz[l][c];
			}
		}

		System.out.print("\n");
		System.out.printf("\nA soma dos números digitados é: %d", soma);
		System.out.printf("\nA soma dos números da diagonal principal é: %d", somaDiagonal);

	}

}
