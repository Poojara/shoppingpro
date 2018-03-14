package com.shoppingprobackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoppingprobackend.modal.Product;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestProductDAO {
	static AnnotationConfigApplicationContext context;
	static Product product;
	@BeforeClass
	public static void setup(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		product=new Product();
		product.setName("Test");
	}
	@Test
	public void testInsertOrUpdateProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProduct() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllProducts() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProductsByCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteProduct() {
		fail("Not yet implemented");
	}

}
