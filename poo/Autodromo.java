package poo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		//jeep.confereCombustivel();
		jeep.ligar();
		jeep.setPlaca("87458");
		
		Moto bis = new Moto();
		bis.setPlaca("52458");
		bis.ligar();
	}
}
