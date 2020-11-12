package Lista04;

import java.util.Scanner;

public class Lista04Exerc01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double notas[] = new double[4], maiorNum = 0.0;
		int cont = 0;

		for (cont = 0; cont < 4; cont++) {
			System.out.printf("Insira o valor da nota %d: ", cont + 1);
			notas[cont] = input.nextDouble();

			if (notas[cont] > maiorNum) {
				maiorNum = notas[cont];
			}
		}

		System.out.print("\n---------------------------------");
		System.out.printf("\n\nO maior valor digitado é %.2f: ", maiorNum);
	}

}
