package com.practice.adventureSupermarket.Account.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Account.values.AccountNumber;

public class AccountNumberUpdated extends DomainEvent {

    private final AccountNumber accountNumber;

    public AccountNumberUpdated(AccountNumber accountNumber) {
        super("practice.account.accountnumberupdated");
        this.accountNumber = accountNumber;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }
}
