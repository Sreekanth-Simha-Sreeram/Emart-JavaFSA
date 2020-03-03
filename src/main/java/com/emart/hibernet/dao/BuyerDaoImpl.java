package com.emart.hibernet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.emart.hibernet.model.Buyer;
import com.emart.hibernet.model.Product;
@Component
@Repository ("buyerDAO")
public class BuyerDaoImpl implements BuyerDao {
	@Autowired
	private SessionFactory sessionFactory;


	public void createBuyer(Buyer buyer) {
		// TODO Auto-generated method stub

	}

	public List<Buyer> listBuyer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateBuyer(Buyer buyer, int buyerId) {
		// TODO Auto-generated method stub

	}

	public void deleteBuyer(int buyerId) {
		// TODO Auto-generated method stub

	}
	
	public Buyer findBuyer(int buyerId) {
		// TODO Auto-generated method stub
		return null;		

		
	}

	public List<Product> searchProducts(String productName, String productCategory, String productSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addToCart(List<Product> product, int buyerId) {
		// TODO Auto-generated method stub
		return true;
	}

	public void deleteFromCart(int productid, int buyerid) {
		// TODO Auto-generated method stub
		
	}

	public void viewCart(List<Product> product, int buyerId) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> placeOrder(  int buyerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> viewCart(int buyerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void placeOrder(List<Product> product, int buyerId) {
		// TODO Auto-generated method stub
		
	}

	
}
