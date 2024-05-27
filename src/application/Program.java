package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dólar: ");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Quantos dólares deseja comprar: ");
		double compraDolar = sc.nextDouble();
		
		double valorReal = CurrencyConverter.calculator(compraDolar, valorDolar);
		
		System.out.printf("Você vai pagar em reais = %.2f\n", valorReal);		
		
		
		sc.close();
	}

}
