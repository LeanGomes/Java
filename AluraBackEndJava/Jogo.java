package AluraBackEndJava;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numeroAleatorio = new Random().nextInt(100); 
		int tentativas = 0;
		int numero = 0;
		
		while( tentativas < 5) {
			System.out.println("Digite um numero:");
			numero = scanner.nextInt();
			tentativas++;
			
			if(numero == numeroAleatorio) {
				 System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
				 break;
			}else if (numero < numeroAleatorio) {
				System.out.println("O numero aleatorio e maior.");
			} else {
				System.out.println("O número aleatorio e menor");
			}
		}
		if(tentativas == 5 && numero != numeroAleatorio){
			System.out.println("Você ultrapassou os numero de tentaivas.");
		scanner.close();
		}

	}

}
