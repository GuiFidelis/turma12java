package Lista02;

import java.util.Scanner;

public class Lista02Exerc05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double indicePol;

		System.out.print("Insira o �ndice de polui��o: ");
		indicePol = leia.nextDouble();

		if ( indicePol < 0.3)
		{

		System.out.print("nenhuma empresa precisa ser notificada");
			
		}

		else if( indicePol < 0.4)
		{
			System.out.println("o 1� grupo de empresas devem ser intimadas para suspenderem suas atividades");
			System.out.println("\no 2� e 3� grupo de empresas n�o devem ser notificadas");
		}

		else if ( indicePol < 0.5)
		{
			System.out.println("o 1� e o 2� grupo de empresas devem ser intimadas para suspenderem suas atividades");
			System.out.println("\no 3� grupo de empresas n�o devem ser notificadas");
		}
		
		else
		{
			System.out.println("o 1�, 2� e 3� grupo de empresas devem ser intimadas para suspenderem suas atividade");
		}

	}

}