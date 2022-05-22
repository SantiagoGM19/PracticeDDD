package com.practice.adventureSupermarket.Invoice.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Retribution implements ValueObject<Double> {

    private final Double value;

    public Retribution(Double value){
        this.value = Objects.requireNonNull(value, "The retribution can not be null");
        if(value < 0){
            throw new IllegalArgumentException("The retribution should be a positive number");
        }
        if(value > 1000){
            throw new IllegalArgumentException("You can only give 1000 dollars as maximum amount");
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
        Retribution that = (Retribution) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
