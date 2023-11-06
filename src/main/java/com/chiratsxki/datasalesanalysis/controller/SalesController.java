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


    
    @GetMapping("/product/{name}")
    public List<Sale> getProductByName(@PathVariable String name) {
        return salesService.getProductByName(name);
    }


    @GetMapping("/product/chip/{chip}")
    public List<Sale> getProductByChip(@PathVariable String chip) {
        return salesService.getProductByChip(chip);
    }

    @GetMapping("/product/ssd/{ssd}")
    public List<Sale> getProductSsd(@PathVariable int ssd) {
        return salesService.getProductBySsd(ssd);
    }

}
