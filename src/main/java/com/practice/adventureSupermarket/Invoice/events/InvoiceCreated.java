package com.practice.adventureSupermarket.Invoice.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Invoice.Customer;
import com.practice.adventureSupermarket.Invoice.Seller;
import com.practice.adventureSupermarket.Invoice.values.SaleDate;
import com.practice.adventureSupermarket.Invoice.values.TotalAmount;

public class InvoiceCreated extends DomainEvent {

    private final SaleDate saleDate;
    private final TotalAmount totalAmount;

    public InvoiceCreated(SaleDate saleDate, TotalAmount totalAmount) {
        super("practice.invoice.invoicecreated");
        this.saleDate = saleDate;
        this.totalAmount = totalAmount;
    }

    public SaleDate getSaleDate() {
        return saleDate;
    }

    public TotalAmount getTotalAmount(){
        return totalAmount;
    }

}
