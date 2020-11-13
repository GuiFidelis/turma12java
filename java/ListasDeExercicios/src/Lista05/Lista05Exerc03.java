package Lista05;

import java.util.Scanner;

public class Lista05Exerc03 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num=0, grupo1=0, grupo2=0, grupo3=0, grupo4=0;

		while(num >= 0)
		{
			System.out.print("Digite um número: ");
			num = input.nextInt();
					
			if(num>=0 && num<=25)
			{  
				grupo1 = grupo1 + 1;
			}
			
			else if(num>=26 && num<=50)
			{  
				grupo2 = grupo2 + 1;
			}
			
			else if(num>=51 && num<=75)
			{  
				grupo3 = grupo3 + 1;
			}
			
			else if(num>=76 && num<=100)
			{  
				grupo4 = grupo4 + 1;
			}
					
		}
	
		resultado(grupo1,grupo2,grupo3,grupo4);
		
	}
	
	public static void resultado(int grupo1, int grupo2, int grupo3, int grupo4)
	{
		System.out.printf("\nA quantidade de números entre 0 e 25 é: ",grupo1);
		System.out.printf("\nA quantidade de números entre 26 e 50 é: ",grupo2);
		System.out.printf("\nA quantidade de números entre 51 e 75 é: ",grupo3);
		System.out.printf("\nA quantidade de números entre 76 e 100 é: ",grupo4);

	}

}
