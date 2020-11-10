package Lista02;

import java.util.Scanner;

public class Lista02Exerc07 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		double base, altura, area;

		System.out.print("Insira o tamanho da base do triângulo: ");
		base = leia.nextDouble();
		System.out.print("Insira o tamanho da altura do triângulo: ");
		altura = leia.nextDouble();
		
		if( altura < 1 || base <1)
		{
			System.out.print("O valor da base ou da altura deve ser maior que zero.");
			
		}
		else
		{

			area = (base * altura)/2;

			System.out.printf("O valor da área é de: %.2f",area);
		}

	}

}
