package com.practice.adventureSupermarket.ProductDetail;

import co.com.sofka.domain.generic.AggregateEvent;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;
import com.practice.adventureSupermarket.ProductDetail.values.Description;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

public class ProductDetail extends AggregateEvent<ProductDetailId> {

    public ProductDetail(ProductDetailId entityId, Description description, Amount amount) {
        super(entityId);
    }
}
