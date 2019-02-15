package com.project.dao;

import com.project.model.Invoice;

public interface InvoiceDAO 
{
	public boolean saveOrder(Invoice invoice);
	public boolean updateCart(String username);

}