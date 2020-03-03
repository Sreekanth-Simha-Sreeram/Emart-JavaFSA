package com.emart.hibernet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller")
public class Seller {
	
	@Id
	@Column(name="sellerId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sellerId;

	@Column(name="sellerName")
	String sellerName;
	
	@Column(name="sellerAddress")
	String sellerAddress;
	
	@Column(name="sellerEmail")
	String sellerEmail;
	
	@Column(name="sellerPassword")
	String sellerPassword;
	
	@Column(name="sellerGST")
	String sellerGST;
	
	@Column(name="sellerContact")
	String sellerContact;
	
	
	
	public String getSellerAddress() {
		return sellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerPassword() {
		return sellerPassword;
	}
	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}
	public String getSellerGST() {
		return sellerGST;
	}
	public void setSellerGST(String sellerGST) {
		this.sellerGST = sellerGST;
	}
	public String getSellerContact() {
		return sellerContact;
	}
	public void setSellerContact(String sellerContact) {
		this.sellerContact = sellerContact;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	

}
