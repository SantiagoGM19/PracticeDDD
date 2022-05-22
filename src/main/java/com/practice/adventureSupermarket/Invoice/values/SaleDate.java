package com.practice.adventureSupermarket.Invoice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class SaleDate implements ValueObject<LocalDateTime> {

    private final LocalDateTime value;

    public SaleDate(LocalDateTime value){
        this.value = Objects.requireNonNull(value, "The sale date can not be null");
        if(!this.value.isEqual(LocalDateTime.now())){
            throw new IllegalArgumentException("The sale date should have the same present day");
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
        SaleDate saleDate = (SaleDate) o;
        return Objects.equals(value, saleDate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
