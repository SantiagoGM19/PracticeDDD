package com.practice.adventureSupermarket.Invoice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalAmount implements ValueObject<Double> {

    private final Double value;

    public TotalAmount(Double value){
        this.value = Objects.requireNonNull(value, "The total amount can not be null");
        if(value < 0){
            throw new IllegalArgumentException("The total amount should be a positive number");
        }
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalAmount that = (TotalAmount) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
