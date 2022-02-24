package main.com.packt.patterninspring.chapter8.bankapp.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author Dinesh.Rajput
 */
@Configuration
@EnableTransactionManagement
public class InfrastructureConfig {

    //have infrastructure related beans like DataSource, JNDI, etc.
    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2);//in-memory
        builder.addScript("schema.sql");
        builder.addScript("data.sql");
        return builder.build();
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan("main.com.packt.patterninspring.chapter8.bankapp.model");
        Properties props = new Properties();
        props.setProperty(Environment.DIALECT, "org.hibernate.dialect.H2Dialect");
        sfb.setHibernateProperties(props);
        return sfb;
    }

    @Bean //implementation
    public PlatformTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }

//    @Bean
//    public BeanPostProcessor persistenceTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }

}
