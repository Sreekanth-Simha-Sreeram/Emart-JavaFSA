package com.emart.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emart.hibernate.common.AssignmentException;
import com.emart.hibernet.model.Buyer;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Seller;
import com.emart.hibernet.service.BuyerService;
import com.emart.hibernet.service.SellerService;

public class TestException {

	@Test
	public void testEmptyBuyerList() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		BuyerService buyerservice = (BuyerService) context.getBean("buyerService");
		Buyer buyer = buyerservice.findBuyer(111);
		Assert.assertNotNull(buyer);
		
	}
	@Test
	public void testBuyerCartWithoutItem() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		BuyerService buyerservice = (BuyerService) context.getBean("buyerService");
		List <Product> product = new ArrayList<Product>();
		product = buyerservice.viewCart(111);
		Assert.assertNotNull(product);
		
	}
	
	@Test
	public void testListEmptySeller() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		SellerService sellerservice= (SellerService) context.getBean("sellerService");
		List <Seller> sellerlist = new ArrayList<Seller>();
		sellerlist = sellerservice.viewAllSeller();
		Assert.assertNotNull(sellerlist);
		
	}
	/*Seller who has done transaction on the e-mart should not get deleted*/
	@Test
	public void testSellerDelete() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		SellerService sellerservice= (SellerService) context.getBean("sellerService");
		boolean result = false;
		if(!sellerservice.deleteSeller(111))
			result = true;
		Assert.assertEquals(true, result);
		
		
	}

}
