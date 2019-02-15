package com.project.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.dao.CartDAO;
import com.project.model.Cart;

public class CartUnitTest 
{
	
	@Autowired
	static CartDAO cartDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.project");
		context.refresh();
		cartDAO=(CartDAO)context.getBean("cartDAO");
	}
	
	
	@Test
	public void addCartTest()
	{
		Cart cart=new Cart();
		cart.setProductId(34);
		cart.setProductName("White Casual");
		cart.setQuantity(1);
		cart.setPrice(700);
		cart.setPaymentStatuse("NO");
		cart.setUsername("srini");
		
		assertTrue("Problem in Adding Cart" , cartDAO.addCart(cart));
	}
	
	@Ignore
	@Test
	public void displayCart()
	{
		List<Cart> listCart=cartDAO.listCart("srini");
		assertTrue("Problem in Display the Cart" , listCart.size()>0);
		for(Cart cart:listCart)
		{
			System.out.print(cart.getProductID()+"\t");
			System.out.print(cart.getProductName()+"\t");
			System.out.print(cart.getPrice()+"\t");
			System.out.print(cart.getPrice()*cart.getQuantity());
		}
		
	}
	

}