package Lista03;

import java.util.Scanner;

public class Lista03Exerc02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//variaveis
		int cont=0, testePar=0, testeImpar=0;
		int soma=0;
				
		//entradas
		System.out.println("Este programa calcula a soma de todos os n�meros �mpares que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500\n");
		System.out.println("-------------------------------------");

				
		//proessamento
		for(cont=1; cont<=500; cont++)
		{
			testePar = (cont%2);
					
			if (testePar != 0)
			{
				testeImpar = (cont%3);

				if (testeImpar == 0)
				{
					soma = (soma+cont);
				}
					
			}
		}
				
		//saidas
		System.out.printf("\nO resultado da soma � de: %d",soma);

	}

}