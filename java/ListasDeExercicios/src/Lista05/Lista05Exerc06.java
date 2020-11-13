package Lista05;

import java.util.Random;
import java.util.Scanner;

public class Lista05Exerc06 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int matriz[][] = new int[3][3];
		int vetor[]= new int[3];
		int lin,col;
		int resultado;
		
		
		System.out.print("Vetor:\n");
		for(lin=0;lin<3;lin++)
		{
			vetor[lin] = aleatorio.nextInt(7) + 1;
			System.out.print ("["+vetor[lin]+"]");	
		}
				
		System.out.print("\n\nMatriz:");
		
		for(lin=0;lin<3;lin++)
		{
			System.out.print("\n");
			for(col=0;col<3;col++)
			{
				matriz[lin][col] = aleatorio.nextInt(7) + 1;
				System.out.print("["+matriz[lin][col]+"]");	
			}
		}
		
		System.out.print("\n\nMatriz Resultado:");
		for(lin=0;lin<3;lin++)
		{
			System.out.print("\n");
			for(col=0;col<3;col++)
			{
				resultado = vetor[col]*matriz[lin][col];
				if(resultado < 10)
				{
					System.out.print("[0"+resultado+"]");
				}
				else
				{
					System.out.print("["+resultado+"]");
				}
				
		    }
		}
	}
	
}
