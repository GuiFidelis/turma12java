package Lista02;

import java.util.Scanner;

public class Lista02Exerc08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double N;

		System.out.print("insira um n�mero: ");
		N = leia.nextDouble();

		if ( N <= 100)
		{
			N=0;
			System.out.printf("O valor de N �: %.2f",N);
		}
		
		else{
			
			System.out.printf("O valor de N �: ",N);	
			
		}		

	}

}
