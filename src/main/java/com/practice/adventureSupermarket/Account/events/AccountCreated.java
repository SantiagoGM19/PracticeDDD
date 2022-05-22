package com.practice.adventureSupermarket.Account.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Account.values.AccountNumber;

public class AccountCreated extends DomainEvent {

    private final AccountNumber accountNumber;

    public AccountCreated(AccountNumber accountNumber){
        super("practice.account.accountcreated");
        this.accountNumber = accountNumber;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }
}
