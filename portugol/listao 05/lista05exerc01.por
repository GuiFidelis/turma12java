programa
{
	inclua biblioteca Matematica --> mat 

	 real valProduto = 0.0, desconto = 0.0
	 inteiro opcaoPaga = 0, opcaoCartao = 0
	 
	funcao inicio()
	{
		escreva("Digite o valor do produto: ")
		leia(valProduto)
		limpa()
		
		faca
		{
				
			escreva("1 - Dinheiro ou cheque.\n2 - Cartão credito.")
			escreva("\nSelecione a forma de pagamento: ")
			leia(opcaoPaga)
			limpa()
		
			se(opcaoPaga == 1)
			{
				desconto = (valProduto * 0.20)
				valProduto = valProduto - desconto
				escreva("O valor do desconto é de: ", mat.arredondar(desconto, 2)," reais.")
				escreva("\nO total a pagar é: ", mat.arredondar(valProduto, 2)," reais.")
					
			}
			senao se(opcaoPaga == 2)
			{
			
				faca{
								
					escreva("1 - 1X no Cartão de crédito.\n2 - 2X no Cartão de crédito.\n3 - 3X no Cartão de crédito.")
					escreva("\nSelecione a forma de pagamento: ")
					leia(opcaoCartao)
					limpa()
		
					se (opcaoCartao == 1)
					{
						desconto = (valProduto * 0.15)
						valProduto = valProduto - desconto
						escreva("O valor do desconto é de: ", mat.arredondar(desconto, 2)," reais.")
						escreva("\nO total a pagar é: ", mat.arredondar(valProduto, 2)," reais.")
					}

					senao se (opcaoCartao == 2)
					{
						valProduto =  valProduto / 2
						escreva("O valor do desconto é de: ", mat.arredondar(desconto, 2)," reais.")
						escreva("\nO total a pagar são 2 parcelas de: ", mat.arredondar(valProduto, 2)," reais.")
					}

					senao se (opcaoCartao == 3)
					{
		 
						desconto = (valProduto * 0.10)
						valProduto = valProduto + desconto
						valProduto =  valProduto / 3
						escreva("Haverá um acrescimo de: ", mat.arredondar(desconto, 2)," reais.")
						escreva("\nO total a pagar são 3 parcelas de: ", mat.arredondar(valProduto, 2)," reais.")
					}
	
					senao se (opcaoCartao < 1 ou opcaoCartao > 3)
					{
					escreva("Opção inválida")
					escreva("\n\n")
					escreva("-------------------------")
					escreva("\n\n")
					}
				
				}enquanto(opcaoCartao < 1 ou opcaoCartao > 3)
			}
		
		senao se (opcaoPaga < 1 ou opcaoPaga > 2)
		{
			escreva("Opção inválida")
			escreva("\n\n")
			escreva("-------------------------")
			escreva("\n\n")
		}

		}enquanto (opcaoPaga < 1 ou opcaoPaga > 2)
		
		desconto = 0.0 //caso for utilizar uma condicao para inserir outro valor, é preciso zerar a variavel desconto
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */