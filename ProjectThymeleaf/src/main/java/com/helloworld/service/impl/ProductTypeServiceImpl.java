package com.helloworld.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloworld.entity.ProductType;
import com.helloworld.repository.ProductTypeRepository;
import com.helloworld.service.ProductTypeService;

@Service
public class ProductTypeServiceImpl implements ProductTypeService{
	@Autowired
	private ProductTypeRepository productTypeRepository;

	@Override
	public List<ProductType> findAllProductType() {
		return productTypeRepository.findAll();
	}
	
}
