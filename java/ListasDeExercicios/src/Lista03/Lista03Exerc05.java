package Lista03;

import java.util.Scanner;

public class Lista03Exerc05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		int contagem=233;

		System.out.print("O programa fará uma contagem na tela de 233 a 456!");
		
		System.out.printf("\n\n%d", contagem);
		
		do
		{
			if( contagem >=300 && contagem <=400)
			{
				contagem = contagem + 3;
				System.out.printf("\n%d", contagem);
			}
			else
			{
				contagem = contagem + 5;
				System.out.printf("\n%d", contagem);
			}
			
		}while(contagem <= 456);
	}

}
