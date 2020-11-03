programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		
		const inteiro linha = 3
		const inteiro coluna = 3
		inteiro matriz[linha][coluna] 
		inteiro l=0, c=0, soma=0, somaDiagonal=0


		escreva("A matriz é:\n")
		para(l=0; l<linha; l++)
		{
			escreva("\n")
			para(c=0; c<coluna; c++)
			{
				
				matriz[l][c]= Util.sorteia(1,9)
				escreva("[ ",matriz[l][c]," ]")

				se (l == c)
				{
					somaDiagonal = somaDiagonal +matriz[l][c]
				}

				soma = soma +matriz[l][c]
			}
		}
		
		escreva("\n")
		escreva("\nA soma dos números digitados é: ",soma)
		escreva("\nA soma dos números da diagonal principal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */