package com.niksensei.projects.vaycasa.strategy;

import com.niksensei.projects.vaycasa.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
