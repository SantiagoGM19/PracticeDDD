package com.practice.adventureSupermarket.Invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Invoice.values.SaleDate;

public class SaleDateUpdated extends DomainEvent {

    private final SaleDate saleDate;

    public SaleDateUpdated(SaleDate saleDate){
        super("practice.invoice.saledateupdated");
        this.saleDate = saleDate;
    }

    public SaleDate getSaleDate(){
        return saleDate;
    }
}
