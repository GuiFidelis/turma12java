programa
{
	
	funcao inicio()
	{
		
		real base, altura, area 

		escreva("Insira o tamanho da base do triângulo: ")
		leia(base)
		escreva("Insira o tamanho da altura do triângulo: ")
		leia(altura)

		se ( altura < 1 ou base <1){

			escreva("O valor da base ou da altura deve ser maior que zero.")
			
		}
		senao{

			area = (base * altura)/2

			escreva("O valor da área é de: "+area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */