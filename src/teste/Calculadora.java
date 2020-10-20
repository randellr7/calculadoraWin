package teste;

import java.util.Scanner;

public class Calculadora {
	
	Scanner teclado = new Scanner(System.in);
	
	
	public double num1;
	public double num2;
	public double res;
	// public double num;

	// construtor da classe Calculadora
	public Calculadora() {
		this.res = 0.0;
	}

	// metodo da Soma() da classe Calculadora
	public double Soma() {
		System.out.println("Digite o primeiro numero: ");
		num1 = teclado.nextDouble(); 
		System.out.println("Digite o segundo numero: ");
		num2 = teclado.nextDouble(); 
		
		res = num1 + num2;
		return res;
	}
	
	public double Subtrair(double num) {
		res = num - res;
		return res;
	}
	
	public double Mutiplicar(double num) {
		res = num * res;
		return res;
	}
	
	public double Dividir(double num) {
		res = num / res;
		return res;
	}
	
	
	
	
	
	
	
	
	
}
