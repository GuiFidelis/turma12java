programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real valorCarro
		real valorDistribuidor
		real valorImposto
		real valorConsumidor

		escreva("Insara o valor de fabrica do veículo: ")
		leia (valorCarro)

		valorDistribuidor = (valorCarro * 0.28)
		valorImposto = (valorCarro * 0.45 )
		valorConsumidor = (valorCarro + valorImposto + valorDistribuidor)

		valorConsumidor = mat.arredondar(valorConsumidor,2)

		escreva("O consumidor vai pegar no veículo: " +valorConsumidor+ " reais")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */