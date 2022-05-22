package com.practice.adventureSupermarket.Invoice.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Invoice.values.InvoiceId;
import com.practice.adventureSupermarket.Invoice.values.SaleDate;

public class CreateInvoice extends Command {

    private final InvoiceId invoiceId;
    private final SaleDate saleDate;

    public CreateInvoice(InvoiceId invoiceId, SaleDate saleDate) {
        this.invoiceId = invoiceId;
        this.saleDate = saleDate;
    }

    public InvoiceId getInvoiceId() {
        return invoiceId;
    }

    public SaleDate getSaleDate() {
        return saleDate;
    }
}
