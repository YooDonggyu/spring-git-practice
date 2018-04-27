package org.kosta.practice.model;

public class ShareVO {
	private String id;
	private String symbol;
	private int quantity;
	private int totalprice;
	public ShareVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShareVO(String id, String symbol, int quantity, int totalprice) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.totalprice = totalprice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "ShareVO [id=" + id + ", symbol=" + symbol + ", quantity=" + quantity + ", totalprice=" + totalprice
				+ "]";
	}
	
	
	
	
}
