package Lista02;

import java.util.Scanner;

public class Lista02Exerc05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double indicePol;

		System.out.print("Insira o índice de poluição: ");
		indicePol = leia.nextDouble();

		if ( indicePol < 0.3)
		{

		System.out.print("nenhuma empresa precisa ser notificada");
			
		}

		else if( indicePol < 0.4)
		{
			System.out.println("o 1º grupo de empresas devem ser intimadas para suspenderem suas atividades");
			System.out.println("\no 2º e 3º grupo de empresas não devem ser notificadas");
		}

		else if ( indicePol < 0.5)
		{
			System.out.println("o 1º e o 2º grupo de empresas devem ser intimadas para suspenderem suas atividades");
			System.out.println("\no 3º grupo de empresas não devem ser notificadas");
		}
		
		else
		{
			System.out.println("o 1º, 2º e 3º grupo de empresas devem ser intimadas para suspenderem suas atividade");
		}

	}

}
