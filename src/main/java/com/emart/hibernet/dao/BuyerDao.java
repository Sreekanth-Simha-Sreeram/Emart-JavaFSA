package com.emart.hibernet.dao;

import java.util.List;

import com.emart.hibernet.model.Buyer;
import com.emart.hibernet.model.Product;

public interface BuyerDao {
	public void createBuyer(Buyer buyer);
	public List<Buyer> listBuyer();
	public void updateBuyer(Buyer buyer, int buyerId);
	public void deleteBuyer( int buyerId);
	public Buyer findBuyer(int buyerId);
	public List<Product> searchProducts(String productName,String productCategory,String productSubcategory);
	public boolean addToCart(List<Product>product,int buyerId);
	public void deleteFromCart(int productid, int buyerid);
	public  List<Product> viewCart(int buyerId);
	public void placeOrder(List<Product>product,int buyerId);






}
