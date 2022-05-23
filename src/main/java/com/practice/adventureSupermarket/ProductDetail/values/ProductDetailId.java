package com.practice.adventureSupermarket.ProductDetail.values;

import co.com.sofka.domain.generic.Identity;

public class ProductDetailId extends Identity {

    public ProductDetailId(){

    }

    private ProductDetailId(String id){
        super(id);
    }

    public static ProductDetailId of(String id){
        return new ProductDetailId(id);
    }
}
