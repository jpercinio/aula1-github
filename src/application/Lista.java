package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>(); //instancia��o da interface List
				//ArrayList � uma classe q implementa a interface List
		
		//adicionando elementos na Lista:
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//impress�o da lista com for each
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		//inserir um elemento em determinada posi��o (ex. posi��o 2)
		list.add(2, "Marco");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		//verificando o tamanho da lista
		System.out.println(list.size());		
		
		System.out.println("---------------------------");
		//Removendo um elemento da Lista, p.e. "Anna"
		list.remove("Anna");
		for(String x : list) {
			System.out.println(x);
		}
		
		//removendo pelo �ndice, p.e., posi��o 1
		System.out.println("---------------------------");
		list.remove(1);
		for(String x : list) {
			System.out.println(x);
		}
		
		//remover os elementos que atendam a um predicado, p.e, todos
		//que come�em com a letra "M"
		System.out.println("---------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //observar a necessidade de aspas simples
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		list.add(0, "Alex");
		list.add(2,"Anna");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		//encontrando a posi��o de um elemento, p.e., 
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		//quando n�o exite o elemento na lista a busca resulta -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------------");
		//deixar na lista somente os nomes come�ados com "A"
		//primeiro declarar uma lista q conter� o resultado do filtro
		//utilizar stream() que aceita express�es lambdas
		List<String> result = list.stream()
				.filter(x -> x.charAt(0) == 'A')
				.collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		//encontrando um elemento da lista que adenda a um determinado predicado
		String name = list.stream()
				.filter(x -> x.charAt(0) == 'A')
				.findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("---------------------------");
		//n�o encontrado retorna null
		String name2 = list.stream()
				.filter(x -> x.charAt(0) == 'J')
				.findFirst().orElse(null);
		System.out.println(name2);
		
		
	}

}
