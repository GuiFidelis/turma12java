programa
{
	
	funcao inicio()
	{

		real indicePol

		escreva("Insira o índice de poluição: ")
		leia(indicePol)

		se ( indicePol < 0.3){

		escreva("nenhuma empresa precisa ser notificada")
			
		}

		senao se ( indicePol < 0.4){

			escreva("o 1º grupo de empresas devem ser intimadas para suspenderem suas atividades")
			escreva("\no 2º e 3º grupo de empresas não devem ser notificadas")
		}

		senao se ( indicePol < 0.5){

			escreva("o 1º e o 2º grupo de empresas devem ser intimadas para suspenderem suas atividades")
			escreva("\no 3º grupo de empresas não devem ser notificadas")
			
		}
		
		senao{
			
			escreva("o 1º, 2º e 3º grupo de empresas devem ser intimadas para suspenderem suas atividade")
		}

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