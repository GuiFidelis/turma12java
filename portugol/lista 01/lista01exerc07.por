programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a,b,c,d,ex,f, x,y
		
		escreva("Valor de a: ")
		leia (a)
		escreva("Valor de b: ")
		leia (b)
		escreva("Valor de c: ")
		leia (c)
		escreva("Valor de d: ")
		leia (d)
		escreva("Valor de e: ")
		leia (ex)
		escreva("Valor de f: ")
		leia (f)

		x = ((c*ex)-(b*f))/((a*ex)-(b*d))
		y = ((a*f)-(c*d))/((a*ex)-(b*d))


		x = mat.arredondar(x,2)
		y = mat.arredondar(y, 2)
		escreva("\n")
		escreva("\nRESULTADOS:")
		escreva("\nValor de x é: "+x)
		escreva("\nValor de y é: "+y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 98; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */