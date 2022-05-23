package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Money implements ValueObject<Double> {

    private final Double value;

    public Money(Double value) {
        this.value = Objects.requireNonNull(value, "The money amount can not be null");
        if(value < 0){
            throw new IllegalArgumentException("The money amount should be a positive number");
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
        Money money = (Money) o;
        return Objects.equals(value, money.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
