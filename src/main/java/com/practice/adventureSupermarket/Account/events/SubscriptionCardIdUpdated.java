package com.practice.adventureSupermarket.Account.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Account.values.SubscriptionCardId;

public class SubscriptionCardIdUpdated extends DomainEvent {

    private final SubscriptionCardId subscriptionCardId;

    public SubscriptionCardIdUpdated(SubscriptionCardId subscriptionCardId) {
        super("practice.account.subscriptioncardidupdated");
        this.subscriptionCardId = subscriptionCardId;
    }

    public SubscriptionCardId getSubscriptionCardId() {
        return subscriptionCardId;
    }
}
