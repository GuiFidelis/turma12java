package Lista01;

import java.util.Scanner;

public class Lista01Exerc07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a=0, b=0, c=0, d=0, e=0, f=0, x=0, y=0;
		
		System.out.print("Valor de a: ");
		a =  leia.nextDouble();
		
		System.out.print("Valor de b: ");
		b = leia.nextDouble();
		
		System.out.print("Valor de c: ");
		c = leia.nextDouble();
		
		System.out.print("Valor de d: ");
		d = leia.nextDouble();
		
		System.out.print("Valor de e: ");
		e = leia.nextDouble();
		
		System.out.print("Valor de f: ");
		f = leia.nextDouble();

		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));

		System.out.print("\nRESULTADOS:");
		System.out.printf("\nValor de x é: %.2f",x);
		System.out.printf("\nValor de y é: %.2f",y);
		
	}

}
