import java.util.Scanner;

public class ExemploTemperatura {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		double c=0,f=0;
		
		System.out.print("Escreva a temperatura em graus celcius: ");
		c =  leia.nextDouble();
		
		f = (c * (9/5))+32;
		
		System.out.printf("A temperatura em fahrenheit é: %.1f°F",f);
		
	}	
	
}
