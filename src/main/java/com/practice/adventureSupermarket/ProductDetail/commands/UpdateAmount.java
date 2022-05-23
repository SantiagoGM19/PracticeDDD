package com.practice.adventureSupermarket.ProductDetail.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

public class UpdateAmount extends Command {

    private final ProductDetailId productDetailId;
    private final Amount amount;

    public UpdateAmount(ProductDetailId productDetailId, Amount amount) {
        this.productDetailId = productDetailId;
        this.amount = amount;
    }

    public ProductDetailId getProductDetailId() {
        return productDetailId;
    }

    public Amount getAmount() {
        return amount;
    }
}
