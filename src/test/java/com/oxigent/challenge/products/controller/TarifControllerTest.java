package com.oxigent.challenge.products.controller;

import com.oxigent.challenge.products.repository.TarifRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
@AutoConfigureMockMvc
class TarifControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    TarifRepository tarifRepository;


    @Test
    void getTarifByBrand_And_product_and_Between_dates() throws Exception {


        mockMvc.perform(MockMvcRequestBuilders.get("/api/tarif/brand?brand=1&product=35455&application_date=2020-06-14 23:59:00")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .isOk())
                .andExpect(MockMvcResultMatchers
                        .content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    private void ConditionsTest(){
        final String PRODUCT="35455";

    }

    class GeneratedDateTest{

        /*
        *
        *Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)
        *Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
        *Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
        *Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
        *Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
        * */



    }
}