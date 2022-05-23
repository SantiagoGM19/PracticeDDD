package com.practice.adventureSupermarket.ProductDetail.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Amount implements ValueObject<Integer> {

    private final Integer value;

    public Amount(Integer value){
        this.value = Objects.requireNonNull(value,"The amount can not be null");
        if(this.value < 0){
            throw new IllegalArgumentException("The amount should be a positive number");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount = (Amount) o;
        return Objects.equals(value, amount.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
