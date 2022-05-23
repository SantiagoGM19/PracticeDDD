package com.practice.adventureSupermarket.ProductDetail.values;

import co.com.sofka.domain.generic.ValueObject;
import com.practice.adventureSupermarket.Invoice.values.Name;

import java.util.Objects;

public class Category implements ValueObject<String> {

    private final String value;

    public Category(String value){
        this.value = Objects.requireNonNull(value, "The category can not be null");

        if(this.value.isBlank()){
            throw new IllegalArgumentException("The category can not be empty");
        }
        if(this.value.length() > 50){
            throw new IllegalArgumentException("The category only can be 50 characters long");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The category is required to be 3 characters at least");
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
        Category category = (Category) o;
        return Objects.equals(value, category.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
