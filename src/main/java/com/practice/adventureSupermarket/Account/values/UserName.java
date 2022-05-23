package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UserName implements ValueObject<String> {

    private final String value;

    public UserName(String value) {
        this.value = Objects.requireNonNull(value, "The user name can not be null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The user name can not be empty");
        }
        if(this.value.length() > 15){
            throw new IllegalArgumentException("The user name only can be 20 characters long");
        }
        if(this.value.length() < 5){
            throw new IllegalArgumentException("The user name is required to be 10 characters at least");
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
        UserName that = (UserName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
