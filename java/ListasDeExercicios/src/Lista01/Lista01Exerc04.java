package Lista01;

import java.util.Scanner;

public class Lista01Exerc04 {

	public static void main(String[]args)
	{
		Scanner leia = new Scanner(System.in);
		
		int a=0, b=0, c=0;
		double r=0, s=0, d=0;
		
		System.out.print("Informe o valor de A: ");
		a = leia.nextInt();
		
		System.out.print("Informe o valor de B: ");
		b = leia.nextInt();
		
		System.out.print("Informe o valor de C: ");
		c = leia.nextInt();

		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);

		d = (r+s)/2;

		System.out.printf("O valor de D na expressão é de: %d",d);
		
	}
	
}
