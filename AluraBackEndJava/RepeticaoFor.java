package AluraBackEndJava;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		double nota = 0;
		double media = 0;
		
		
		for(int i = 0; i < 3; i++) {
			
		System.out.println("Digite a nota.");
		nota = leitura.nextDouble();	
		media += nota;
		}
		System.out.println("Média : "+ media/3);
		leitura.close();
		
		

	}

}
