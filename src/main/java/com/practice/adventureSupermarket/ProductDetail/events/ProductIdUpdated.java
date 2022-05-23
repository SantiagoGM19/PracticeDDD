package com.practice.adventureSupermarket.ProductDetail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.ProductDetail.values.ProductId;

public class ProductIdUpdated extends DomainEvent {

    private final ProductId productId;

    public ProductIdUpdated(ProductId productId) {
        super("practice.productdetail.productidupdated");
        this.productId = productId;
    }

    public ProductId getProductId() {
        return productId;
    }
}
