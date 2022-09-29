package com.crud.example.entity;

import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product   {

    @Id
   @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
	public Integer getId() {
		// TODO Auto-generated method stub

		return id;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}
	public   double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}
	public void setQuantity(int quantity) {

		// TODO Auto-generated method stub
		this.quantity= quantity;
	}
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price=price;

	}


}
