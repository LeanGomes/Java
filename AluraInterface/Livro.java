package AluraInterface;

public class Livro implements Calculavel{

	@Override
	public void calcularPrecoFinal(double preco) {
		// TODO Auto-generated method stub
		
		double desconto = 0.1;
		double porcentagem = (preco * desconto)/100;
		double precoFinal = preco - porcentagem;
		System.out.println("Preço final é : " + precoFinal);
		
		
	}

}
