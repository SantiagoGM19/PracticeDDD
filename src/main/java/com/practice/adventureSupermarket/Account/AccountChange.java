package com.practice.adventureSupermarket.Account;

import co.com.sofka.domain.generic.EventChange;
import com.practice.adventureSupermarket.Account.events.AccountCreated;
import com.practice.adventureSupermarket.Account.events.AccountNumberUpdated;
import com.practice.adventureSupermarket.Account.events.SubscriptionCardIdUpdated;
import com.practice.adventureSupermarket.Account.events.UserIdUpdated;

public class AccountChange extends EventChange {
    public AccountChange(Account account){
        apply((AccountCreated event) -> {
            account.accountNumber = event.getAccountNumber();
        });

        apply((SubscriptionCardIdUpdated event) -> {
            account.subscriptionCardId = event.getSubscriptionCardId();
        });

        apply((UserIdUpdated event) -> {
            account.userId = event.getUserId();
        });

        apply((AccountNumberUpdated event) -> {
            account.accountNumber = event.getAccountNumber();
        });
    }
}
