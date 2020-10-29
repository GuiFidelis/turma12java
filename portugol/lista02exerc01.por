programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real P
		real E = 0
		real M = 0

		escreva("Insira o peso do Tomate: ")
		leia(P)

		se (P > 40){

			E = (P-40)
			M = (E*4.00)

			E = mat.arredondar(E,2)
		     M = mat.arredondar(M,2)
			
			escreva("Para "+P+" quilos de Tomate teremos:")
		     escreva("\nExcesso de: "+E+" quilos.")
		     escreva("\nMulta no valor de: "+M+" reais.")
	
		}
		
		senao{
			
		escreva("Para "+P+" quilos de Tomate teremos:")
		escreva("\nExcesso de: "+E+" quilos.")
		escreva("\nMulta no valor de: "+M+" reais.")
		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 519; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */