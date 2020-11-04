programa
{
	inclua biblioteca Util
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6)

		const inteiro linha = 4
		const inteiro coluna = 6
		inteiro N1[linha][coluna] 
		inteiro N2[linha][coluna]
		inteiro M1[linha][coluna]
		inteiro M2[linha][coluna]
		inteiro l=0, c=0


//inserir dados
		escreva("Primeira Matriz:\n")
		para(l=0; l<linha; l++)
		{
			escreva("\n")
			para(c=0; c<coluna; c++)
			{
				N1[l][c] = Util.sorteia(1,9)
			}
		}
		
		escreva("\n")
		escreva("Segunda Matriz:\n")
		para(l=0; l<linha; l++)
		{
			escreva("\n")
			para(c=0; c<coluna; c++)
			{
				N2[l][c] = Util.sorteia(1,9)
			}
		}

		limpa()

//Matriz 1		
		escreva("Matriz 1:\n")
		para(l=0; l<linha; l++)
		{
			para(c=0; c<coluna; c++)
			{
				escreva("[ ",N1[l][c]," ]")
			}
			escreva("\n")
		}

//Matriz 2
		escreva("\n")
		escreva("Matriz 2:\n")
		para(l=0; l<linha; l++)
		{
			para(c=0; c<coluna; c++)
			{
				escreva("[ ",N2[l][c]," ]")
			}
			escreva("\n")
		}


//Matriz Soma
		escreva("\n")
		escreva("Matriz Soma (M1):\n")
		para(l=0; l<linha; l++)
		{
			para(c=0; c<coluna; c++)
			{
				escreva("[ ",M1[l][c]=N1[l][c]+N2[l][c]," ]")
			}
			escreva("\n")
		}

//Matriz Diferenca
		escreva("\n")
		escreva("Matriz Diferença (M2):\n")
		para(l=0; l<linha; l++)
		{
			para(c=0; c<coluna; c++)
			{
				escreva("[ ",M2[l][c] = mat.valor_absoluto(N1[l][c]-N2[l][c])," ]")
			}
			escreva("\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
