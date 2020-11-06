package Lista01;

import java.util.Scanner;

public class Lista01Exerc06 {
	
	public static void main (String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
		double x1, y1;
		double x2, y2;
		double quadradox, quadradoy;
		double distancia;

		System.out.print("Valor do eixo x do primeiro ponto: ");
		x1 = leia.nextDouble();
		
		System.out.print("Valor do eixo y do primeiro ponto: ");
		y1 = leia.nextDouble();
		
		System.out.print("Valor do eixo x do segundo ponto: ");
		x2 = leia.nextDouble();
		
		System.out.print("Valor do eixo y do segundo ponto: ");
		y2 = leia.nextDouble();

		quadradox = Math.pow((x2-x1), 2);
		quadradoy = Math.pow((y2-y1), 2);
		distancia = Math.sqrt((quadradox+quadradoy));

		System.out.printf("A distância entre os dois pontos é de: %.2f metros.",distancia);
		
	}

}
