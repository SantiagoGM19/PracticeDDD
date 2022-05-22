package com.practice.adventureSupermarket.Invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Invoice.values.TotalAmount;

public class TotalAmountUpdated extends DomainEvent {

    private final TotalAmount totalAmount;

    public TotalAmountUpdated(TotalAmount totalAmount){
        super("practice.invoice.totalamountupdated");
        this.totalAmount = totalAmount;
    }

    public TotalAmount getTotalAmount(){
        return totalAmount;
    }
}
