package com.appFinance.finance.repositories;

import com.appFinance.finance.model.Wallet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletsRepository extends MongoRepository<Wallet, String> {
}
