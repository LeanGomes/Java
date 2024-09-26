package AluraInterface;

public class ProdutoFisico implements Calculavel {

	@Override
	public void calcularPrecoFinal(double preco) {
		// TODO Auto-generated method stub
		double taxa = 0.1;
		double porcentagem = (preco * taxa)/100;
		double precoFinal = porcentagem + preco;
		System.out.println("Preço final com taxa de produto fisico é : " + precoFinal);
	}

}
