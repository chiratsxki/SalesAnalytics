package com.chiratsxki.datasalesanalysis.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@Entity
@AllArgsConstructor
@Data
@Builder
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String chip;

    private Integer inch;

    private Integer unifiedmemory;

    private Integer ssd;

    private String color;

    private Integer quantity;

    private Integer price;




    public Sale() {
    }
}
