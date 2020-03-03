package com.emart.hibernet.service;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Buyer;
import java.util.List;
import java.util.ArrayList;
public interface BuyerService
{
		public void createBuyer(Buyer buyer);
		public List<Product> searchProducts(String productName,String productCategory,String productSubcategory);
		
		public boolean addToCart(List<Product>product,int buyerId);
		
		
		public boolean deleteFromCart(List<Product>product, int buyerid);
		
		public List<Product> viewCart(int buyerId);
		
		public boolean placeOrder(List<Product>product,int buyerid);
		
		public Buyer findBuyer(int buyerId);
		
}
