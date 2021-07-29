package com.luv2code.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.ecommerce.service.ProductService;

@RestController
@RequestMapping({"/api/product"})
@CrossOrigin("http://localhost:4200")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/search/findByNameContaining")
	public ResponseEntity<?> findByName(@RequestParam("name") String keyword){
		
		return ResponseEntity.ok(productService.findByName(keyword));
		//return ResponseEntity.ok("hello");
	}
}
