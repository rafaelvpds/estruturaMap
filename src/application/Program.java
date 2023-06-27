package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// keys, values
		Map<String, String> cookies = new TreeMap<>();
		// Inserir um elemento no Map

		cookies.put("Username", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("Phone", "99711122");
		// removendo uma chave:

		cookies.remove("Email");
		// ele vai sobrescrever esse fone no lugar do primeiro
		cookies.put("Phone", "99711123");
		// verificando se contem um valor de chave
		System.out.println("Contains 'Phone' key: " + cookies.containsKey("Phone"));
		// verificando se contem valor de uma chave
		System.out.println("Contains 'Phone' Values: " + cookies.get("Phone"));
		// tentando pegar um valor que nao existte
		System.out.println("Email " + cookies.get("Email"));
		System.out.println();
		// tamanho da lista

		System.out.println("Tamanho da lista: " + cookies.size());

		// pegando todos os cookies
		System.out.println("All Cookies");
		// para cada String Keys, para o meu conjunto de chave
		for (String key : cookies.keySet()) {
			System.out.println(key.toUpperCase() + ": " + cookies.get(key));
		}
	}

}
