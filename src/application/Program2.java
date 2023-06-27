package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Map<Product, Double> stock = new HashMap<>();
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);

		stock.put(p1, 10000.00);
		stock.put(p2, 20000.00);
		stock.put(p3, 30000.00);

		Product ps = new Product("Tv", 900.00);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
