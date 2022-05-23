package com.practice.adventureSupermarket.ProductDetail;

import co.com.sofka.domain.generic.EventChange;
import com.practice.adventureSupermarket.ProductDetail.events.*;

public class ProductDetailChange extends EventChange {
    public ProductDetailChange(ProductDetail productDetail){
        apply((ProductDetailCreated event) -> {
            productDetail.description = event.getDescription();
            productDetail.amount = event.getAmount();
        });

        apply((ProductIdUpdated event) -> {
            productDetail.productId = event.getProductId();
        });

        apply((ManufacturerIdUpdated event) -> {
            productDetail.manufacturerId = event.getManufacturerId();
        });

        apply((DescriptionUpdated event) -> {
            productDetail.description = event.getDescription();
        });

        apply((AmountUpdated event) -> {
            productDetail.amount = event.getAmount();
        });
    }
}
