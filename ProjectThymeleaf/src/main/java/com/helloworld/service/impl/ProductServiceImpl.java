package com.helloworld.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.entity.Product;
import com.helloworld.repository.ProductRepository;
import com.helloworld.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

}
