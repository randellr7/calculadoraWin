package teste;

import java.util.Scanner;

public class CalculadoraWin {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double[] x = new double[1000];
		double[] y = new double[1000];
		double resultado = 0;
		String operacao = null;

		int i = 0;
		System.out.println("Digite o numero: ");
		resultado = teclado.nextDouble();
		System.out.println("Escolha a operacao: (+ , - , * , / , =)");
		operacao = teclado.next();
		while (!operacao.equals("=")) {

			switch (operacao) {
			case "+":
				System.out.println("Digite o numero: ");
				x[i] = teclado.nextDouble();

				resultado = resultado + x[i];
				i++;
				break;
			case "-":
				System.out.println("Digite o numero: ");
				x[i] = teclado.nextDouble();

				resultado = resultado - x[i];
				i++;
				break;
			case "*":
				System.out.println("Digite o numero: ");
				x[i] = teclado.nextDouble();

				resultado = resultado * x[i];
				i++;
				break;
			case "/":
				System.out.println("Digite o numero: ");
				x[i] = teclado.nextDouble();

				resultado = resultado / x[i];
				i++;
				break;
			default:
				System.out.println("Digite um caractere valido!");
				break;
			}

			System.out.println("Resultado Total: " + resultado);

			System.out.println("Escolha a operacao: (+ , - , * , / , =)");
			operacao = teclado.next();

		}
		System.out.println("resultado a cada ciclo: " + resultado);

	}

}
