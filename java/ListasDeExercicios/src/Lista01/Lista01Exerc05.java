package Lista01;

import java.util.Scanner;

public class Lista01Exerc05 {

	public static void main(String[] args)
	{
	
		Scanner leia = new Scanner(System.in);
		
		double nota1=0, nota2=0, nota3=0;
		double notaFinal=0;

		System.out.print("Informe a nota 1: ");
		nota1 = leia.nextDouble();
				
		System.out.print("Informe a nota 2: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Informe a nota 3: ");
		nota3 = leia.nextDouble();

		nota1 = nota1*2;
		nota2 = nota2*3;
		nota3 = nota3*5;

		notaFinal = (nota1 + nota2 + nota3)/10;

		System.out.printf("A nota final é: %.2f",notaFinal);
	}

}
