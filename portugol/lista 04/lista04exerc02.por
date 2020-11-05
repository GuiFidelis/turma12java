programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro x=10
		real  media=0.0, soma=0.0
		inteiro cont=0, ocorrencias=0, lancamentos[x], maiorNum=0
		
		para ( cont=0; cont<x; cont++)
		{
			lancamentos[cont] = Util.sorteia(1,6)

			se(lancamentos[cont] > maiorNum)
			{
				ocorrencias = 1
				maiorNum = lancamentos[cont]
			}
			senao se(lancamentos[cont] == maiorNum)
			{
				ocorrencias++
			}

			soma = soma + lancamentos[cont]

			escreva("O valor do lançamento do dado ",cont+1," é: ",lancamentos[cont],"\n")
		}

		media = (soma/x)

		escreva("\nA soma dos valores é: ",soma)
		escreva("\nA média dos resultados é: ",media)
		escreva("\nA maior nota é ",maiorNum," e ocorreu ",ocorrencias," vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */