programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{ 	
		real peso=0.0, altura=0.0, imc=0.0

		escreva ("Informe o seu peso: ")
		leia(peso)
		
		escreva("\nInforme a sua altura: ")
		leia(altura)
		
		altura = mat.potencia(altura,2)
		imc=peso/altura
		limpa()
		
		se (imc < 18.5)
		{
			escreva("Você está abaixo do peso")
		}
		senao se (imc > 18.5 e imc <=25)
		{
			escreva("Você está com o peso normal")
		}
		senao se (imc > 25 e imc ==30)
		{
			escreva("Você está acima do peso")
		}
		senao se (imc > 30)
		{
			escreva("Você está obeso")
		}
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 569; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */