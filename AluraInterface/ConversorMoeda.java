package AluraInterface;

public class ConversorMoeda implements ConversaoFinanceira {


	@Override
	public void converterDolarParaReal(double valor) {
		
		double dolar = 5.80;
		double valorReal = dolar * valor;
		
		System.out.println("O valor em Reais é: R$ -  " + valorReal);
	}

}
