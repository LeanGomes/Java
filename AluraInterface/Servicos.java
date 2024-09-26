package AluraInterface;

public class Servicos implements Vendavel {

	@Override
	public void calcularPrecoTotal(double preco, double quantidade) {
		// TODO Auto-generated method stub
		double precoFinal = preco * quantidade;
		
		if(quantidade >= 5) {
			
			double desconto = (precoFinal * 0.5) / 100;
			precoFinal = precoFinal - desconto;
			System.out.println("Preco Final do Serviço com desconto: " + precoFinal);
		}else {
			System.out.println("Preco Final do Serviço: " + precoFinal);
		}
	}

}
