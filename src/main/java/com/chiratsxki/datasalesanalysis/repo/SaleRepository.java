package com.chiratsxki.datasalesanalysis.repo;

import com.chiratsxki.datasalesanalysis.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {


    List<Sale> findSaleByName(String name);

    

}
