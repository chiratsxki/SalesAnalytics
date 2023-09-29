package com.chiratsxki.datasalesanalysis.controller;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.service.SalesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    private final SalesService salesService;

    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }

    @GetMapping("/top-10-bestsellers")
    public List<Sale> getTopBestsellers() {
        return salesService.get10BestSellers();
    }

    @GetMapping("/product/{name}")
    public List<Sale> getProductByName(@PathVariable String name) {
        return salesService.getProductByName(name);
    }

    @GetMapping("/topCost")
    public List<Sale> get10CostSales() {
        return salesService.get10SalesByCost();
    }



}
