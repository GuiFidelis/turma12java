programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		inteiro C
		real N, NExcedente
		real E=0	
		real valSalTotal=0, valSalExcedente=0
		const real valHoraNormal=10.00, valHoraExcedente=20.00

		escreva("Insira o código do funcionário: ")
		leia(C)
		escreva("Insira o número de horas trabalhadas: ")
		leia(N)

		enquanto ( N <= 0){
			escreva("Insira um valor maior que zero: ")
			leia(N)
		}
		
		se( N <= 50){

			valSalTotal = (N*valHoraNormal)

			escreva("O salário total é de: "+valSalTotal+" reais")
			escreva("\nNão há valor referente à horas excedentes")
		}
		
		senao{
			
			E = (N-50)
			valSalExcedente = E*valHoraExcedente
			valSalTotal = ((N-E)*valHoraNormal) + valSalExcedente

			valSalExcedente = mat.arredondar(valSalExcedente,2)
			valSalTotal = mat.arredondar(valSalTotal,2)

			escreva("O salário total é de: "+valSalTotal+" reais")
			escreva("\nO salário excedente é de: "+valSalExcedente+" reais")
				
		}
			
						
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 958; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */