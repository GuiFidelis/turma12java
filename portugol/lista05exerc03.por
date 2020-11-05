programa
{
	
	funcao inicio()
	{
		inteiro num=0, grupo1=0, grupo2=0, grupo3=0, grupo4=0

		enquanto (num >= 0)
		{
			escreva("Digite um número: ")
			leia(num)
			
			se (num>=0 e num<=25)
			{  
				grupo1 = grupo1 + 1
			}
			senao se (num>=26 e num<=50)
			{  
				grupo2 = grupo2 + 1
			}
			senao se (num>=51 e num<=75)
			{  
				grupo3 = grupo3 + 1
			}
			senao se (num>=76 e num<=100)
			{  
				grupo4 = grupo4 + 1
			}
			
		}

		escreva("\nA quantidade de números entre 0 e 25 é: ",grupo1)
		escreva("\nA quantidade de números entre 26 e 50 é: ",grupo2)
		escreva("\nA quantidade de números entre 51 e 75 é: ",grupo3)
		escreva("\nA quantidade de números entre 76 e 100 é: ",grupo4)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */