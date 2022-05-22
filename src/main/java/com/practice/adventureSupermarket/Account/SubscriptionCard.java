package com.practice.adventureSupermarket.Account;

import co.com.sofka.domain.generic.Entity;
import com.practice.adventureSupermarket.Account.values.Code;
import com.practice.adventureSupermarket.Account.values.ExpiryDate;
import com.practice.adventureSupermarket.Account.values.Money;
import com.practice.adventureSupermarket.Account.values.SubscriptionCardId;

import java.util.Objects;

public class SubscriptionCard extends Entity<SubscriptionCardId> {

    private Code code;
    private ExpiryDate expiryDate;
    private Money money;

    public SubscriptionCard(SubscriptionCardId entityId, Code code, ExpiryDate expiryDate, Money money) {
        super(entityId);
        this.code = code;
        this.expiryDate = expiryDate;
        this.money = money;
    }

    public void updateCode(Code code){
        this.code = Objects.requireNonNull(code);
    }

    public void changeExpiryDate(ExpiryDate expiryDate){
        this.expiryDate = Objects.requireNonNull(expiryDate);
    }

    public void updateMoney(Money money){
        this.money = Objects.requireNonNull(money);
    }

    public Code code() {
        return code;
    }

    public ExpiryDate expiryDate() {
        return expiryDate;
    }

    public Money money() {
        return money;
    }

}
