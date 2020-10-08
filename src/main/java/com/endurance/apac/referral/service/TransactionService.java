package com.endurance.apac.referral.service;

import com.endurance.apac.referral.model.Transaction;
import com.endurance.apac.referral.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Map<UUID, Transaction> getAllTransactions(){
        return transactionRepository.getAllTransactions();
    }

    public Transaction getTransactionByID(UUID uuid){
        return transactionRepository.getTransactionByID(uuid);
    }

    public Boolean addTransaction(Transaction transaction){

        return transactionRepository.addTransaction(transaction);
    }
}
