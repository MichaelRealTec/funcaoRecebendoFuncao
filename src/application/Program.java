package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		// funcaoRecebendoFuncao
		/* Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços
		somente dos produtos cujo nome começa com "T". */
		
		Locale.setDefault(Locale.US);
		
		// Iniciar a lista
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		ProductService ps = new ProductService(); // Instanciando a classe ProductService
		
		double sum = ps.filteredSum(list); // Passando a lista de Produtos como argumento para a variável sum
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
	}

}
