package com.practice.adventureSupermarket.ProductDetail.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.ProductDetail.ProductDetail;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;
import com.practice.adventureSupermarket.ProductDetail.values.ProductId;

public class UpdateProductId extends Command {

    private final ProductDetailId productDetailId;
    private final ProductId productId;

    public UpdateProductId(ProductDetailId productDetailId, ProductId productId) {
        this.productDetailId = productDetailId;
        this.productId = productId;
    }

    public ProductDetailId getProductDetailId() {
        return productDetailId;
    }

    public ProductId getProductId() {
        return productId;
    }
}
