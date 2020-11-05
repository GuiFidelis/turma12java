programa
{
	
	funcao inicio()
	{

		inteiro numero


		escreva("Digite o numero inteiro [+ / -]:")
		leia(numero)

		linha()
		
		se (numero <0){
			escreva("\nO numero digitado é negativo")
		}
		senao se (numero > 0){
			se ((numero % 2)==0){
			escreva("\nNumero positivo e par!")
			}
			senao {
				escreva("\nNumero positivo e impar!!")
			}
			
		}
		senao
		{
			escreva("\nVocê digitou o zero que é neutro")
		}


	}

	funcao linha()
	{
		escreva("\n------------------------\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */