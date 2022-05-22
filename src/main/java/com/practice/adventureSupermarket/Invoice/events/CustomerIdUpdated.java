package com.practice.adventureSupermarket.Invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Invoice.values.CustomerId;

public class CustomerIdUpdated extends DomainEvent {

    private final CustomerId customerId;

    public CustomerIdUpdated(CustomerId customerId){
        super("practice.invoice.customeridupdated");
        this.customerId = customerId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }
}
