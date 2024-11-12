package com.inditex.prices.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.inditex.prices.model.Prices;
import com.inditex.prices.repository.PricesRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PricesService {
    private final PricesRepository priceRepository;

    public Optional<Prices> getApplicablePrice(String applicationDate, Integer productId, Integer brandId) {
        return priceRepository.findApplicablePrices(applicationDate, productId, brandId)
                              .stream()
                              .findFirst();
    }
    
}
