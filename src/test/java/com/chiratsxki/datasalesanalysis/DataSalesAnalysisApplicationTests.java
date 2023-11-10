package com.chiratsxki.datasalesanalysis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.assertj.core.api.Assertions;

@SpringBootTest
class DataSalesAnalysisApplicationTests {


    @Test
    void testMain() {
        ApplicationContext context = SpringApplication.run(DataSalesAnalysisApplication.class);

        Assertions.assertThat(context).isNotNull();

    }

}
