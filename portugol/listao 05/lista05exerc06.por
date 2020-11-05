programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro matriz [3][3]
		inteiro vetor[3]
		inteiro lin,col
		inteiro resultado

		escreva ("Vetor:\n")
		para(lin=0;lin<3;lin++)
		{
			vetor[lin] = Util.sorteia(20, 49)
			escreva ("[", vetor[lin],"]")	
		}
		
		escreva("\n\nMatriz:")
		para (lin=0;lin<3;lin++)
		{
			escreva ("\n")
			para (col=0;col<3;col++)
			{
				matriz[lin][col] = Util.sorteia(10, 20)
				escreva("[", matriz[lin][col],"]")	
			}
		}

		escreva ("\n\nMatriz Resultado:")
		para (lin=0;lin<3;lin++)
		{
			escreva ("\n")
			para (col=0;col<3;col++)
			{
			resultado = vetor[col]*matriz[lin][col]
			escreva("[", resultado,"]")
			}
		}	
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */