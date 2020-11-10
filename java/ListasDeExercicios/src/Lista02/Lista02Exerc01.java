package Lista02;

import java.util.Scanner;

public class Lista02Exerc01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double P;
		double E = 0;
		double M = 0;

		System.out.print("Insira o peso do Tomate: ");
		P = leia.nextDouble();

		if (P > 40)
		{

			E = (P-40);
			M = (E*4.00);
			
			System.out.printf("Para %.2f quilos de tomate teremos: ",P);
			System.out.printf("\nExcesso de: %.2f quilos.",E);
		    System.out.printf("\nMulta no valor de: %.2f reais.",M);
	
		}
		
		else
		{
			
			System.out.printf("Para %.2f quilos de Tomate teremos:",P);
			System.out.printf("\nExcesso de: %.2f quilos.",E);
			System.out.printf("\nMulta no valor de: %.2f reais.",M);
	
		}

	}

}
