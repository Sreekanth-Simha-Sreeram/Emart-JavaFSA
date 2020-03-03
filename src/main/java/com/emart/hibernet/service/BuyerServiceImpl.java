
package com.emart.hibernet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emart.hibernet.dao.BuyerDao;
import com.emart.hibernet.model.Buyer;
import com.emart.hibernet.model.Product;
@Component
@Service ("buyerService")
public class BuyerServiceImpl implements BuyerService {
	@Autowired
	BuyerDao buyerDao;
	@Transactional
	public void createBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
		

	}
	@Transactional
	public List<Product> searchProducts(String productName, String productCategory, String productSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean addToCart(List<Product> product, int buyerId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public List<Product> filterProducts(String productName, int price, String productCategory,
			String productSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean deleteFromCart(List<Product> product, int buyerid) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public List<Product>  viewCart(int buyerId) {
		// TODO Auto-generated method stub
		return null;

	}
	@Transactional
	public boolean placeOrder(List<Product> product, int buyerid) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Buyer findBuyer(int buyerId) {
		return null;
	}


}
