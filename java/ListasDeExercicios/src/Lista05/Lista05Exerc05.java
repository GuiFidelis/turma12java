package Lista05;

import java.util.Scanner;

public class Lista05Exerc05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int opcao;
		
		do
		{
			System.out.print("1- Mostra o vetor na ordem direta\n2- Mostra o vetor na ordem inversa\n0- Sair\nInsira a opcão: ");
			opcao = input.nextInt();
		
			imprimeVetor(opcao);
			
		}while(opcao != 0);

	}
	
	public static void imprimeVetor(int opcao)
	{
		int numeros[]= {23,55,2,30,99};
		
		if(opcao ==1)
		{
			System.out.print("\nVetor na ordem direta:\n");
			for( int cont : numeros)
			{
				System.out.printf("[%d] ",cont);
			}
			System.out.print("\n\n");
		}
		
		else if(opcao ==2)
		{
			int i=0, f;
			f = numeros.length;
			i = f-1;
			
			System.out.print("\nVetor na ordem direta:\n");
			for(int cont=0; cont<f; cont++)
			{
				System.out.printf("[%d] ",numeros[i]);
				i--;
			}
			System.out.print("\n\n");
		}
		
		else if(opcao != 0)
		{
			System.out.print("\nOpção inválida\n\n");
		}
		
		
	}

}
