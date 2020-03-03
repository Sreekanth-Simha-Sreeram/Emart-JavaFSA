package com.emart.hibernet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emart")
public class Emart {

	@Id
	@Column(name="productId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int productId;
	@Column(name="productPrice")
	double productPrice;
	
	@Column(name="productName")	
	String productName;
		
	@Column(name="productType")
    String productType;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}


}
