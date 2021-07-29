package com.luv2code.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.ecommerce.dao.ProductRepository;
import com.luv2code.ecommerce.entity.Product;

@Service
@Transactional(rollbackFor = Exception.class)
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> findByName(String keyword) {
		// TODO Auto-generated method stub
		return productRepository.findByNameContaining(keyword);
	}

	@Override
	public List<Product> findProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Product> findByCategoryId(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findByCategoryId(id);
	}

	@Override
	public Optional<Product> findById(Optional<Long> id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}
	
}
