package com.emart.hibernet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emart.hibernet.dao.SellerDao;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Seller;
import com.emart.hibernet.model.Stock;
import com.emart.hibernet.service.SellerService;
@Component
@Service ("sellerService")
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerDao sellerDao;
	
	@Transactional

	public List<Stock> viewSaleInventory(int sellerId) {
		// TODO Auto-generated method stub
		
		// Write your code here	
		
		return null;
	}
	@Transactional

	public void addStock(Product product, int sellerid,  Stock stock) {
		// TODO Auto-generated method stub
		
	}
	@Transactional

	public void createSeller(Seller seller) {
		// TODO Auto-generated method stub
		
	}
	@Transactional

	public List<Seller> viewAllSeller() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Transactional

	public void updateSeller(Seller seller, int sellerid) {
		// TODO Auto-generated method stub
		
	}
	@Transactional

	public boolean deleteSeller(int sellerid) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Transactional
	public Seller findSeller(int sellerid) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Product> viewProduct(int sellerid) {
		// TODO Auto-generated method stub
		return null;
	}

}
