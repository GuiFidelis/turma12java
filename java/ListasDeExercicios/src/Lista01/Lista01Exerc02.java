package Lista01;

import java.util.Scanner;

public class Lista01Exerc02 {
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int idadeTotalDias=0;
		int idadeAnos = 0;
		int idadeMeses = 0;
		int idadeDias = 0;
		
		System.out.print("Insira a sua idade em dias: ");
		idadeTotalDias = leia.nextInt();

		if (idadeTotalDias > 364)
		{
			idadeAnos = idadeTotalDias/365;
			idadeTotalDias = idadeTotalDias - (idadeAnos*365);
		}
		
		if(idadeTotalDias > 29)
		{
			idadeMeses = idadeTotalDias/30;
			idadeTotalDias = idadeTotalDias - (idadeMeses*30);
		}
		
		if(idadeTotalDias > 0)
		{
		idadeDias = idadeTotalDias;
		}

		System.out.printf("Sua idade é de: %d anos, %d meses e %d dias.",idadeAnos,idadeMeses,idadeDias);
		
	}

}
