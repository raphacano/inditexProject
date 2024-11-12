package com.inditex.prices.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class PricesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPriceLookupAt1000On14th() throws Exception {
        mockMvc.perform(get("/prices")
                .param("applicationDate", "2020-06-14 10:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price").value(35.50));
    }


    @Test
    public void testPriceLookupAt1600On14th() throws Exception {
        mockMvc.perform(get("/prices")
                .param("applicationDate", "2020-06-14 16:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price").value(25.45));
    }

    @Test
    void testPriceLookupAt2100On14th() throws Exception {
        mockMvc.perform(get("/prices")
                .param("applicationDate", "2020-06-14 21:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.price").value(35.50));
       
    }

    @Test
    void testPriceLookupAt1000On15th() throws Exception {
        mockMvc.perform(get("/prices")
            .param("applicationDate", "2020-06-15 10:00:00")
            .param("productId", "35455")
            .param("brandId", "1"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.price").value(30.50));
    }

    @Test
    void testPriceLookupAt2100On16th() throws Exception {
        mockMvc.perform(get("/prices")
            .param("applicationDate", "2020-06-16 21:00:00")
            .param("productId", "35455")
            .param("brandId", "1"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.price").value(38.95));
    }
}
