package com.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Invoice 
{
	@Id
	@GeneratedValue
	int orderId;
	

	String username;
	Date orderDate;
	int TotalAmount;
	String ShippingAddress;
	String paymentType;
	@ManyToOne
    @JoinColumn(name = "cartId")
	Cart c;
	
	public Cart getC() {
		return c;
	}

	public void setC(Cart c) {
		this.c = c;
	}

	public int getOrderId() 
	{
		return orderId;
	}
	
	public void setOrderId(int orderId) 
	{
		this.orderId = orderId;
	}
	
	
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public Date getOrderDate() 
	{
		return orderDate;
	}
	
	public void setOrderDate(Date orderDate) 
	{
		this.orderDate = orderDate;
	}
	public int getTotalAmount() 
	{
		return TotalAmount;
	}
	
	public void setTotalAmount(int totalAmount) 
	{
		TotalAmount = totalAmount;
	}
	
	public String getShippingAddress() 
	{
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) 
	{
		ShippingAddress = shippingAddress;
	}
	
	public String getPaymentType() 
	{
		return paymentType;
	}
	
	public void setPaymentType(String paymentType) 
	{
		this.paymentType = paymentType;
	}
	
	
}