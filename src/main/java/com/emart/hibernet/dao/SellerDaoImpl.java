package com.emart.hibernet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Seller;
import com.emart.hibernet.model.Stock;
@Component
public class SellerDaoImpl implements SellerDao {
	
	@Autowired
	private SessionFactory sessionFactory ;

	public void createSeller(Seller seller) {
		// TODO Auto-generated method stub

	}

	public List<Seller> viewAllSeller() {
		// TODO Auto-generated method stub
		return null;
	}

	public Seller findSeller(int sellerid) {
		// TODO Auto-generated method stub
		return null;

	}

	public void updateSeller(Seller seller, int sellerid) {
		// TODO Auto-generated method stub

	}

	public boolean deleteSeller(int sellerid) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addStock(Product product, int sellerid,  Stock stock) {
		// TODO Auto-generated method stub

	}

	public List<Stock> viewSaleInventory(int sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> viewProduct(int sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

}
