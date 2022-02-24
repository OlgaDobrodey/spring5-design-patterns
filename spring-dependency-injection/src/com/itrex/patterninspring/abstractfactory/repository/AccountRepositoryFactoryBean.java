package com.itrex.patterninspring.abstractfactory.repository;

import com.itrex.patterninspring.abstractfactory.FactoryBean;

public class AccountRepositoryFactoryBean implements FactoryBean<IAccountRepository> {
    @Override
    public IAccountRepository getObject() throws Exception {
        return new AccountRepository();
    }
    @Override
    public Class<IAccountRepository> getObjectType() {
        return IAccountRepository.class;
    }
    @Override
    public boolean isSingleton() {
        return false;
    }

}
