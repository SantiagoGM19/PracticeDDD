package com.practice.adventureSupermarket.Invoice.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Invoice.values.InvoiceId;
import com.practice.adventureSupermarket.Invoice.values.TotalAmount;

public class UpdateTotalAmount extends Command {

    private final InvoiceId invoiceId;
    private final TotalAmount totalAmount;

    public UpdateTotalAmount(InvoiceId invoiceId, TotalAmount totalAmount) {
        this.invoiceId = invoiceId;
        this.totalAmount = totalAmount;
    }

    public InvoiceId getInvoiceId() {
        return invoiceId;
    }

    public TotalAmount getTotalAmount() {
        return totalAmount;
    }
}
