package com.techm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.model.Product;

@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/product")
	public String welcome() 
	{
		return "welcome to springboot restfull webservice";
	}
	
	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product)
	{
		return product;
	}
	
	@GetMapping("/product/{prod_id}/{price}")
	public Product getProductByIdAndPrice(@PathVariable("prod_id") Integer x,@PathVariable("price") Integer y)	
	{
		return new Product(x,y);
	}
	
	@PutMapping("/product/{prod_id}")
	public Product updateProductById(@RequestBody Product product, @PathVariable("price") Integer x)
	{
		
		return new Product(x, product.getPrice());
	}
	
	@DeleteMapping("/product/{prod_id}")
	public String deleteProductById(@PathVariable("prod_id") Integer x)
	{
		return x + "th record deleted ";
	}
	
	@GetMapping("/products")
	public List<Product> getListOfProducts()
	{
		List<Product> lists = new ArrayList<>();
		Product s1 = new Product(10,8000);
		Product s2 = new Product(2,5000);

		lists.add(s1);
		lists.add(s2);
		return lists;
	}
	
}