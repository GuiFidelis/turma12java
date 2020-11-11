package Lista03;

import java.util.Scanner;

public class Lista03Exerc01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int cont=0, qtdFilhos, numEntrevistas;
		double valSal;
		int qtdMenorSal=0;
		double  mediaSal=0.0, totalSal=0.0, maiorSal=0.0, mediaFilhos=0.0, totalFilhos=0.0, menorSalPorc=0.0;

		System.out.print("Insira o numero de habitantes entrevistados: ");
		numEntrevistas = read.nextInt();


		for (cont=1; cont<=numEntrevistas; cont++)
		{
			//entradas
			System.out.printf("\nDigite o sal�rio do entrevistado: ", cont," :");
			valSal =  read.nextDouble();
			System.out.printf("Digite a quantidade de filhos do entrevistado: ", cont, " :");
			qtdFilhos = read.nextInt();
			System.out.print("\n");

			//processamento
			totalSal = totalSal + valSal;
			totalFilhos = totalFilhos + qtdFilhos;

			if(valSal > maiorSal)
			{
				maiorSal = valSal;
			}
			
			if(valSal <= 100.00)
			{
				qtdMenorSal++;
			}


		}

		//processamento de m�dias
		mediaSal = (totalSal/numEntrevistas);
		mediaFilhos = (totalFilhos/numEntrevistas);
		menorSalPorc = ((qtdMenorSal*100)/numEntrevistas);
						
		System.out.println("-------------------------------");
		
		//sa�da
		System.out.printf("\nA m�dia de sal�rio da popula��o �: %.2f reais", mediaSal);
		System.out.printf("\nA m�dia do n�mero de filhos � de: %.2f", mediaFilhos);
		System.out.printf("\nO maior sal�rio � de: %.2f reais", maiorSal);
		System.out.printf("\nPercentual de pessoas com salario de at� 100 reais � de: %.2f", menorSalPorc);

	}

}
