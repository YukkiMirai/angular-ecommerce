package com.luv2code.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.luv2code.ecommerce.entity.Product;

public interface ProductService {

	List<Product> findProducts();

	List<Product> findByName(String keyword);

	List<Product> findByCategoryId(Long id);

	Optional<Product> findById(Optional<Long> id);

}
