package com.project.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Product 
{

 @Id
 @GeneratedValue
  int productID;
  String productName;
  String ProductDesc;
  int Price;
  int Stock;
  int categoryID;
  int supplierID;
  
  @Transient
	MultipartFile pimage;
public int getProductID() {
	return productID;
}
public void setProductID(int productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDesc() {
	return ProductDesc;
}
public void setProductDesc(String productDesc) {
	ProductDesc = productDesc;
}
public int getPrice() {
	return Price;
}
public MultipartFile getPimage() {
	return pimage;
}
public void setPimage(MultipartFile pimage) {
	this.pimage = pimage;
}
public void setPrice(int price) {
	Price = price;
}
public int getStock() {
	return Stock;
}
public void setStock(int stock) {
	Stock = stock;
}
public int getCategoryID() {
	return categoryID;
}
public void setCategoryID(int categoryID) {
	this.categoryID = categoryID;
}
public int getSupplierID() {
	return supplierID;
}
public void setSupplierID(int supplierID) {
	this.supplierID = supplierID;
}
  
 

}