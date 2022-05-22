package com.practice.adventureSupermarket.Account.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.practice.adventureSupermarket.Account.values.UserId;

public class UserIdUpdated extends DomainEvent {

    private final UserId userId;

    public UserIdUpdated(UserId userId) {
        super("practice.account.useridupdated");
        this.userId = userId;
    }

    public UserId getUserId() {
        return userId;
    }
}
