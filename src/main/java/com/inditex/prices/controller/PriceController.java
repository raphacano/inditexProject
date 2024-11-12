package com.inditex.prices.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.inditex.prices.model.Prices;
import com.inditex.prices.model.PricesResponse;
import com.inditex.prices.services.PricesService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/prices")
public class PriceController {

    private final PricesService priceService;

    @GetMapping
    public PricesResponse getPrice(
            @RequestParam String applicationDate,
            @RequestParam Integer productId,
            @RequestParam Integer brandId) {

        Optional<Prices> price = priceService.getApplicablePrice(applicationDate, productId, brandId);

        if (price.isPresent()) {
            Prices p = price.get();
            return new PricesResponse(p.getProductId(), p.getBrandId(), p.getPriceList(), p.getStartDate(), p.getEndDate(), p.getPrice(), p.getCurr());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No applicable price found");
        }
    }
}
