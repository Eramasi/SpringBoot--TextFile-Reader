package com.app.TextFileReader.Beans;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.TextFileReader.Model.Product;

@Service
public interface IDataFilter {
	public List<Product> filterProducts(List<Product> productsList);

}
