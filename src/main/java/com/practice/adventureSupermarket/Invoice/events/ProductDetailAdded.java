package com.practice.adventureSupermarket.Invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.ProductDetail.Manufacturer;
import com.practice.adventureSupermarket.ProductDetail.Product;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;
import com.practice.adventureSupermarket.ProductDetail.values.Description;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

public class ProductDetailAdded extends DomainEvent {

    private final ProductDetailId productDetailId;
    private final Description description;
    private final Amount amount;

    public ProductDetailAdded(ProductDetailId productDetailId, Description description, Amount amount){
        super("sofka.productDetail.productDetailCreated");
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
