package com.practice.adventureSupermarket.Account.values;

import co.com.sofka.domain.generic.Identity;
import com.practice.adventureSupermarket.Invoice.values.CustomerId;

public class AccountId extends Identity {

    public AccountId(){

    }

    private AccountId(String id){
        super(id);
    }

    public static AccountId of(String id){
        return new AccountId(id);
    }
}
