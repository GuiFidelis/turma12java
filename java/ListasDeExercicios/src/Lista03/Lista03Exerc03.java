package Lista03;

import java.util.Scanner;

public class Lista03Exerc03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//variaveis
		double numero, media=0.0, somaNumero=0.0;
		int cont=0;
		
		//entradas
		System.out.print("Insira um número positivo para soma ou um número negativo para encerrar o programa: ");
		numero = read.nextDouble();

				
		while(numero >= 0)
		{
				
			somaNumero = (somaNumero + numero);
					
			if(numero == 0)
			{
				System.out.println("\nLembre-se que zero não irá fazer diferença na soma");
				System.out.println("Insira um número positivo para soma ou um número negativo para encerrar o programa: ");
				numero = read.nextDouble();
			}
			
			else if (numero > 0)
			{
				System.out.print("\nInsira um número positivo para soma ou um número negativo para encerrar o programa: ");
				numero = read.nextDouble();
				cont++;
			}
							
		}

		//processamento da media
		media = (somaNumero/cont);

				
		//saída
		if (somaNumero <= 0)
		{
			System.out.print("\nNenhum número foi somado");
		}
		else
		{
			System.out.printf("\nForam inseridos um total de : %d números positivos",cont);
			System.out.printf("\nA média deles é de: %.2f",media);
		}

	}

}
