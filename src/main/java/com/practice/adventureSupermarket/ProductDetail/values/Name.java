package com.practice.adventureSupermarket.ProductDetail.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    private final String value;

    public Name(String value){
        this.value = Objects.requireNonNull(value, "The name can not be null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The name can not be empty");
        }
        if(this.value.length() > 50){
            throw new IllegalArgumentException("The name only can be 500 characters long");
        }
        if(this.value.length() < 4){
            throw new IllegalArgumentException("The name is required to be 4 characters at least");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name that = (Name) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
