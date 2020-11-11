package Lista03;

import java.util.Scanner;

public class Lista03Exerc06 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, soma=0, cont=1;

		System.out.print("Insira um número para soma: ");
		numero = read.nextInt();
				
		System.out.print("A soma de ");
		do
		{
			if (cont == 1)
			{
				System.out.printf("%d",cont);
				soma = soma + cont;
				cont++;
			}
			else 
			{
				System.out.printf(" + %d",cont);
				soma = soma + cont;
				cont++;
			}
					
		}while(cont <= numero);

		System.out.printf(" é igual a %d", soma);

	}

}
