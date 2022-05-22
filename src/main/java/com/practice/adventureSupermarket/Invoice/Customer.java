package com.practice.adventureSupermarket.Invoice;

import co.com.sofka.domain.generic.Entity;
import com.practice.adventureSupermarket.Account.values.AccountId;
import com.practice.adventureSupermarket.Invoice.values.CustomerId;
import com.practice.adventureSupermarket.Invoice.values.Identification;
import com.practice.adventureSupermarket.Invoice.values.Name;

import java.util.Objects;

public class Customer extends Entity<CustomerId> {

    private Identification identification;
    private Name name;
    private AccountId accountId;

    public Customer(CustomerId entityId, Identification identification, Name name) {
        super(entityId);
        this.identification = identification;
        this.name = name;
    }

    public void updateIdentification(Identification identification){
        this.identification = Objects.requireNonNull(identification, "The identification is null, it is required");
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name, "The name is null, it is required");
    }

    public void updateAccountId(AccountId accountId){
        this.accountId = Objects.requireNonNull(accountId, "accountId null");
    }

    public Identification identification(){
        return identification;
    }

    public Name name(){
        return name;
    }
}
