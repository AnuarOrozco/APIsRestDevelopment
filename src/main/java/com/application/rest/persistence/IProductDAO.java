package com.application.rest.persistence;

import com.application.rest.entities.Product;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);
    void deleteById(Long id);

    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

}
