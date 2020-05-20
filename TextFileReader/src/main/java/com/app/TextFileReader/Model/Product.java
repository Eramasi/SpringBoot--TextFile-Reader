package com.app.TextFileReader.Model;

public class Product {
	
	private int pid;
	private String pname;
	private Double pcost;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPcost() {
		return pcost;
	}
	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	
	

}
