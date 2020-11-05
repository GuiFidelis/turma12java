programa
{
	inclua biblioteca Texto --> tx
	
	funcao inicio()
	{
		const inteiro numTimes=4
		
		cadeia times[numTimes]={"CORINTHIANS","PALMEIRAS","SANTOS","SPFC"}
		cadeia nomeTime
		inteiro pontuacao[numTimes], vit[numTimes], der[numTimes], emp[numTimes]
		caracter result, decisao
		inteiro cont=0, pt=0, rodada=0, verificaTime=0
		
		
		escreva("Paulistinha!!!\n\n")

//looping pontos		
		faca 
		{
			enquanto(cont<numTimes)
			{

				escreva("Rodada ",rodada++,":\n")
			
				para(cont=0; cont<numTimes; cont++)
				{
					escreva("\n",times[cont])
					escreva("\nG-Ganhou, P-Perdeu ou E-Empatou: ")
					leia(result)

					enquanto((result != 'G' e result != 'g') e (result != 'P' e result != 'p') e (result != 'E' e result != 'e'))
					{
						escreva("Infome uma opção válida")
						escreva("\nG-Ganhou, P-Perdeu ou E-Empatou: ")
						leia(result)
					}

					se (result == 'G' ou result == 'g')
					{
						pt=3
						vit[cont] = 1 + vit[cont]			
					}
					senao se (result =='E' ou result =='e')
					{
						pt=1
						emp[cont] = 1 + emp[cont]
					}
					senao 
					{
						pt=0
						der[cont] = 1 + der[cont]
					}
					
					pontuacao[cont] = pt + pontuacao[cont]
					
					
					
				}
			}

			escreva("\n\nQuer continuar? S-SIM ou N-NÃO: ")
			leia(decisao)
		
			enquanto((decisao != 'S' e decisao != 's') e (decisao != 'N' e decisao != 'n'))
			{
				limpa()
				escreva("Infome uma opção válida")
				escreva("\n\nQuer continuar? S-SIM ou N-NÃO: ")
				leia(decisao)
			}

			cont=0
			limpa()	
		}enquanto (decisao == 'S' ou decisao == 's')
		

//resultado
		escreva("Pontuação dos Times:\n")
			
		para(cont=0; cont<numTimes; cont++)
		{
			escreva("\n",times[cont]," tem ",pontuacao[cont]," pontos")
						
		}
		escreva("\n\n")
		escreva("---------------------------------\n\n")
		
//escolha seu time		
		faca{
			escreva("Informe o nome do seu time: ")
			leia(nomeTime)
			nomeTime = tx.caixa_alta(nomeTime)
			limpa()

			para(cont=0; cont<numTimes; cont++)
			{
				se( nomeTime == times[cont] )
				{
					escreva("O ",times[cont]," tem: ",pontuacao[cont]," pontos")
					escreva("\nVitórias: ",vit[cont])
					escreva("\nEmpates: ",emp[cont])
					escreva("\nDerrotas: ",der[cont])
					verificaTime = 1	
				}
				senao se( verificaTime != 1 )
				{
					verificaTime =0
				}
								
			}

			se (verificaTime != 1)
			{
				escreva("Time não encontrado")
			}
			verificaTime =0

			escreva("\n\n")
			escreva("---------------------------------\n\n")
			escreva("Quer continuar? S-SIM ou N-NÃO: ")
			leia(decisao)
			enquanto((decisao != 'S' e decisao != 's') e (decisao != 'N' e decisao != 'n'))
			{
				limpa()
				escreva("Infome uma opção válida")
				escreva("\n\nQuer continuar? S-SIM ou N-NÃO: ")
				leia(decisao)
			}
	
			cont=0
			limpa()
		}enquanto  (decisao == 'S' ou decisao == 's')
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */