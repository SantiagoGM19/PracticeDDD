package com.practice.adventureSupermarket.Account.commands;

import co.com.sofka.domain.generic.Command;
import com.practice.adventureSupermarket.Account.values.AccountId;
import com.practice.adventureSupermarket.Account.values.SubscriptionCardId;

public class UpdateSubscriptionCardId extends Command {

    private final AccountId accountId;
    private final SubscriptionCardId subscriptionCardId;

    public UpdateSubscriptionCardId(AccountId accountId, SubscriptionCardId subscriptionCardId) {
        this.accountId = accountId;
        this.subscriptionCardId = subscriptionCardId;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public SubscriptionCardId getSubscriptionCardId() {
        return subscriptionCardId;
    }
}
