package AluraOrdenando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(6);
		numeros.add(7);
		numeros.add(5);
		numeros.add(4);
		numeros.add(2);
		
		Collections.sort(numeros);
		System.out.println(numeros);
		
		System.out.println("##################");
		
		ArrayList<String> listaTitulos = new ArrayList<>();
		
		listaTitulos.add("O");
		listaTitulos.add("A");
		listaTitulos.add("B");
		
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);
        
        System.out.println("##################");
        
        List<String> listaArrayList = new ArrayList<>();
        
        listaArrayList.add("Array 1");
        listaArrayList.add("Array 2");
        listaArrayList.add("Array 3");
        
        List<String> listaLinkedList = new LinkedList<>();
        
        listaLinkedList.add("Linked 1");
        listaLinkedList.add("Linked 2");
        listaLinkedList.add("Linked 3");
        
        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);
        
        System.out.println("##################");
        
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
        


	}

}







