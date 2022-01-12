package com.itrex.chapter2.factory.book;

public class FactoryPatterMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        // getting an object of the SavingAccount class and call method getAccount
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType();
        // getting an object of the CurrentAccount and call method getAccount
        Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType();
    }
}
    /*
    return
    SAVING ACCOUNT
    CURRENT ACCOUNT
     */