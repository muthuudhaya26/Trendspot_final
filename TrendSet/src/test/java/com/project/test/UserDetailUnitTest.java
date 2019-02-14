package com.project.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.dao.UserDetailDAO;
import com.project.model.UserDetail;

public class UserDetailUnitTest {
	static UserDetailDAO userdetailDAO;
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 context.scan("com.project");
	     context.refresh();
	     userdetailDAO=(UserDetailDAO)context.getBean("userdetailDAO");
	}    
   
	@Test
	public void addusertest() 
	{
		UserDetail user = new UserDetail();
		user.setCustomername("Punitha");
		user.setCustomerAddr("Chennai");
		user.setUsername("puni");
		user.setPassword("puni");
		user.setRole("ROLE_ADMIN");
		user.setEnabled(true);
		assertTrue("Problem in adding User Details",userdetailDAO.registerUser(user));
	}
	@Ignore
    @Test
    public void updateusertest()
    {
    	UserDetail user = userdetailDAO.getUser("srini");
    	user.setRole("ROLE_ADMIN");
		assertTrue("Problem in updating User Details",userdetailDAO.updateAddress(user));
	}
    @Test
    @Ignore
    public void viewusertest()
    {
    	UserDetail user = userdetailDAO.getUser("muthu");

    	System.out.println("Customer name           :"+user.getCustomername());
    	System.out.println("Customer Address        :"+user.getCustomerAddr());
    	System.out.println("Customer Role           :"+user.getRole());
    	System.out.println("Customer Account Status :"+user.isEnabled());
       
    }
}