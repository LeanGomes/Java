package AluraBackEndJava;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que realize a média de duas notas decimais e exiba o resultado.
		
		double n1 = 8.0;
		double n2 = 5.0;
		
		double media =  (n1 + n2) / 2;
		String msg = String.format("A média entre %f e %f é %f",n1 , n2, media);
		System.out.println(msg);
		
		
//		Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
		
		double n3 = 3.5;
		int n4 = (int) n3;
		System.out.println(n4);
		
		
//		Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
		
		char letra = 'A';
		String palavra = "zul";
		System.out.println(letra + palavra);
			
				
//		Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). 
//		Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
		
		double precoProduto = 10.5;
		int quantidade = 5;
		
		double resultado = precoProduto * quantidade;
		System.out.println(resultado);
				
				
//		Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
//		Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
		
		double valorEmDolares = 5.0;
		double valorEmReais = 4.94;
		
		double valor = valorEmDolares * valorEmReais;
		System.out.println("O valor em reais de " + valorEmDolares + " é " + valor);
		
		
//		Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. 
//		Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). 
//		Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
		
		
		double precoOriginal = 100.50;
		double percentualDesconto = 10.0;
		double desconto = (percentualDesconto/100) * precoOriginal;
		System.out.println("Preço Original: " + precoOriginal + " Desconto: " + percentualDesconto + " Valor: " + desconto);
		
		
		

	}

}
