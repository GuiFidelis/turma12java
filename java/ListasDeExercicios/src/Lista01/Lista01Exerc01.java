package Lista01;

import java.util.Scanner;

public class Lista01Exerc01 
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos=0, idadeMeses=0, idadeDias=0;
		int totalDias=0;
						
		System.out.print("Insira a sua idade em anos, meses e dias: \n");
		
		System.out.print("Anos: ");
		idadeAnos = leia.nextInt();
		
		System.out.print("Meses: ");
		idadeMeses = leia.nextInt();
		
		System.out.print("Dias: ");
		idadeDias = leia.nextInt();
		
		totalDias = (idadeAnos*365)+(idadeMeses*30)+idadeDias;
		
		System.out.printf("Voce já viveu um total de: %d dias",totalDias); 
		
	}
}
