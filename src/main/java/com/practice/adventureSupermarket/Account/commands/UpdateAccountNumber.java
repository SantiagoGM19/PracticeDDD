package com.practice.adventureSupermarket.Account.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Account.values.AccountId;
import com.practice.adventureSupermarket.Account.values.AccountNumber;

public class UpdateAccountNumber extends Command {

    private final AccountId accountId;
    private final AccountNumber accountNumber;

    public UpdateAccountNumber(AccountId accountId, AccountNumber accountNumber) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public AccountNumber getAccountNumber() {
        return accountNumber;
    }
}
