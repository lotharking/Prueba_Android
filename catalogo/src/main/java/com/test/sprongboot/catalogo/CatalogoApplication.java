package com.test.sprongboot.catalogo;

import java.util.stream.Stream;

import com.test.sprongboot.catalogo.entity.Product;
import com.test.sprongboot.catalogo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogoApplication {
	
	@Autowired
	private static ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CatalogoApplication.class, args);
		
		// String[][] data = {
		// 	{"cartera", "5000", "100"},
		// 	{"tijeras", "50000", "50"},
		// 	{"Papel", "20000", "20"},
		// 	{"Locion", "30000", "100"},
		// 	{"Cartas", "25000", "75"}
		//   };
	  
		//   // JSONArray json;
		  
		//   // Create data
		//   Stream.of(data).forEach(array -> {
		// 		  Product product = new Product(
		// 			array[0],
		// 			Integer.valueOf(array[1]),
		// 			Integer.valueOf(array[2])
		// 		  );
		// 		  repository.save(product);
		// 		});
	}

}
