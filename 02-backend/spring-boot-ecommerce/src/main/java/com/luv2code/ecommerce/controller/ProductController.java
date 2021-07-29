package com.luv2code.ecommerce.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.ecommerce.service.ProductService;

@RestController
@RequestMapping({ "/api" })
@CrossOrigin("http://localhost:4200")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping({"/product","/product/{id}"})
	public ResponseEntity<?> findAll(@PathVariable(required = false) Optional<Long> id) {
		if(id.isPresent()) {
			return ResponseEntity.ok(productService.findById(id));
			
		}
			System.out.println("a");
			return ResponseEntity.ok(productService.findProducts());
			// return ResponseEntity.ok("hello");
		
		
	}
	
	@RequestMapping("/category")
	public ResponseEntity<?> findByCategoryId(@RequestParam("id") Long id) {
		
		return ResponseEntity.ok(productService.findByCategoryId(id));
		// return ResponseEntity.ok("hello");
	}
	
	
	
	@RequestMapping("/product/search/findByNameContaining")
	public ResponseEntity<?> findByName(@RequestParam("name") String keyword) {

		return ResponseEntity.ok(productService.findByName(keyword));
		// return ResponseEntity.ok("hello");
	}
}
