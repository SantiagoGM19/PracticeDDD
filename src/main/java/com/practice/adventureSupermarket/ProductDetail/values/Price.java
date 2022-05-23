package com.practice.adventureSupermarket.ProductDetail.values;

import co.com.sofka.domain.generic.ValueObject;
import com.practice.adventureSupermarket.Invoice.values.Retribution;

import java.util.Objects;

public class Price implements ValueObject<Double> {

    private final Double value;

    public Price(Double value){
        this.value = Objects.requireNonNull(value, "The price can not be null");
        if(value < 0){
            throw new IllegalArgumentException("The price should be a positive number");
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
        Price that = (Price) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
