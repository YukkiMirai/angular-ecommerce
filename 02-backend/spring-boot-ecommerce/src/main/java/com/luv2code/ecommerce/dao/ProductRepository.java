package com.luv2code.ecommerce.dao;



import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	//
	//Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
	
	//Rest Resource
	//Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
	List<Product> findByNameContaining(String keyword);
	
	List<Product> findByCategoryId(Long id);

	Optional<Product> findById(Optional<Long> id);
}
