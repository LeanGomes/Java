package AluraInterface;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

	@Override
	public void calcularArea(double altura, double largura) {
		// TODO Auto-generated method stub
		
		double area = altura * largura;
		System.out.println("Área do retândulo é: " + area);
		
	}

	@Override
	public void calcularPerimetro(double altura, double largura) {
		// TODO Auto-generated method stub
		double perimetro = 2 * (altura + largura);
		System.out.println("Perímetro do retândulo é: " + perimetro);
	}
	
//	Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e
//	calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. 
//	A classe deve receber altura e largura como parâmetros.

	
}
