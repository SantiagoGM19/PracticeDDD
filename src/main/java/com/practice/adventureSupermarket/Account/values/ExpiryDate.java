package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.ValueObject;
import com.practice.adventureSupermarket.Invoice.values.SaleDate;

import java.time.LocalDateTime;
import java.util.Objects;

public class ExpiryDate implements ValueObject<LocalDateTime> {

    private final LocalDateTime value;

    public ExpiryDate(LocalDateTime value){
        this.value = Objects.requireNonNull(value, "The expiry date can not be null");
        if(!this.value.isEqual(LocalDateTime.now())){
            throw new IllegalArgumentException("The expiry date should have the same present day");
        }
    }

    @Override
    public LocalDateTime value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpiryDate saleDate = (ExpiryDate) o;
        return Objects.equals(value, saleDate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
