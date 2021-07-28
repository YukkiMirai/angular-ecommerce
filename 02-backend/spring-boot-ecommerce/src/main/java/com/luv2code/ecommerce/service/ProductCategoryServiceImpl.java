package com.luv2code.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.ecommerce.dao.ProductCategoryRepository;
import com.luv2code.ecommerce.entity.ProductCategory;



@Service
@Transactional(rollbackFor = Exception.class)
public class ProductCategoryServiceImpl implements ProductCategoryService {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> findProductCategories() {
		// TODO Auto-generated method stub
		return productCategoryRepository.findAll();
	}
	
	
}
