package com.chiratsxki.datasalesanalysis.service;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.repo.SaleRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SalesService {

    private final SaleRepository saleRepository;

    public SalesService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> get10BestSellers(){
        List<Sale> sales = saleRepository.findTop10ByOrderByQuantityDesc();
        return sales;
    }

    public List<Sale> getProductByName(String name) {

        List<Sale> product = saleRepository.findSaleByNameOfProduct(name);

        return product;
    }
}
