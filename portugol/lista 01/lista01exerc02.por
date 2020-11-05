programa
{
	
	funcao inicio()
	{
		inteiro idadeTotalDias
		inteiro idadeAnos = 0
		inteiro idadeMeses = 0
		inteiro idadeDias = 0
		
		escreva("Insira a sua idade em dias: ")
		leia(idadeTotalDias)

		se (idadeTotalDias > 364){
			idadeAnos = idadeTotalDias/365
			idadeTotalDias = idadeTotalDias - (idadeAnos*365)
		}
		se(idadeTotalDias > 29){
			idadeMeses = idadeTotalDias/30
			idadeTotalDias = idadeTotalDias - (idadeMeses*30)
		}
		se(idadeTotalDias > 0){
		idadeDias = idadeTotalDias	
		}

		escreva("Sua idade é de: ",idadeAnos," anos, ",idadeMeses," meses e ",idadeDias," dias.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */