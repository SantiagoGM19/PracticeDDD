package com.practice.adventureSupermarket.Invoice.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Invoice.values.CustomerId;
import com.practice.adventureSupermarket.Invoice.values.InvoiceId;

public class UpdateCustomerId extends Command {

    private final InvoiceId invoiceId;
    private final CustomerId customerId;

    public UpdateCustomerId(InvoiceId invoiceId, CustomerId customerId){
        this.invoiceId = invoiceId;
        this.customerId = customerId;
    }

    public InvoiceId getInvoiceId() {
        return invoiceId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

}
