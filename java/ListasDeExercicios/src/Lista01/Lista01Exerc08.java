package Lista01;

import java.util.Scanner;

public class Lista01Exerc08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double valorCarro;
		double valorDistribuidor;
		double valorImposto;
		double valorConsumidor;

		System.out.print("Insara o valor de fabrica do veículo: ");
		valorCarro = leia.nextDouble();

		valorDistribuidor = (valorCarro * 0.28);
		valorImposto = (valorCarro * 0.45 );
		valorConsumidor = (valorCarro + valorImposto + valorDistribuidor);

		System.out.printf("O consumidor vai pegar no veículo: %.2f Reais",valorConsumidor);

	}

}
