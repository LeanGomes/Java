package AluraInterface;

public class TabuadaMultipplicacao implements Tabuada {

	@Override
	public void mostrarTabuada(int num) {
		
		int count = 0;
		
		for( int i = 0 ; i < 10 ; i++) {
			count++;
			int resultado = num * count;
			System.out.println(num + "x" + count + "=" + resultado);
		}
		
	}
	
//	Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() 
//	para exibir a tabuada de um número. 
//	A classe deve receber o número como parâmetro.

}
