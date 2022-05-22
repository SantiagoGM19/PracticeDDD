package com.practice.adventureSupermarket.Invoice;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Invoice.events.*;
import com.practice.adventureSupermarket.Invoice.values.*;
import com.practice.adventureSupermarket.ProductDetail.ProductDetail;
import com.practice.adventureSupermarket.ProductDetail.values.Amount;
import com.practice.adventureSupermarket.ProductDetail.values.Description;
import com.practice.adventureSupermarket.ProductDetail.values.ProductDetailId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Invoice extends AggregateEvent<InvoiceId> {

    protected Set<ProductDetail> productsDetail;
    protected CustomerId customerId;
    protected SellerId sellerId;
    protected SaleDate saleDate;
    protected TotalAmount totalAmount;

    public Invoice(InvoiceId entityId, SaleDate saleDate, TotalAmount totalAmount) {
        super(entityId);
        appendChange(new InvoiceCreated(saleDate, totalAmount)).apply();
    }

    private Invoice(InvoiceId entityId){
        super(entityId);
        subscribe(new InvoiceChange(this));
    }

    public static Invoice from(InvoiceId invoiceId, List<DomainEvent> events){
        var invoice = new Invoice(invoiceId);
        events.forEach(invoice::applyEvent);
        return invoice;
    }

    public void addProductDetail(ProductDetailId productDetailId, Description description, Amount amount){
        Objects.requireNonNull(productDetailId, "The product detail id is null, It is required");
        Objects.requireNonNull(description, "The description is null, It is required");
        Objects.requireNonNull(amount, "The amount is null, It is required");
        appendChange(new ProductDetailAdded(productDetailId, description, amount)).apply();
    }

    public void updateCustomerId(CustomerId customerId){
        Objects.requireNonNull(customerId, "The customer id can not be null, It is required");
        appendChange(new CustomerIdUpdated(customerId)).apply();
    }

    public void updateSellerId(SellerId sellerId){
        Objects.requireNonNull(sellerId, "The seller can not be null, It is required");
        appendChange(new SellerIdUpdated(sellerId)).apply();
    }

    public void updateSaleDate(SaleDate saleDate){
        Objects.requireNonNull(saleDate, "The sale date can not be null, It is required");
        appendChange(new SaleDateUpdated(saleDate)).apply();
    }

    public void updateTotalAmount(TotalAmount totalAmount){
        Objects.requireNonNull(totalAmount, "The total amount can not be null, It must be 0 or more");
        appendChange(new TotalAmountUpdated(totalAmount)).apply();
    }

    public Set<ProductDetail> productsDetail(){
        return productsDetail;
    }
    
    public Optional<ProductDetail> getProductDetailById(ProductDetailId entityId){
        return productsDetail()
                .stream()
                .filter(productDetail -> productDetail.identity().equals(entityId))
                .findFirst();
    }
}
