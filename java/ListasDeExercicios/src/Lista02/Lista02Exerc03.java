package Lista02;

import java.util.Scanner;

public class Lista02Exerc03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double primeiroNum, segundoNum, terceiroNum, quartoNum;
		double primeiroQuad, segundoQuad, terceiroQuad, quartoQuad;


		System.out.print("Insira o valor do primeiro n�mero: ");
		primeiroNum = leia.nextDouble();
		System.out.print("Insira o valor do segundo n�mero: ");
		segundoNum = leia.nextDouble();
		System.out.print("Insira o valor do terceiro n�mero: ");
		terceiroNum = leia.nextDouble();
		System.out.print("Insira o valor do quarto n�mero: ");
		quartoNum = leia.nextDouble();
		
		terceiroQuad = Math.pow(terceiroNum, 2);
		
		if( terceiroQuad >= 1000)
		{
			System.out.printf("\nO valor do quadrado do terceiro numero �: %.2f",terceiroQuad);
		}
		
		else{
			
			primeiroQuad = Math.pow(primeiroNum, 2);
			segundoQuad = Math.pow(segundoNum, 2);
			quartoQuad = Math.pow(quartoNum, 2);
			
			System.out.print("O valor do quadrado de:");
			System.out.printf("\n%.2f � igual a %.2f",primeiroNum,primeiroQuad);
			System.out.printf("\n%.2f � igual a %.2f",segundoNum,segundoQuad);
			System.out.printf("\n%.2f � igual a %.2f",terceiroNum,terceiroQuad);
			System.out.printf("\n%.2f � igual a %.2f",quartoNum,quartoQuad);
							
		}

	}

}
