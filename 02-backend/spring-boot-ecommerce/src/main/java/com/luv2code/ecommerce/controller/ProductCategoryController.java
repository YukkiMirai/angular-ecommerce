package com.luv2code.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.ecommerce.entity.ProductCategory;
import com.luv2code.ecommerce.service.ProductCategoryService;

@RestController
@RequestMapping("/api/product-category")
@CrossOrigin("http://localhost:4200")
public class ProductCategoryController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	@GetMapping({""})
	public ResponseEntity<List<ProductCategory>> getAllProjects() {
		
		return ResponseEntity.ok(productCategoryService.findProductCategories());
	}
}
