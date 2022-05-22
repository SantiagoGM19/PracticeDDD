package com.practice.adventureSupermarket.Invoice.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Invoice.values.InvoiceId;
import com.practice.adventureSupermarket.Invoice.values.SellerId;

public class UpdateSellerId extends Command {

    private final InvoiceId invoiceId;
    private final SellerId sellerId;

    public UpdateSellerId(InvoiceId invoiceId, SellerId sellerId) {
        this.invoiceId = invoiceId;
        this.sellerId = sellerId;
    }

    public InvoiceId getInvoiceId() {
        return invoiceId;
    }

    public SellerId getSellerId() {
        return sellerId;
    }
}
