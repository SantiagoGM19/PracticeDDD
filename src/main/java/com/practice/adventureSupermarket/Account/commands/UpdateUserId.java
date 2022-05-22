package com.practice.adventureSupermarket.Account.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Account.values.AccountId;
import com.practice.adventureSupermarket.Account.values.UserId;

public class UpdateUserId extends Command {

    private final AccountId accountId;
    private final UserId userId;

    public UpdateUserId(AccountId accountId, UserId userId) {
        this.accountId = accountId;
        this.userId = userId;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public UserId getUserId() {
        return userId;
    }
}
