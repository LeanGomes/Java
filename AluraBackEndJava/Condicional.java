package AluraBackEndJava;

public class Condicional {

	public static void main(String[] args) {
		double data = 1985;
		String nome = "luiza";
		Boolean plano = false;
		
		if(data == 2020) {
			System.out.println("Entrou!!!!");
		} else {
			System.out.println("Erro!!!");
		}
		
		if(plano == true || nome.equals("ana")) {
			System.out.println("Está liberado!!!");
		} else {
			System.out.println("Entrada Negada!");
		}
		
		
	}
	
	

}
