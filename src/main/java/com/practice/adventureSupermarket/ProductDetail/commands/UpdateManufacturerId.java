package com.practice.adventureSupermarket.ProductDetail.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.ProductDetail.values.ManufacturerId;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

public class UpdateManufacturerId extends Command {

    private final ProductDetailId productDetailId;
    private final ManufacturerId manufacturerId;

    public UpdateManufacturerId(ProductDetailId productDetailId, ManufacturerId manufacturerId) {
        this.productDetailId = productDetailId;
        this.manufacturerId = manufacturerId;
    }

    public ProductDetailId getProductDetailId() {
        return productDetailId;
    }

    public ManufacturerId getManufacturerId() {
        return manufacturerId;
    }
}
