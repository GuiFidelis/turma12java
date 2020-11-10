package Lista02;

import java.util.Scanner;

public class Lista02Exerc04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;


		System.out.print("Digite o numero inteiro [+ / -]:");
		numero = leia.nextInt();
		
		if (numero <0)
		{
			System.out.printf("\nO numero digitado é negativo");
		}
		
		else if (numero > 0)
		{
			if((numero % 2)==0)
			{
				System.out.print("\nNumero positivo e par!");
			}
			else 
			{
				System.out.print("\nNumero positivo e impar!!");
			}
			
		}
		
		else
		{
			System.out.print("\nVocê digitou o zero que é neutro");
		}

	}

}
