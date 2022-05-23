package com.practice.adventureSupermarket.ProductDetail.values;

import co.com.sofka.domain.generic.Identity;

public class ManufacturerId extends Identity {

    public ManufacturerId(){

    }

    private ManufacturerId(String id){
        super(id);
    }

    public static ManufacturerId of(String id){
        return new ManufacturerId(id);
    }
}
