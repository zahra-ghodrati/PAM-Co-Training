package com.pamco.demo.service;

import com.pamco.demo.model.SalesModel;
import com.pamco.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public SalesModel createSaleFactor(SalesModel sale) {
        return saleRepository.save(sale);

    }
}
