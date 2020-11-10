package Lista02;

import java.util.Scanner;

public class Lista02Exerc02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int C;
		double N;
		double E=0;	
		double valSalTotal=0, valSalExcedente=0;
		final double valHoraNormal=10.00, valHoraExcedente=20.00;

		System.out.print("Insira o código do funcionário: ");
		C = leia.nextInt();
		System.out.print("Insira o número de horas trabalhadas: ");
		N = leia.nextDouble();

		if (N <1)
		{
			System.out.print ("O valor de horas trabalhadas não é válido");
		}
		
		else if( N <= 50)
		{

			valSalTotal = (N*valHoraNormal);

			System.out.printf("O salário total é de: %.2f reais",valSalTotal);
			System.out.print("\nNão há valor referente à horas excedentes");
		}
		
		else{
			
			E = (N-50);
			valSalExcedente = E*valHoraExcedente;
			valSalTotal = ((N-E)*valHoraNormal) + valSalExcedente;

			System.out.printf("O salário total é de: %.2f reais", valSalTotal);
			System.out.printf("\nO salário excedente é de: %.2f reais",valSalExcedente);
				
		}
		
	}

}
