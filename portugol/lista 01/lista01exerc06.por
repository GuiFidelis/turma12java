programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, y1
		real x2, y2
		real quadradox, quadradoy
		real distancia

		escreva("Valor do eixo x do primeiro ponto: ")
		leia (x1)
		escreva("Valor do eixo y do primeiro ponto: ")
		leia (y1)
		escreva("Valor do eixo x do segundo ponto: ")
		leia (x2)
		escreva("Valor do eixo y do segundo ponto: ")
		leia (y2)

		quadradox = mat.potencia((x2-x1), 2.0)
		quadradoy = mat.potencia((y2-y1), 2.0)
		distancia = mat.raiz((quadradox+quadradoy), 2)

		distancia = mat.arredondar(distancia,2)

		escreva("A distancia entre os dois pontos é de: "+distancia+" metros")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 633; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */