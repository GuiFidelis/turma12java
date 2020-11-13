package Lista05;

import java.util.Scanner;

public class Lista05Exerc04 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		calculo();
	}
	
	public static void calculo()
	{
		double z=0.0,y=0.0,x=0.0;
		
		for(x=0.0;x<99.0;x++)
		{	
			y++;
			x=x+1;
			z=x/y;
			System.out.printf("%.0f/%.0f = %.2f\n",x,y,z);
		}
	}

}
