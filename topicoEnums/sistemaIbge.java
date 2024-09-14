package topicoEnums;

public class sistemaIbge {

	public static void main(String[] args) {
		for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
			
			System.out.println(e.getSigla() + "-" + e.getNome());
			
		}
		EstadosBrasileiros eb = EstadosBrasileiros.PIAUI;
		System.out.println(eb.getNome());
		
	}

}
