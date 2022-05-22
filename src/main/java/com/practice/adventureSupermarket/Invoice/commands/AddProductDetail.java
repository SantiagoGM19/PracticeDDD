package com.practice.adventureSupermarket.Invoice.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Invoice.values.InvoiceId;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;
import com.practice.adventureSupermarket.ProductDetail.values.Description;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

public class AddProductDetail extends Command {

    private final InvoiceId invoiceId;
    private final ProductDetailId productDetailId;
    private final Description description;
    private final Amount amount;

    public AddProductDetail(InvoiceId invoiceId, ProductDetailId productDetailId, Description description, Amount amount){
        this.invoiceId = invoiceId;
        this.productDetailId = productDetailId;
        this.description = description;
        this.amount = amount;
    }

    public InvoiceId getInvoiceId() {
        return invoiceId;
    }

    public ProductDetailId getProductDetailId() {
        return productDetailId;
    }

    public Description getDescription() {
        return description;
    }

    public Amount getAmount() {
        return amount;
    }
}
