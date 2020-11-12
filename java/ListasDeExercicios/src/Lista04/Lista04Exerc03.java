package Lista04;

import java.util.Random;
import java.util.Scanner;

public class Lista04Exerc03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random numRandom = new Random();

		final int LINHA = 4;
		final int COLUNA = 6;
		int N1[][] = new int[LINHA][COLUNA];
		int N2[][] = new int[LINHA][COLUNA];
		int M1[][] = new int[LINHA][COLUNA];
		int M2[][] = new int[LINHA][COLUNA];
		int l = 0, c = 0;

		// inserir dados
		for (l = 0; l < LINHA; l++) {
			for (c = 0; c < COLUNA; c++) {
				N1[l][c] = numRandom.nextInt(5 - 1) + 1;
			}
		}

		for (l = 0; l < LINHA; l++) {
			for (c = 0; c < COLUNA; c++) {
				N2[l][c] = numRandom.nextInt(5 - 1) + 1;
			}
		}

		// Matriz 1
		System.out.print("Matriz 1:\n");
		for (l = 0; l < LINHA; l++) {
			for (c = 0; c < COLUNA; c++) {
				System.out.print("[ " + N1[l][c] + " ]");
			}
			System.out.print("\n");
		}

		// Matriz 2
		System.out.print("\n");
		System.out.print("Matriz 2:\n");
		for (l = 0; l < LINHA; l++) {
			for (c = 0; c < COLUNA; c++) {
				System.out.print("[ " + N2[l][c] + " ]");
			}
			System.out.print("\n");
		}

		// Matriz Soma
		System.out.print("\n");
		System.out.print("Matriz Soma (M1):\n");
		for (l = 0; l < LINHA; l++) {
			for (c = 0; c < COLUNA; c++) {
				System.out.print("[ " + (M1[l][c] = N1[l][c] + N2[l][c]) + " ]");
			}
			System.out.print("\n");
		}

		// Matriz Diferenca
		System.out.print("\n");
		System.out.print("Matriz Diferença (M2):\n");
		for (l = 0; l < LINHA; l++) {
			for (c = 0; c < COLUNA; c++) {
				System.out.print("[ " + (M2[l][c] = Math.abs(N1[l][c] - N2[l][c])) + " ]");
			}
			System.out.print("\n");
		}
	}

}
