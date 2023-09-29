package com.chiratsxki.datasalesanalysis;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.repo.SaleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class DataSalesAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSalesAnalysisApplication.class, args);
    }


    @Bean
    CommandLineRunner run(SaleRepository saleRepository) {
        return args -> {
            saleRepository.save(new Sale(null, "Electronics", 243, 400));
            saleRepository.save(new Sale(null, "Home & Kitchen", 182, 50));
            saleRepository.save(new Sale(null, "Health & Household:", 861, 70));
            saleRepository.save(new Sale(null, "Beauty & Personal Care", 563, 68));
            saleRepository.save(new Sale(null, "Clothing", 434, 120));
            saleRepository.save(new Sale(null, "Jewelry", 123, 250));
            saleRepository.save(new Sale(null, "Toys ", 248, 15));
            saleRepository.save(new Sale(null, "Sports & Outdoors", 675, 89));
            saleRepository.save(new Sale(null, "Pet Supplies", 921, 76));
            saleRepository.save(new Sale(null, "Grocery & Gourmet Food", 159, 20));
            saleRepository.save(new Sale(null, "Books", 417, 40));
        };
    }
}
