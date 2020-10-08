package com.endurance.apac.referral.repository;

import com.endurance.apac.referral.dao.TransactionDao;
import com.endurance.apac.referral.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;

@Repository
public class TransactionRepository {

    private final TransactionDao transactionDao;

    @Autowired
    public TransactionRepository(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public Map<UUID, Transaction> getAllTransactions(){
        return transactionDao.getAllTransactions();
    }

    public Transaction getTransactionByID(UUID uuid){
        return transactionDao.getTransactionByID(uuid);
    }

    public Boolean addTransaction(Transaction transaction){
        return transactionDao.addTransaction(transaction);
    }
}
