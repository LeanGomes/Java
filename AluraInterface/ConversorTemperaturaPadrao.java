package AluraInterface;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

	@Override
	public void celsiusParaFahrenheit(double c) {
		// TODO Auto-generated method stub
		double fahrenheit = (c * 9/5) + 32;
		
		System.out.println("Temperatura em fahrenheit " + fahrenheit);
		
	}

	@Override
	public void fahrenheitParaCelsius(double f) {
		// TODO Auto-generated method stub
		double celsius = (f - 32)*(5 / 9);
		
		System.out.println("Temperatura em Celsius " + celsius);
		
	}

}
