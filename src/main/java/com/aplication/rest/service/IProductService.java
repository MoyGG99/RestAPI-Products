package com.aplication.rest.service;

import com.aplication.rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);

    List<Product> findByPriceInRange(BigDecimal min, BigDecimal max);

    List<Product> finfByIdBetween(Long min, Long max);

    void save(Product product);

    void deleteById(Long id);

}
