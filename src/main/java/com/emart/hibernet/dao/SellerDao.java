package com.emart.hibernet.dao;

import java.util.List;

import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Seller;
import com.emart.hibernet.model.Stock;

public interface SellerDao {
	
	public void createSeller(Seller seller);
	public List<Seller> viewAllSeller();
	public Seller findSeller(int sellerid);
	public void updateSeller(Seller seller, int sellerid);
	public boolean deleteSeller(int sellerid);
	public void addStock(Product product,int sellerid , Stock stock);
	public List<Product> viewProduct(int sellerid);
	public List<Stock> viewSaleInventory(int sellerId);

}
