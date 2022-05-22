package com.practice.adventureSupermarket.Invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Invoice.values.SellerId;

public class SellerIdUpdated extends DomainEvent {

    private final SellerId sellerId;

    public SellerIdUpdated(SellerId sellerId){
        super("practice.invoice.selleridupdated");
        this.sellerId = sellerId;
    }

    public SellerId getSellerId(){
        return sellerId;
    }
}
