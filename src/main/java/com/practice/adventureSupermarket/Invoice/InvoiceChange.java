package com.practice.adventureSupermarket.Invoice;

import co.com.sofka.domain.generic.EventChange;
import com.practice.adventureSupermarket.Invoice.events.*;
import com.practice.adventureSupermarket.ProductDetail.ProductDetail;

import java.util.HashSet;

public class InvoiceChange extends EventChange {
    public InvoiceChange(Invoice invoice){
        apply((InvoiceCreated event) -> {
            invoice.productsDetail = new HashSet<>();
            invoice.saleDate = event.getSaleDate();
            invoice.totalAmount = event.getTotalAmount();
        });

        apply((ProductDetailAdded event) -> {
            invoice.productsDetail.add(new ProductDetail(
                    event.getProductDetailId(),
                    event.getDescription(),
                    event.getAmount()
            ));
        });

        apply((CustomerIdUpdated event) -> {
            invoice.customerId = event.getCustomerId();
        });

        apply((SellerIdUpdated event) -> {
            invoice.sellerId = event.getSellerId();
        });

        apply((SaleDateUpdated event) -> {
            invoice.saleDate = event.getSaleDate();
        });

        apply((TotalAmountUpdated event) -> {
            invoice.totalAmount = event.getTotalAmount();
        });

    }
}
