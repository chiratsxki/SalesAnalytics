package com.chiratsxki.datasalesanalysis.service;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.repo.SaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SalesService {

    private final SaleRepository saleRepository;

    public SalesService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> get10BestSellers(){
        log.info("Getting 10 bestsellers");
        return saleRepository.findTop10ByOrderByQuantityDesc();

    }

    public List<Sale> getProductByName(String name) {
        log.info("Getting product by name");
        return saleRepository.findSaleByNameOfProduct(name);
    }

    public List<Sale> get10SalesByCost() {
        log.info("Getting 10 products by cost");
        return saleRepository.findTop10ByOrderByPricePerPieceDesc();
    }


}
