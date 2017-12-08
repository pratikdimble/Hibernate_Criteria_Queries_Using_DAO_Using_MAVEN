package com.pratik.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class product {

	private int id;
    private String name;
    private float price;
    private int qty;
    
@Id
@Column(name="PRODID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
@Column(name="PRODNAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
@Column(name="PRICE")
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
@Column(name="QUANTITY")
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
    
    

}
