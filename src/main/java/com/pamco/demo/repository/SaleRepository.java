package com.pamco.demo.repository;

import com.pamco.demo.model.SalesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<SalesModel, Integer> {
    @Override
    SalesModel save(SalesModel salesModel);
}
