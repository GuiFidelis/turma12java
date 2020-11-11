import java.util.Scanner;

public class ListagemAlunos {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		// VARIAVEIS - VETOR
		String nomes[] = {"Ana veronica Nascimento cruz", "Bruno Estivalli Vicente", "Bruno Henrique Moraes Santos", "Daniel Ferreira", "Dayane de Oliveira", "Denis Vinicius Bolla da Silva", "Diego  Joaquim Silva ", "Erick Alan", "Everson Silva", "Gabriel Enrique Cabral Silva", "Guilherme Alex", "Guilherme Fidelis Pereira", "Gustavo Miquéias Lopes Santana", "Isac Cordeiro de Oliveira", "Iuri Garcia Nunes", "Jenifer Lima Placido", "Jéssica Cristiane", "Joao Pedro Sena", "Larissa Moraes Ribeiro", "Leonardo de Moraes Magalhães", "Lucas Santos Gonçalves", "Mariana  de Cássia Antunes Oliveira", "Patricia da Silva Machado", "Paula Leticia", "Raul Fernandes", "Ricardo Magalhaes Finkelstein", "Thiago dos Anjos", "Vitória Gonçalves de Freitas", "William Xavier"};
		String codigos[] = new String[29];
		int grupos[] = new int[29];
		boolean masculinos[] = {false,true,true,true,false,true,true,true,true,true,true,true,true,true,true,false,false,true,false,true,true,false,false,false,true,true,true,false,true};
		int tamanho=0;
		int grupo = 1;
		int menuPrincipal=0, menuGrupos=0;
		char opcaoSN;
		
		
		//inserir código dos alunos automáticamente
		for (int x = 0; x<29; x++) 
		{
			codigos[x] = "MAT"+(x+1);
		}
		
		//menu de opcões principal
		do
		{
			System.out.print("1 - Exibir o  código e o nome todos os alunos.");
			System.out.print("\n2 - Criar Grupo de Alunos.");
			System.out.print("\n3 - Exibir Dados dos Grupos.");
			System.out.print("\n4 - Sair.");
			System.out.print("\nSelecione o número da opção desejada: ");
			menuPrincipal = read.nextInt();
			
			//Exibir nome e código de todos alunos
			if( menuPrincipal == 1)
			{
				System.out.print("\n----------------------------------------\n\n");
				System.out.println("COD \t NOME"); //CABEÇALHO
				
				for(int x = 0; x<29; x++) 
				{
					System.out.printf("%s \t %s\n",codigos[x],nomes[x]);
				}
				
				System.out.print("\n----------------------------------------\n\n");
			}
			
			//Selecionar Grupos
			else if( menuPrincipal == 2)
			{
				System.out.print("\n----------------------------------------\n\n");
				do
				{
					System.out.print("1 - Separar os Grupos por Ordem de Chamada.");
					System.out.print("\n2 - Separar os Grupos Aleatóriamente.");
					System.out.print("\n3 - Separar Homens de Mulhres.");
					System.out.print("\n4 - Sair.");
					System.out.print("\nSelecione o número da opção desejada: ");
					menuGrupos = read.nextInt();
					
					if( menuGrupos == 1)
					{
						System.out.print("\n----------------------------------------\n\n");
						do {
							
							System.out.print("Tamanho do grupo de 2 a 10: ");
							tamanho = read.nextInt();
							
						
							//Teste para verificar valor de tamanho dos grupos
							if (tamanho >= 2 && tamanho <= 10)
							{
								System.out.print("\n----------------------------------------\n\n");
								System.out.println("COD \t GRUPO \t NOME"); //CABEÇALHO
								for(int x = 0; x<29; x++)
								{
									grupos[x] = grupo;
									System.out.printf("%s \t %s \t %s\n",codigos[x],grupos[x], nomes[x]);
									
									if (((x+1)%tamanho)==0 )
									{
										grupo++;
									}
								}
							}
							else if (tamanho < 2 || tamanho > 10)
							{
								System.out.print("\n---------------------------------------\n");
								System.out.print("Opção inválida!!!\n");
								System.out.print("---------------------------------------\n\n");
							}
														
						}while(tamanho < 2 || tamanho > 10);
						System.out.print("\n----------------------------------------\n\n");
					}
					
					else if( menuGrupos == 2)
					{
						
					}
					
					else if( menuGrupos == 3)
					{
						int mulheres = 0;
						int homens=0;
						
						System.out.print("\n----------------------------------------\n\n");
	
						System.out.println("LISTAGEM MASCULINOS");
						System.out.println("COD \t GENERO \t\t NOME"); //CABEÇALHO
						for(int x = 0; x<29; x++) {
							if (masculinos[x]==true)
							{
								System.out.printf("%s \t M \t\t %s\n",codigos[x],nomes[x]);
								homens++;
							}
							
						}
						System.out.println("\nTotal de homens "+homens);
						System.out.print("\n----------------------------------------\n\n");
						
						System.out.println("LISTAGEM FEMININOS");
						System.out.println("COD \t GENERO \t\t NOME"); //CABEÇALHO
						for(int x = 0; x<29; x++) {
							if (masculinos[x]==false)
							{
								System.out.printf("%s \t F \t\t %s\n",codigos[x],nomes[x]);
								mulheres++;
							}
						}
						System.out.println("\nTotal de mulheres "+mulheres);
						
						System.out.print("\n----------------------------------------\n\n");
						
						do {
							
							System.out.print("Deseja criar um grupo a partir desta separação? [S/N]: ");
							opcaoSN = read.next().charAt(0);
							opcaoSN = Character.toUpperCase(opcaoSN);
							
							if (opcaoSN == 'S')
							{
								do {
									
									System.out.print("Tamanho do grupo de 2 a 10: ");
									tamanho = read.nextInt();
									
								
									//Teste para verificar valor de tamanho dos grupos
									if (tamanho >= 2 && tamanho <= 10)
									{
										int cont=0;
										grupo=1;
										
										System.out.print("\n----------------------------------------\n\n");
										System.out.println("COD \t GRUPO \t NOME"); //CABEÇALHO
										for(int x = 0; x<29; x++)
										{
											if (masculinos[x]==true)
											{
												grupos[x] = grupo;
												System.out.printf("%s \t %s \t %s\n",codigos[x],grupos[x], nomes[x]);
												cont++;
												if (((cont)%tamanho)==0 )
												{
													grupo++;
												}
											}
											if (((grupos[x])%tamanho ) != 0 && x==28)
											{
												grupo++;
											}
										}
										
										System.out.print("\n----------------------------------------\n\n");
										System.out.println("COD \t GENERO \t\t NOME"); //CABEÇALHO
										
										cont=0;
										for(int x = 0; x<29; x++)
										{
											
											if (masculinos[x]==false)
											{
												grupos[x] = grupo;
												System.out.printf("%s \t %s \t %s\n",codigos[x],grupos[x], nomes[x]);
												cont++;
												if (((cont)%tamanho)==0 )
												{
													grupo++;
												}
											}
										}
										
										
									}
									else if (tamanho < 2 || tamanho > 10)
									{
										System.out.print("\n---------------------------------------\n");
										System.out.print("Opção inválida!!!\n");
										System.out.print("---------------------------------------\n\n");
									}
																
								}while(tamanho < 2 || tamanho > 10);
							}
							
						}while(opcaoSN != 'S' && opcaoSN != 'N');
						System.out.print("\n----------------------------------------\n\n");
					}
					
					else if (menuGrupos != 4)
					{
						System.out.print("\n---------------------------------------\n");
						System.out.print("Opção inválida!!!\n");
						System.out.print("---------------------------------------\n\n");
					}
										
				}while(menuGrupos != 4);
				System.out.print("\n----------------------------------------\n\n");
			}
			
			else if( menuPrincipal == 3)
			{
				if( grupos[0] == 0)
				{
					System.out.print("\n----------------------------------------\n");
					System.out.print("Os alunos ainda não foram dividos em grupos!!\n");
					System.out.print("----------------------------------------\n\n");
				}
				
				else
				{
					System.out.println("COD \t GRUPO \t NOME"); //CABEÇALHO
					for(int x = 0; x<29; x++) {
						System.out.printf("%s \t %s \t %s\n",codigos[x],grupos[x], nomes[x]);
					}
				}
			}
			
			else if( menuPrincipal != 4)
			{
				System.out.print("\n----------------------------------------\n");
				System.out.print("Opção inválida!!\n");
				System.out.print("----------------------------------------\n\n");
			}
			
		}while(menuPrincipal != 4);
		
	}
}