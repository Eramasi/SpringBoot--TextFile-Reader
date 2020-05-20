package com.app.TextFileReader.Beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.TextFileReader.Model.Product;

@Service
public class CSVReader {
	
	private IDataFilter idatafilter;
	
	public CSVReader(IDataFilter idatafilter)
	{
		this.idatafilter=idatafilter;
	}
	
	public List<Product> readAndFilterProductsData() throws Exception{
		List<Product> plist=new ArrayList<Product>();
		
	FileReader fr=new FileReader(new File("Product.txt"));
	
	BufferedReader br=new BufferedReader(fr);
	String lineData=br.readLine();
	
	while(lineData!=null)
	{
		String [] split=lineData.split(",");
		
		String pid=split[0];
		String pname=split[1];
		String pcost=split[2];
		
		Product p=new Product();
		p.setPid(Integer.parseInt(pid));
		p.setPname(pname);
		p.setPcost(Double.parseDouble(pcost));
		plist.add(p);
		
		
		lineData=br.readLine();
		}
	br.close();
	
	return idatafilter.filterProducts(plist);
	
	}

}
