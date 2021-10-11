package com.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helloworld.entity.ProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long>{

}
