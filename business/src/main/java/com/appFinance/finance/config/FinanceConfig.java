package com.appFinance.finance.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.appFinance.finance.repositories",
        mongoTemplateRef = "FinanceTemplate")
public class FinanceConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "mongodb.financedb")
    public MongoProperties getFinanceProps() {
        return new MongoProperties();
    }

    @Bean(name = "FinanceTemplate")
    public MongoTemplate financeTemplate() {
        return new MongoTemplate(financeFactory(getFinanceProps()));
    }

    public MongoDatabaseFactory financeFactory(MongoProperties financeProps) {
        return new SimpleMongoClientDatabaseFactory(financeProps.getUri());
    }
}
