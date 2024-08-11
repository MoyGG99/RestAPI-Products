package com.aplication.rest.repository;

import com.aplication.rest.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    // no es de jpa y se usa sentencias jpsql

    @Query("SELECT p FROM Product p WHERE p.price >= ?1 AND p.price <= ?2")
    List<Product> findProductByPriceInRange(BigDecimal mixPrice, BigDecimal maxPrice);


    // es de jpa
    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);
}
