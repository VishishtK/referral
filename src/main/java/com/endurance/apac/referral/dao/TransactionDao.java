package com.endurance.apac.referral.dao;

import com.endurance.apac.referral.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class TransactionDao {
    private Map<UUID, Transaction> DB = new HashMap<>();

    public Map<UUID, Transaction> getAllTransactions(){
        return DB;
    }

    public Transaction getTransactionByID(UUID uuid){
        return DB.get(uuid);
    }

    public Boolean addTransaction(Transaction transaction){
        DB.put(transaction.getUuid(), transaction);
        return Boolean.TRUE;
    }
}
