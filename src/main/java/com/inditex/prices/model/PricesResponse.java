package com.inditex.prices.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PricesResponse {
    private Integer productId;
    private Integer brandId;
    private Integer rateToApply;
    private String startDate;
    private String endDate;
    private BigDecimal price;  
    private String curr;

public PricesResponse(Integer productId, Integer brandId, Integer rateToApply, String startDate,
                         String endDate, BigDecimal price, String curr) {
        this.productId = productId;
        this.brandId = brandId;
        this.rateToApply = rateToApply;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.curr = curr;
    }

}
