package com.practice.adventureSupermarket.ProductDetail.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.ProductDetail.values.Description;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

public class UpdateDescription extends Command {

    private final ProductDetailId productDetailId;
    private final Description description;

    public UpdateDescription(ProductDetailId productDetailId, Description description) {
        this.productDetailId = productDetailId;
        this.description = description;
    }

    public ProductDetailId getProductDetailId() {
        return productDetailId;
    }

    public Description getDescription() {
        return description;
    }
}
