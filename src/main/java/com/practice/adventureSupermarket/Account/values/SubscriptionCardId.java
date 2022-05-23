package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.Identity;

public class SubscriptionCardId extends Identity {

    public SubscriptionCardId(){

    }

    private SubscriptionCardId(String id){
        super(id);
    }

    public static SubscriptionCardId of(String id){
        return new SubscriptionCardId(id);
    }
}
