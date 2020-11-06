package Lista01;

import java.util.Scanner;

public class Lista01Exerc03 {

	
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int duracaoSegundos;
		int horas;
		int minutos;
		int segundos;
		
		System.out.print("Tempo de duração do evento em segundos: ");
		duracaoSegundos =  leia.nextInt();

		horas = duracaoSegundos /3600;
		minutos = (duracaoSegundos % 3600)/60;
		segundos = ((duracaoSegundos % 3600)%60);
		System.out.print("-------------------");
		System.out.printf("\nHoras: %d", horas);
		System.out.printf("\nMinutos: %d", minutos);
		System.out.printf("\nSegundos: %d", segundos);
		
	}
}
