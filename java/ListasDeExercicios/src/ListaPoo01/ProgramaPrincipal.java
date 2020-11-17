package ListaPoo01;

import java.util.Scanner;
import ListaPoo01.Cliente;
import ListaPoo01.Aviao;
import ListaPoo01.ProdutoEletronico;
import ListaPoo01.Funcionario;
import ListaPoo01.Patinete;
import ListaPoo01.ContaBancaria;
import ListaPoo01.Paciente;

public class ProgramaPrincipal {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Cliente cliente1 =  new Cliente("Guilherme Fidelis",  28,"999999999999", 'M');
		Aviao aviao1 = new Aviao("Boing", 747, 300, "Internacional");
		ProdutoEletronico produto1 = new ProdutoEletronico("Celular", "PWE500T", "Nokia", 2000.00);
		Funcionario funcionario1 = new Funcionario(2020230, "Beltranho Ciclano", "Assistente Técnico", "Diurno");
		Patinete patinete1 = new Patinete("Alumínio", "Caloi", 5, 300);
		ContaBancaria conta1 = new ContaBancaria("999999999999", "Mario Bros", "Conta Corrente", 0.01);
		Paciente paciente1 = new Paciente("Neymar", "Fisioterapia", 20, "Anti-inflamatórios");
		
		System.out.print("\tDados do Cliente");
		System.out.print("\n--------------------------------");
		System.out.print("\nNome: "+cliente1.nomeCompleto+("."));
		System.out.print("\nIdade: "+cliente1.idade+("."));
		System.out.print("\nCPF: "+cliente1.cpf+("."));
		System.out.print("\nGênero: "+cliente1.genero+("."));
		System.out.print("\n--------------------------------");
		
		System.out.print("\n\n\tDados do Avião");
		System.out.print("\n--------------------------------");
		System.out.print("\nTipo do avião: "+aviao1.tipo+("."));
		System.out.print("\nNumeração: "+aviao1.numeracao+("."));
		System.out.print("\nCapacidade: "+aviao1.capacidade+(" passageiros."));
		System.out.print("\nTipo de viagem: "+aviao1.tipoDeViagem+("."));
		System.out.print("\n--------------------------------");
		
		System.out.print("\n\n\tDados do Produto");
		System.out.print("\n--------------------------------");
		System.out.print("\nProduto: "+produto1.aparelho+("."));
		System.out.print("\nModelo: "+produto1.modelo+("."));
		System.out.print("\nFabricante: "+produto1.fabricante+("."));
		System.out.print("\nValor de Compra: R$"+produto1.valor+("."));
		System.out.print("\n--------------------------------");
		
		System.out.print("\n\n      Dados do Funcionário");
		System.out.print("\n--------------------------------");
		System.out.print("\nCódigo: "+funcionario1.codigo+("."));
		System.out.print("\nNome: "+funcionario1.nomeCompleto+("."));
		System.out.print("\nCargo: "+funcionario1.cargo+("."));
		System.out.print("\nPeríodo de trabalho: "+funcionario1.periodoTrabalho+("."));
		System.out.print("\n--------------------------------");
		
		System.out.print("\n\n\tDados do Patinte");
		System.out.print("\n--------------------------------");
		System.out.print("\nMaterial: "+patinete1.material+("."));
		System.out.print("\nFabricante: "+patinete1.fabricante+("."));
		System.out.print("\nPara crianças maiores de: "+patinete1.idadeMinima+(" Anos."));
		System.out.print("\nValor de Compra: R$"+patinete1.valor+("."));
		System.out.print("\n--------------------------------");
		
		System.out.print("\n\n\tDados Conta Bancaria");
		System.out.print("\n--------------------------------");
		System.out.print("\nCPF: "+conta1.cpf+("."));
		System.out.print("\nCliente: "+conta1.nomeCliente+("."));
		System.out.print("\nTipo de conta: "+conta1.tipoConta+("."));
		System.out.print("\nSaldo: R$"+conta1.saldo+("."));
		System.out.print("\n--------------------------------");
		
		System.out.print("\n\n\tDados Conta Bancaria");
		System.out.print("\n--------------------------------");
		System.out.print("\nCPF: "+conta1.cpf+("."));
		System.out.print("\nCliente: "+conta1.nomeCliente+("."));
		System.out.print("\nTipo de conta: "+conta1.tipoConta+("."));
		System.out.print("\nSaldo: R$"+conta1.saldo+("."));
		System.out.print("\n--------------------------------");
		
		System.out.print("\n\n\tDados do Paciente");
		System.out.print("\n--------------------------------");
		System.out.print("\nNome: "+paciente1.nome+("."));
		System.out.print("\nTipo de tratamento: "+paciente1.tipoTratamento+("."));
		System.out.print("\nTempo de tratamento: "+paciente1.duracaDias+(" dias."));
		System.out.print("\nMedicação: "+paciente1.medicacao+("."));
		System.out.print("\n--------------------------------");
	

	}

}
