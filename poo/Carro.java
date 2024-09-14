package poo;

public class Carro extends veiculo {
	
	public void ligar() {
		confereCombustivel();//está private, confere antes de ligar
		System.out.println("Carro Ligado!");
	}
	private void confereCombustivel() {
		//encapsulando
		System.out.println("Confere Gás!");
}
	
}