programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		//variaveis
	
		inteiro cont=0, qtdFilhos, numEntrevistas
		real valSal
		inteiro qtdMenorSal=0
		real  mediaSal=0.0, totalSal=0.0, maiorSal=0.0, mediaFilhos=0.0, totalFilhos=0.0, menorSalPorc=0.0

		escreva("Insira o numero de habitantes entrevistados: ")
		leia (numEntrevistas)


		para (cont=1; cont<=numEntrevistas; cont++)
		{
			//entradas
			escreva("\nDigite o salário do entrevistado ", cont," :")
			leia(valSal)
			escreva("Digite a quantidade de filhos do entrevistado ", cont, " :")
			leia(qtdFilhos)
			escreva("\n")

			//proessamento
			totalSal = totalSal + valSal
			totalFilhos = totalFilhos + qtdFilhos

			se(valSal > maiorSal)
			{
				maiorSal = valSal
			}
			se(valSal <= 100.00)
			{
				qtdMenorSal = qtdMenorSal++
			}

		}

		//processamento de médias
		mediaSal = (totalSal/numEntrevistas)
		mediaFilhos = (totalFilhos/numEntrevistas)
		menorSalPorc = (qtdMenorSal*100)/numEntrevistas)
		

		//arredondar
		mediaSal = mat.arredondar(mediaSal,2)
		mediaFilhos = mat.arredondar(mediaFilhos,2)
		menorSalPorc = mat.arredondar(menorSalPorc,2)
		
		
		escreva("-------------------------------")
		escreva("\n")

		//saída
		escreva("\nA média de salário da população é: ", mediaSal," reais")
		escreva("\nA média do número de filhos é de: ", mediaFilhos)
		escreva("\nO maior salário é de: ", maiorSal," reais")
		escreva("\nPercentual de pessoas com salario de até 100 reais é de: ", menorSalPorc,"%")
		
		
	}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 269; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */