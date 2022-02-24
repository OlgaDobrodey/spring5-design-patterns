package com.itrex.chapter2.factory.book;

public class CurrentAccount implements Account {

    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }

}
