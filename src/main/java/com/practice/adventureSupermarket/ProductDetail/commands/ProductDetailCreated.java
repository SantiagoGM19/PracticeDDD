package com.practice.adventureSupermarket.ProductDetail.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;
import com.practice.adventureSupermarket.ProductDetail.values.Description;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

public class ProductDetailCreated extends Command {

    private final ProductDetailId productDetailId;
    private final Description description;
    private final Amount amount;

    public ProductDetailCreated(ProductDetailId productDetailId, Description description, Amount amount) {
        this.productDetailId = productDetailId;
        this.description = description;
        this.amount = amount;
    }

    public ProductDetailId getProductDetailId() {
        return productDetailId;
    }

    public Description getDescription() {
        return description;
    }

    public Amount getAmount() {
        return amount;
    }
}
