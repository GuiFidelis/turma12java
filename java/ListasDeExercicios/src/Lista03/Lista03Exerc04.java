package Lista03;

import java.util.Scanner;

public class Lista03Exerc04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//variaveis
		int numero, valMult=0;
				
		//entradas
		System.out.print("Insira um número positivo para ser multiplicado: ");
		numero = read.nextInt();
		
		valMult = numero;

		//processamento
		while(valMult <= 100)
		{
		
			if (numero == valMult)
			{
				//saida
				System.out.printf("%d ", valMult);
					
			}
					
			valMult = valMult*3;

			//saida
			System.out.printf("%d ", valMult);

		}

	}

}
