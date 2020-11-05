programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro cont=0, testePar=0, testeImpar=0
		inteiro soma=0
		
		//entradas
		escreva("Este programa calcula a soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500")
		escreva("\n\n-------------------------------------")
		escreva("\n")
		
		//proessamento
		para (cont=1; cont<=500; cont++)
		{
			testePar = (cont%2)
			
			se (testePar != 0)
			{
				testeImpar = (cont%3)

				se (testeImpar == 0)
				{
					soma = (soma+cont)
				}
			
			}
		}
		
		//saidas
		escreva("\nO resultado da soma é de: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */