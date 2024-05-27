package entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double calculator(double compraDolar, double valorDolar) {
		double aux = compraDolar * valorDolar * IOF;
		return compraDolar * valorDolar + aux;		
	}
	
}
