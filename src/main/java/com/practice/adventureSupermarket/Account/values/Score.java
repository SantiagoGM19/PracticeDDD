package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Score implements ValueObject<Integer> {

    private final Integer value;

    public Score(Integer value) {
        this.value = Objects.requireNonNull(value,"The score can not be null");
        if(this.value > 5000){
            throw new IllegalArgumentException("The maximum possible score is 5000");
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
        Score score = (Score) o;
        return Objects.equals(value, score.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
