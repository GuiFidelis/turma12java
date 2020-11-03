programa
{
	
	funcao inicio()
	{
		
		real notas[4], maiorNum=0.0
		inteiro cont=0
		

		para ( cont=0; cont<4; cont++)
		{
			escreva("Insira o valor da nota ",cont+1," : ")
			leia(notas[cont])

			se(notas[cont] > maiorNum)
			{
			maiorNum = notas[cont]
			}
		}

		escreva("\n---------------------------------")
		escreva("\n\nO maior valor digitado é: ", maiorNum)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */