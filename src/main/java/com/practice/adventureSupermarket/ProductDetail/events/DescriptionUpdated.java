package com.practice.adventureSupermarket.ProductDetail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.ProductDetail.values.Description;

public class DescriptionUpdated extends DomainEvent {

    private final Description description;

    public DescriptionUpdated(Description description) {
        super("practice.productdetail.descriptionupdated");
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }
}
