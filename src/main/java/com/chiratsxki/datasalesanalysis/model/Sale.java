package com.chiratsxki.datasalesanalysis.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;



@Entity
@AllArgsConstructor
@Data
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nameOfProduct;

    private Integer quantity;



    public Sale() {
    }
}
