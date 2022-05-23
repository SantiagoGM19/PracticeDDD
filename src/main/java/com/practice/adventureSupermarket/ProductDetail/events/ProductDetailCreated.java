package com.practice.adventureSupermarket.ProductDetail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;
import com.practice.adventureSupermarket.ProductDetail.values.Description;

public class ProductDetailCreated extends DomainEvent {

    private final Description description;
    private final Amount amount;

    public ProductDetailCreated(Description description, Amount amount) {
        super("practice.productdetail.productdetailcreated");
        this.description = description;
        this.amount = amount;
    }

    public Description getDescription() {
        return description;
    }

    public Amount getAmount() {
        return amount;
    }
}
