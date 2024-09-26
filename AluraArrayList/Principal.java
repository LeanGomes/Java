package AluraArrayList;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var pessoa1 = new Pessoa("Lisa", 27);
		var pessoa2 = new Pessoa("Irene", 33);
		var pessoa3 = new Pessoa("Li Sue", 25);
		
		ArrayList<Pessoa> listaPessoas =  new ArrayList<>();
		
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		System.out.println(listaPessoas);
		System.out.println("Tamanho da lista: " + listaPessoas.size());
		System.out.println("Primeira Pessoa: " + listaPessoas.get(0));
		
		System.out.println("Lista de Pessoas:");
		for (Pessoa pessoa : listaPessoas) {
		    System.out.println(pessoa);
		}
		
		
		

	}

}
