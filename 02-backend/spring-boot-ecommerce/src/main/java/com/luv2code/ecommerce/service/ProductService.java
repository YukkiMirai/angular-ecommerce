package com.luv2code.ecommerce.service;

import java.util.List;

import com.luv2code.ecommerce.entity.Product;

public interface ProductService {

	List<Product> findByName(String keyword);

}
