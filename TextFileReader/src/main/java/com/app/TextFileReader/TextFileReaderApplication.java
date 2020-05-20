package com.app.TextFileReader;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.TextFileReader.Beans.CSVReader;
import com.app.TextFileReader.Model.Product;

@SpringBootApplication
public class TextFileReaderApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctxt=SpringApplication.run(TextFileReaderApplication.class, args);
		CSVReader csvreader=ctxt.getBean(CSVReader.class);
		List<Product>  filterProducts =csvreader.readAndFilterProductsData();
		filterProducts.forEach(System.out::println);
		
	}

}
