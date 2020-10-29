programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		
		real primeiroNum, segundoNum, terceiroNum, quartoNum
		real primeiroQuad, segundoQuad, terceiroQuad, quartoQuad


		escreva("Insira o valor do primeiro número: ")
		leia(primeiroNum)
		escreva("Insira o valor do segundo número: ")
		leia(segundoNum)
		escreva("Insira o valor do terceiro número: ")
		leia(terceiroNum)
		escreva("Insira o valor do quarto número: ")
		leia(quartoNum)



		terceiroQuad = mat.potencia(terceiroNum, 2.0)
		
		se( terceiroQuad >= 1000){

			escreva("\nO valor do quadrado do terceiro numero é: "+terceiroQuad)
		}
		
		senao{
			
			primeiroQuad = mat.potencia(primeiroNum, 2.0)
			segundoQuad = mat.potencia(segundoNum, 2.0)
			quartoQuad = mat.potencia(quartoNum, 2.0)

			escreva("O valor do quadrado de:")
			escreva("\n"+primeiroNum+" é igual a "+primeiroQuad)
			escreva("\n"+segundoNum+" é igual a "+segundoQuad)
			escreva("\n"+terceiroNum+" é igual a "+terceiroQuad)
			escreva("\n"+quartoNum+" é igual a "+quartoQuad)
							
		}
			
						
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1045; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */