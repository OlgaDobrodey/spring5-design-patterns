package com.itrex.patterninspring.abstractfactory;

public interface FactoryBean<T> {
    T getObject() throws Exception;
    Class<T> getObjectType();
    boolean isSingleton();
}

/* imp FactoryBean
- EmbeddedDatabaseFactoryBean;
- JndiObjectFactoryBean;
- LocalContainerEntityManagerFactoryBean;
- DateTimeFormatterFactoryBean;
- ProxyFactoryBean;
- TransactionProxyFactoryBean;
- MethodInvokingFactoryBean
 */
