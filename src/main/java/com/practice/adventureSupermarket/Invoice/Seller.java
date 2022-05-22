package com.practice.adventureSupermarket.Invoice;

import co.com.sofka.domain.generic.Entity;
import com.practice.adventureSupermarket.Invoice.values.Identification;
import com.practice.adventureSupermarket.Invoice.values.Name;
import com.practice.adventureSupermarket.Invoice.values.Retribution;
import com.practice.adventureSupermarket.Invoice.values.SellerId;

import java.util.Objects;

public class Seller extends Entity<SellerId> {

    private Identification identification;
    private Name name;
    private Retribution retribution;

    public Seller(SellerId entityId, Identification identification, Name name, Retribution retribution) {
        super(entityId);
        this.identification = identification;
        this.name = name;
        this.retribution = retribution;
    }

    public void updateIdentification(Identification identification){
        this.identification = Objects.requireNonNull(identification, "The identification is null, It is required");
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name, "The name is null, It is required");
    }

    public void giveRetribution(Retribution retribution){
        this.retribution = Objects.requireNonNull(retribution, "You can not give a null retribution, It is required");
    }

    public Identification identification(){
        return identification;
    }

    public Name name(){
        return name;
    }

    public Retribution retribution(){
        return  retribution;
    }
}
