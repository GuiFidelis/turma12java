programa
{
	
	funcao inicio()
	{
		const inteiro x=10
		real notas[x], maiorNum=0.0, media=0.0, soma=0.0
		inteiro cont=0, ocorrencias=0
		
		para ( cont=0; cont<x; cont++)
		{
			escreva("Insira o valor da nota ",cont+1," : ")
			leia(notas[cont])

			se(notas[cont] > maiorNum)
			{
				ocorrencias = 1
				maiorNum = notas[cont]
			}
			senao se(notas[cont] == maiorNum)
			{
				ocorrencias++
			}

			soma = soma + notas[cont]
		}

		media = (soma/10)
		
		escreva("\nA media dos números digitados é: ",media)
		escreva("\nA maior nota é ",maiorNum," e ocorreu ",ocorrencias," vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 41; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */