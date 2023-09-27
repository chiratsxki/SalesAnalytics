package com.chiratsxki.datasalesanalysis;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.repo.SaleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DataSalesAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSalesAnalysisApplication.class, args);
    }


    @Bean
    CommandLineRunner run(SaleRepository saleRepository) {
        return args -> {
            saleRepository.save(new Sale(null, "Electronics", 243));
            saleRepository.save(new Sale(null, "Home & Kitchen", 182));
            saleRepository.save(new Sale(null, "Health & Household:", 861));
            saleRepository.save(new Sale(null, "Beauty & Personal Care", 563));
            saleRepository.save(new Sale(null, "Clothing", 434));
            saleRepository.save(new Sale(null, "Jewelry", 123));
            saleRepository.save(new Sale(null, "Toys ", 248));
            saleRepository.save(new Sale(null, "Sports & Outdoors", 675));
            saleRepository.save(new Sale(null, "Pet Supplies", 921));
            saleRepository.save(new Sale(null, "Grocery & Gourmet Food", 159));
            saleRepository.save(new Sale(null, "Books", 417));
        };
    }
}
