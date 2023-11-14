package com.chiratsxki.datasalesanalysis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import com.chiratsxki.datasalesanalysis.model.Sale;
import com.chiratsxki.datasalesanalysis.repo.SaleRepository;

import java.util.List;

import org.assertj.core.api.Assertions;


@SpringBootTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class SalesControllerTest {

  @Autowired
  private SaleRepository saleRepository;

  @Test
  public void SaleRepository_SaveAll_ReturnSavedProduct() {
    
      Sale product = Sale.builder()
          .name("MacBookAir")
          .chip("M2")
          .inch(13)
          .unifiedmemory(8)
          .ssd(256)
          .color("Gold")
          .quantity(12000)
          .price(999).build();

      
      Sale savedSale = saleRepository.save(product);

      Assertions.assertThat(savedSale).isNotNull();
      Assertions.assertThat(savedSale.getId()).isGreaterThan(0);

  }

  @Test
  public void SaleRepository_GetAll_ReturnMoreThenOneProduct() {

      Sale product = Sale.builder()
          .name("MacBookAir")
          .chip("M2")
          .inch(13)
          .unifiedmemory(8)
          .ssd(256)
          .color("Gold")
          .quantity(12000)
          .price(999).build();

      Sale product2 = Sale.builder()
          .name("MacBookAir")
          .chip("M1")
          .inch(13)
          .unifiedmemory(8)
          .ssd(256)
          .color("Gold")
          .quantity(11000)
          .price(899).build();

          saleRepository.save(product);
          saleRepository.save(product2);

      List<Sale> productList = saleRepository.findAll();

      Assertions.assertThat(productList).isNotNull();
      Assertions.assertThat(productList.size()).isEqualTo(3);

  }

}
