package com.chiratsxki.datasalesanalysis.service;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.repo.SaleRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SalesService {

    private static SaleRepository saleRepository;

    public SalesService(SaleRepository saleRepository) {
        SalesService.saleRepository = saleRepository;
    }

    public List<Sale> getProductByName(String name) {
        log.info("Getting product by name");
        return saleRepository.findSaleByName(name);
    }

    public List<Sale> getProductByChip(String chip) {
        log.info("Getting products by chip");
        return saleRepository.findSaleByChip(chip);
    }

    public List<Sale> getProductBySsd(int ssd) {
        log.info("Getting product by SSD");
        return saleRepository.findSaleBySsd(ssd);
    }

    public Sale save(Sale  sale){
        return saleRepository.save(sale);
    }

    public static Iterable<Sale> save(List<Sale> sale) {
        return saleRepository.saveAll(sale);
    }

    public List<Sale> getAllProducts() {
        return saleRepository.findAll();
    }
}
