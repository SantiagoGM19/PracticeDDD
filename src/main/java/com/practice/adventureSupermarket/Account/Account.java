package com.practice.adventureSupermarket.Account;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Account.events.AccountCreated;
import com.practice.adventureSupermarket.Account.events.AccountNumberUpdated;
import com.practice.adventureSupermarket.Account.events.SubscriptionCardIdUpdated;
import com.practice.adventureSupermarket.Account.events.UserIdUpdated;
import com.practice.adventureSupermarket.Account.values.AccountId;
import com.practice.adventureSupermarket.Account.values.AccountNumber;
import com.practice.adventureSupermarket.Account.values.SubscriptionCardId;
import com.practice.adventureSupermarket.Account.values.UserId;

import java.util.List;
import java.util.Objects;

public class Account extends AggregateEvent<AccountId> {

    protected SubscriptionCardId subscriptionCardId;
    protected UserId userId;
    protected AccountNumber accountNumber;


    public Account(AccountId entityId, AccountNumber accountNumber) {
        super(entityId);
        appendChange(new AccountCreated(accountNumber)).apply();
    }

    private Account(AccountId entityId){
        super(entityId);
        subscribe(new AccountChange(this));
    }

    public static Account from(AccountId accountId, List<DomainEvent> events){
        var account = new Account(accountId);
        events.forEach(account::applyEvent);
        return account;
    }

    public void updateSubscriptionCardId(SubscriptionCardId subscriptionCardId){
        Objects.requireNonNull(subscriptionCardId, "The subscription card id can not be null");
        appendChange(new SubscriptionCardIdUpdated(subscriptionCardId)).apply();
    }

    public void updateUserId(UserId userId){
        Objects.requireNonNull(userId, "The user id can not be null");
        appendChange(new UserIdUpdated(userId)).apply();
    }

    public void updateAccountNumber(AccountNumber accountNumber){
        Objects.requireNonNull(accountNumber, "The account number can not be null");
        appendChange(new AccountNumberUpdated(accountNumber)).apply();
    }
}
