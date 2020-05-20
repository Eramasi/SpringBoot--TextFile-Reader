package com.app.TextFileReader.Beans;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.app.TextFileReader.Model.Product;
@Service
public class DataFilterImpl implements IDataFilter {

	@Override
	public List<Product> filterProducts(List<Product> productsList) {
		
		return productsList.stream()
			                .filter(p->p.getPcost()>=5000)
			                .collect(Collectors.toList());
	}

}
