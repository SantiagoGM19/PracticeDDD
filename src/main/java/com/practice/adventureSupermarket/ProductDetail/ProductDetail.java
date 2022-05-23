package com.practice.adventureSupermarket.ProductDetail;

import co.com.sofka.domain.generic.AggregateEvent;
import com.practice.adventureSupermarket.ProductDetail.events.*;
import com.practice.adventureSupermarket.ProductDetail.values.*;

import java.util.Objects;

public class ProductDetail extends AggregateEvent<ProductDetailId> {

    protected ProductId productId;
    protected ManufacturerId manufacturerId;
    protected Description description;
    protected Amount amount;

    public ProductDetail(ProductDetailId entityId, Description description, Amount amount) {
        super(entityId);
        appendChange(new ProductDetailCreated(description, amount)).apply();
    }

    public void updateProductId(ProductId productId){
        Objects.requireNonNull(productId, "The product id can not be null");
        appendChange(new ProductIdUpdated(productId)).apply();
    }

    public void updateManufacturerId(ManufacturerId manufacturerId){
        Objects.requireNonNull(manufacturerId, "The manufacturer id can not be null");
        appendChange(new ManufacturerIdUpdated(manufacturerId)).apply();
    }

    public void updateDescription(Description description){
        Objects.requireNonNull(description);
        appendChange(new DescriptionUpdated(description));
    }

    public void updateAmount(Amount amount){
        Objects.requireNonNull(amount);
        appendChange(new AmountUpdated(amount)).apply();
    }
}
