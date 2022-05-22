package com.practice.adventureSupermarket.Account;

import co.com.sofka.domain.generic.Entity;
import com.practice.adventureSupermarket.Account.values.*;

import java.util.Objects;

public class User extends Entity<UserId> {

    private UserName userName;
    private Password password;
    private Score score;
    private Email email;

    public User(UserId entityId, UserName userName, Password password, Score score, Email email) {
        super(entityId);
        this.userName = userName;
        this.password = password;
        this.score = score;
        this.email = email;
    }

    public void updateUserName(UserName userName){
        this.userName = Objects.requireNonNull(userName);
    }

    public void updatePassword(Password password){
        this.password = Objects.requireNonNull(password);
    }

    public void updateScore(Score score){
        this.score = Objects.requireNonNull(score);
    }

    public void updateEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public UserName userName() {
        return userName;
    }

    public Password password() {
        return password;
    }

    public Score score() {
        return score;
    }

    public Email email() {
        return email;
    }

}
