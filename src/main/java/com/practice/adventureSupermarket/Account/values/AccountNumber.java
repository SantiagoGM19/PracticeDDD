package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AccountNumber implements ValueObject<String> {

    private final String value;

    public AccountNumber(String value) {
        this.value = Objects.requireNonNull(value, "The account number can not be null");
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The account can not be empty");
        }
        if(this.value.length() > 20){
            throw new IllegalArgumentException("The account only can be 20 characters long");
        }
        if(this.value.length() < 15){
            throw new IllegalArgumentException("The account is required to be 10 characters at least");
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
        AccountNumber that = (AccountNumber) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
