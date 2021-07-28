package com.luv2code.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.ecommerce.entity.ProductCategory;

//@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
//Name of JSON entry // /product-category
@Repository

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

	
	
}
