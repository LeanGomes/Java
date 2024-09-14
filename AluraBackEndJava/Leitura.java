package AluraBackEndJava;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu time de futebol.");
		String time = leitura.nextLine();
		System.out.println(time);
		System.out.println("Digite quantas libertadores seu time ganhou.");
		int libertadores = leitura.nextInt();
		System.out.println(libertadores);
		leitura.close();
		
		
	}
	
}
