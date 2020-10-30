programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//variaveis
		real numero, media=0.0, cont=0.0, somaNumero=0.0
		
		//entradas
		escreva("Insira um número positivo para soma ou um número negativo para encerrar o programa: ")
		leia(numero)

		
		enquanto(numero >= 0)
		{
		
			somaNumero = (somaNumero + numero)
			
			se(numero == 0)
			{
				escreva("\nLembre-se que zero não irá fazer diferença na soma")
				escreva("\nInsira um número positivo para soma ou um número negativo para encerrar o programa: ")
				leia(numero)
			}
			senao se (numero > 0)
			{
				escreva("\nInsira um número positivo para soma ou um número negativo para encerrar o programa: ")
				leia(numero)
				cont = cont++
			}
					
		}

		//processamento da media
		media = (somaNumero/cont)

		//arredondar
		media = mat.arredondar(media,2)
		
		//saída
		se (somaNumero <= 0)
		{
			escreva("\nNenhum número foi somado")
		}
		senao
		{
			
			escreva("\nForam inseridos um total de : ", cont," números positivos")
			escreva("\nA média deles é de: ",media)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */