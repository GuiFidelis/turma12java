package Lista05;

import java.util.Scanner;

public class Lista05Exerc02 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double peso=0.0, altura=0.0, imc=0.0;

		System.out.print("Informe o seu peso: ");
		peso = input.nextDouble();
				
		System.out.print("Informe a sua altura: ");
		altura = input.nextDouble();
			
		imc(altura,peso);
	}
	
	public static void imc(double altura,double peso)
	{
		double imc=0.0;
		
		imc = peso/(altura*altura);
		
		if(imc < 18.5)
		{
			System.out.print("\nVocê está abaixo do peso.");
		}
		else if(imc > 18.5 && imc <=25)
		{
			System.out.print("\nVocê está com o peso normal.");
		}
		else if(imc > 25 && imc ==30)
		{
			System.out.print("\nVocê está acima do peso.");
		}
		else if(imc > 30)
		{
			System.out.print("\nVocê está obeso.");
		}

	}

}
