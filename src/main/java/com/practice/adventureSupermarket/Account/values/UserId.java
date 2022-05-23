package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.Identity;

public class UserId extends Identity {

    public UserId(){

    }

    private UserId(String id){
        super(id);
    }

    public static UserId of(String id){
        return new UserId(id);
    }
}
