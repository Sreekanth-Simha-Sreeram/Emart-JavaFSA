package com.emart.test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emart.hibernet.model.Buyer;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Seller;
import com.emart.hibernet.service.SellerService;

public class TestBoundary {
	/*GST number length must equal to 15*/
	@Test
	public void testGSTLength() {
		Seller seller = new Seller();
		seller.setSellerName("ABC Retails Pvt Ltd");
		seller.setSellerEmail("buyer@gmail.com");
		seller.setSellerPassword("pass123");
		seller.setSellerContact("9900880099");
		seller.setSellerAddress("No 12 6th main Bangalore 560001");
		seller.setSellerGST("29ABCDE1234F2Z5");
		seller.setSellerId(112);
		int gstLenght = 15;
		Assert.assertEquals(gstLenght, seller.getSellerGST().length());	
	}

	@Test
	public void testSellerContactNumberLength() {
		Seller seller = new Seller();
		seller.setSellerName("ABC Retails Pvt Ltd");
		seller.setSellerEmail("buyer@gmail.com");
		seller.setSellerPassword("pass123");
		seller.setSellerContact("9900880099");
		seller.setSellerAddress("No 12 6th main Bangalore 560001");
		seller.setSellerGST("29ABCDE1234F2Z5");
		seller.setSellerId(112);
		int contactnumLenght = 10;
		Assert.assertEquals(contactnumLenght, seller.getSellerContact().length());	
	}
	
	@Test
	public void testBuyerContactNumberLength() {
		Buyer buyer = new Buyer();
		buyer.setBuyerName("Chandan");
		buyer.setBuyerEmail("buyer@gmail.com");
		buyer.setBuyerPassword("pass123");
		buyer.setBuyerPhone("9900880099");
		int contactnumLenght = 10;
		Assert.assertEquals(contactnumLenght, buyer.getBuyerPhone().length());	
	}
	
	@Test
	public void testPasswordLength() {
		Seller seller = new Seller();
		seller.setSellerName("ABC Retails Pvt Ltd");
		seller.setSellerEmail("buyer@gmail.com");
		seller.setSellerPassword("pass123");
		seller.setSellerContact("9900880099");
		seller.setSellerAddress("No 12 6th main Bangalore 560001");
		seller.setSellerGST("29ABCDE1234F2Z5");
		seller.setSellerId(112);
		int passwordlength = seller.getSellerPassword().length();
		int less = 6;
		int high = 25;
		assertTrue("Error, password is too low", less >= passwordlength);
		assertTrue("Error, password is too high",passwordlength >= high );
	}
	

	@Test
	public void testSellerEmailPattern() {
		Seller seller = new Seller();
		seller.setSellerName("ABC Retails Pvt Ltd");
		seller.setSellerEmail("buyer@gmail.com");
		seller.setSellerPassword("pass123");
		seller.setSellerContact("9900880099");
		seller.setSellerAddress("No 12 6th main Bangalore 560001");
		seller.setSellerGST("29ABCDE1234F2Z5");
		seller.setSellerId(112);
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	            "[a-zA-Z0-9_+&*-]+)*@" + 
	            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	            "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex); 
		assertTrue("Email should match this pattern", pat.matcher(seller.getSellerEmail()).matches());
		
	}
	
	@Test
	public void testBuyerEmailPattern() {
		Buyer buyer = new Buyer();
		buyer.setBuyerName("Buyer");
		buyer.setBuyerEmail("buyer@gmail.com");
		buyer.setBuyerPassword("pass123");
		buyer.setBuyerPhone("6362805979");
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	            "[a-zA-Z0-9_+&*-]+)*@" + 
	            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	            "A-Z]{2,7}$";
		 Pattern pat = Pattern.compile(emailRegex); 
		assertTrue("Email should match this pattern", pat.matcher(buyer.getBuyerEmail()).matches());
	}
	
	@Test
	public void testProductPriceRange() {
		Product product = new Product();
		product.setProductId(111);
		product.setProductName("HP Pavillion");
		product.setProductPrice(35000);
		product.setProductType("Electronics");
		product.setCategory("Laptops");
		product.setSubcategory("HP");
		int productPrice = product.getProductPrice();
		int less = -1;
		int high = Integer.MAX_VALUE;
		assertTrue("Error, productPrice must not be negative", less >= productPrice);
		assertTrue("Error, productPrice is too big",productPrice > high );
		
	}
	
	
}
