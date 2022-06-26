package com.saybatan.interprobe.homework1.dao;

import com.saybatan.interprobe.homework1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {

    List<Product> findAllByExpirationDateIsGreaterThan (Date date);

    List<Product> findAllByExpirationDateIsLessThanOrExpirationDateIsNull (Date date);

}
