package com.chiratsxki.datasalesanalysis;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.service.SalesService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DataSalesAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSalesAnalysisApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(SalesService salesService) {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Sale>> typeReference = new TypeReference<List<Sale>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/sales.json");
            try {
                List<Sale> sales = mapper.readValue(inputStream,typeReference);
                SalesService.save(sales);
                System.out.println("Products Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save products: " + e.getMessage());
            }
        };
    }

    
}
