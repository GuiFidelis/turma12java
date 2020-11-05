programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro numero, valMult=0
		
		//entradas
		escreva("Insira um número positivo para ser multiplicado: ")
		leia(numero)
		
		valMult = numero

		//processamento
		enquanto(valMult <= 100)
		{
			
			
			se (numero == valMult)
			{
				//saida
				escreva(valMult, " ")
			
			}
			
			valMult = valMult*3

			//saida
			escreva(valMult, " ")

		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */