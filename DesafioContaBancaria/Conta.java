package DesafioContaBancaria;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		//Dados do cliente
		
		String nome = "Leandro";
		String tipoConta = "Corrente";
		double saldo = 2000;
		int opcao = 0;
		
		System.out.println("***************************");
		System.out.println("Cliente:" + nome);
		System.out.println("Tipo de Conta:" + tipoConta);
		System.out.println("Seu saldo é: " + saldo);
		System.out.println("***************************");
		
		while(opcao != 4) {
			
			System.out.println("Escolha uma operação :");
			System.out.println("1 - Consultar Saldo | 2 - Receber valor | 3 - Tranferir valor | 4 - Sair :");
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
				System.out.println("Cliente:" + nome);
				System.out.println("Tipo de Conta:" + tipoConta);
				System.out.println("Seu saldo é: " + saldo);
			} else if (opcao == 2){
				
				System.out.println("Digite o valor a receber: ");
				double valorReceber = scanner.nextDouble();
				saldo += valorReceber;
				System.out.println("Saldo atualizado: " + saldo);
				
			} else if(opcao == 3) {
				System.out.println("Digite o valor a ser transferido.");
				double valorTransferido = scanner.nextDouble();
				saldo -= valorTransferido;
				System.out.println("Saldo atualizado: " + saldo);
			}else if (opcao == 4) {
				System.out.println("Operação encerrada!");
				break;
			} else {
				System.out.println("Opçaõ inválida!");
			}
			
			
		}
		scanner.close();

	}

}
