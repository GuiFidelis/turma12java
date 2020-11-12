package Lista04;

import java.util.Random;
import java.util.Scanner;

public class Lista04Exerc02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random numRandom = new Random();

		final int X = 10;
		double media = 0.0, soma = 0.0, maiorNum = 0.0;
		int cont = 0, ocorrencias = 0;
		double lancamentos[] = new double[X];

		for (cont = 0; cont < X; cont++) {
			lancamentos[cont] = numRandom.nextInt(7 - 1) + 1;

			if (lancamentos[cont] > maiorNum) {
				ocorrencias = 1;
				maiorNum = lancamentos[cont];
			}

			else if (lancamentos[cont] == maiorNum) {
				ocorrencias++;
			}

			soma = soma + lancamentos[cont];

			System.out.printf("O valor do lan�amento do dado %d �: %.0f", cont + 1, lancamentos[cont]);
			System.out.print("\n");
		}

		media = (soma / X);

		System.out.printf("\nA soma dos valores �: %.0f", soma);
		System.out.printf("\nA m�dia dos resultados �: %.2f", media);
		System.out.printf("\nO maior resultado � %.0f e ocorreu %d vezes", maiorNum, ocorrencias);

	}

}
