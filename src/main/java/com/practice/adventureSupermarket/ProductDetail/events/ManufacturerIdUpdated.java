package com.practice.adventureSupermarket.ProductDetail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.ProductDetail.values.ManufacturerId;

public class ManufacturerIdUpdated extends DomainEvent {

    private final ManufacturerId manufacturerId;

    public ManufacturerIdUpdated(ManufacturerId manufacturerId) {
        super("practice.productdetail.manufactureridupdated");
        this.manufacturerId = manufacturerId;
    }

    public ManufacturerId getManufacturerId() {
        return manufacturerId;
    }
}
