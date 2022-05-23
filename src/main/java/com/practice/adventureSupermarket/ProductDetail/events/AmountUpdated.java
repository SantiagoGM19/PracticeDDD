package com.practice.adventureSupermarket.ProductDetail.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;

public class AmountUpdated extends DomainEvent {

    private final Amount amount;

    public AmountUpdated(Amount amount) {
        super("practice.productdetail.amountupdated");
        this.amount = amount;
    }

    public Amount getAmount() {
        return amount;
    }
}
