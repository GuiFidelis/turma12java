package ListaPoo02;

import java.util.Scanner;

public class ProgramaEmpregado {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Empregado empregado1 = new Empregado();
		

		System.out.print("Informe o nome do empregado: ");
		empregado1.setNome(input.nextLine());
		System.out.print("Informe o endereco: ");
		empregado1.setEndereco(input.nextLine());
		System.out.print("Informe o telefone: ");
		empregado1.setTelefone(input.nextLine());
		System.out.print("Informe o c�digo: ");
		empregado1.setCodigoSetor(input.nextInt());
		System.out.print("Informe o valor do sal�rio: ");
		empregado1.setSalarioBase(input.nextDouble());

		
		
		System.out.print("\n\tDados Gerais");
		System.out.print("\n--------------------------");
		System.out.print("\nNome: "+empregado1.getNome());
		System.out.print("\nC�digo do setor: "+empregado1.getCodigoSetor());
		System.out.print("\nEndere�o: "+empregado1.getEndereco());
		System.out.print("\nTelefone: "+empregado1.getTelefone());
		System.out.printf("\nSal�rio final: R$%.2f",empregado1.calcularSalario());
		System.out.print("\n--------------------------");

	}

}
