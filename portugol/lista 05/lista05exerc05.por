programa
{
	inclua biblioteca Matematica-->mat

	funcao inicio()
	{
		
		real z=0.0,y=0.0,x=0.0
	
		para(x=0.0;x<99.0;x++){	
			y=y++
			x=x+1
			z=x/y
			escreva(x,"/",y,"= ",mat.arredondar(z,2),"\n")
		}		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 83; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */