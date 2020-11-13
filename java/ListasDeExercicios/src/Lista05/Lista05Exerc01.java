package Lista05;

import java.util.Scanner;

public class Lista05Exerc01 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double valProduto = 0.0;
		int opcaoPaga = 0, opcaoCartao = 0;
				 

		System.out.print("Digite o valor do produto: ");
		valProduto = input.nextDouble();
		
		do
		{			
			System.out.print("1 - Dinheiro ou cheque.\n2 - Cartão credito.");
			System.out.print("\nSelecione a forma de pagamento: ");
			opcaoPaga = input.nextInt();
			
			if(opcaoPaga == 1)
			{
				calcDesconto(valProduto, 1);					
			}
			else if(opcaoPaga == 2)
			{
				do 
				{
					System.out.print("\n1 - 1X no Cartão de crédito.\n2 - 2X no Cartão de crédito.\n3 - 3X no Cartão de crédito.");
					System.out.print("\nSelecione a forma de pagamento: ");
					opcaoCartao = input.nextInt();

					if(opcaoCartao == 1)
					{
						calcDesconto(valProduto, 2);
					}

					else if(opcaoCartao == 2)
					{
						calcDesconto(valProduto, 3);
					}

					else if(opcaoCartao == 3)
					{
						calcDesconto(valProduto, 4);
					}
				
					else if(opcaoCartao < 1 || opcaoCartao > 3)
					{
						mensagem();
					}
							
				}while(opcaoCartao < 1 || opcaoCartao > 3);
						}
					
			else if(opcaoPaga < 1 || opcaoPaga > 2)
			{
				mensagem();
			}

		}while(opcaoPaga < 1 || opcaoPaga > 2);

	}
	
	public static void mensagem()
	{
		System.out.print("\n");
		System.out.print("-------------------------");
		System.out.print("\n");
		System.out.print("Opção inválida");
		System.out.print("\n");
		System.out.print("-------------------------");
		System.out.print("\n\n");
	}
	
	public static void calcDesconto(double valProduto, int OpcaoPaga)
	{
		double desconto=0.0;
		
		if( OpcaoPaga == 1)
		{
			System.out.print("\n");
			desconto = (valProduto * 0.20);
			valProduto = valProduto - desconto;
			System.out.printf("O valor do desconto é de: %.2f reais.",desconto);
			System.out.printf("\nO total a pagar é: %.2f reais.",valProduto);
		}
		
		else if( OpcaoPaga == 2)
		{
			System.out.print("\n");
			desconto = (valProduto * 0.15);
			valProduto = valProduto - desconto;
			System.out.printf("O valor do desconto é de: %.2f reais.",desconto);
			System.out.printf("\nO total a pagar é: %.2f reais.",valProduto);
		}
		
		else if( OpcaoPaga == 3)
		{
			System.out.print("\n");
			valProduto =  valProduto / 2;
			System.out.printf("Não há desconto ao parcelar em 2X.",desconto);
			System.out.printf("\nO total a pagar é: 2X Parcelas de %.2f reais.",valProduto);
		}
		
		else if( OpcaoPaga == 4)
		{
			System.out.print("\n");
			desconto = (valProduto * 0.10);
			valProduto = valProduto + desconto;
			valProduto =  valProduto / 3;
			System.out.printf("Há um acrescimo de: %.2f reais no valor final.",desconto);
			System.out.printf("\nO total a pagar é: 3X Parcelas de %.2f reais.",valProduto);
		}
		
	}

}
