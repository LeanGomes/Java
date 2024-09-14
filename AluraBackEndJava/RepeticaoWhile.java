package AluraBackEndJava;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		double nota = 0;
		double media = 0;
		int totalDeNotas = 0;
		
		
		while(nota != -1) {
			
		System.out.println("Digite a nota.(-1 para encerrar aplicação!)");
		nota = leitura.nextDouble();
		
		if(nota != -1) {
		media += nota;
		totalDeNotas++;
		} else {
			System.out.println("Aplicação encerrada!");
		}
		
	}
		System.out.println("Média : "+ media/totalDeNotas);
		leitura.close();

}
}
