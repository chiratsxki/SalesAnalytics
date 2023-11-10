package com.chiratsxki.datasalesanalysis.repo;

import com.chiratsxki.datasalesanalysis.model.Sale;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Cacheable(value = "products")
    List<Sale> findSaleByName(String name);

    List<Sale> findSaleByChip(String name);

    List<Sale> findSaleBySsd(int ssd);
    
}
