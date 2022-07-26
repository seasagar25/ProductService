/**
 * 
 */
package com.shopping.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sagar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_TBL")
public class Product {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	
	private int quantity;
	
	private double price;
}
