package ListaPoo02;

import java.util.Scanner;

public class ProgramaFornecedor {

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		
		Fornecedor fornecedor1 = new Fornecedor();
		Fornecedor fornecedor2 = new Fornecedor("joao", "rua 1", "9999", 250, 100);
		
		System.out.print("Informe o nome do fornecedor: ");
		fornecedor1.setNome(input.nextLine());
		System.out.print("Informe o endereco: ");
		fornecedor1.setEndereco(input.nextLine());
		System.out.print("Informe o telefone: ");
		fornecedor1.setTelefone(input.nextLine());
		System.out.print("Informe o valor da dívida com o fornecedor: ");
		fornecedor1.setValorDivida(input.nextDouble());
		System.out.print("Informe o valor a ser creditado: ");
		fornecedor1.setValorCredito(input.nextDouble());
		
		
		System.out.print("\n\tDados Gerais");
		System.out.print("\n--------------------------");
		System.out.print("\nNome: "+fornecedor1.getNome());
		System.out.print("\nEndereço: "+fornecedor1.getEndereco());
		System.out.print("\nTelefone: "+fornecedor1.getTelefone());
		System.out.printf("\nSaldo: R$%.2f",fornecedor1.obterSaldo());
		System.out.print("\n--------------------------");
		

	}

}
