package com.inditex.prices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.inditex.prices.model.Prices;

public interface PricesRepository extends JpaRepository<Prices, Long> {

    @Query("SELECT p FROM Prices p WHERE p.productId = :productId AND p.brandId = :brandId AND " +
       ":applicationDate BETWEEN p.startDate AND p.endDate ORDER BY p.priority DESC")
    List<Prices> findApplicablePrices(@Param("applicationDate") String applicationDate,
                     @Param("productId") Integer productId,
                     @Param("brandId") Integer brandId);
                         
}
