package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Password implements ValueObject<String> {

    private final String value;

    public Password(String value) {
        this.value = Objects.requireNonNull(value, "The password can not be null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The password can not be empty");
        }
        if(this.value.length() < 7){
            throw new IllegalArgumentException("The password should be 7 character long at least");
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
        Password password = (Password) o;
        return Objects.equals(value, password.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
