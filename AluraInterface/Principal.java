package AluraInterface;

public class Principal {
	
	 public static void main(String[] args) {
		 
		 
	  ConversorMoeda conversor = new ConversorMoeda();
	  conversor.converterDolarParaReal(5); 
	  
	  System.out.println("#######################");
	  
	  CalculadoraSalaRetangular x = new CalculadoraSalaRetangular();
	  
	  x.calcularArea(5, 10);
	  x.calcularPerimetro(5, 10);
	  
	  System.out.println("##################");
	  
	  TabuadaMultipplicacao t = new TabuadaMultipplicacao();
	  
	  t.mostrarTabuada(5);
	  
	  System.out.println("##################");
	  
	  ConversorTemperaturaPadrao y = new ConversorTemperaturaPadrao();
	  
	  y.celsiusParaFahrenheit(32);
	  y.fahrenheitParaCelsius(32);
	  
	  System.out.println("##################");
	  
	  Livro livro = new Livro();
	  ProdutoFisico produto = new ProdutoFisico();
	  
	  livro.calcularPrecoFinal(50.0);
	  produto.calcularPrecoFinal(50.0);
	  
	  System.out.println("##################");
	  
	  Produtos p = new Produtos();
	  p.calcularPrecoTotal(50.0, 5);
	  
	  Servicos s = new Servicos();
	  s.calcularPrecoTotal(50.0, 5);

}
}




