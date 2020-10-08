package com.endurance.apac.referral.controller;

import com.endurance.apac.referral.model.Transaction;
import com.endurance.apac.referral.repository.TransactionRepository;
import com.endurance.apac.referral.service.ReferralCouponService;
import com.endurance.apac.referral.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RequestMapping("api/transaction")
@RestController
public class TransactionController {

    private final TransactionService transactionService;
    private final ReferralCouponService referralCouponService;

    @Autowired
    public TransactionController(TransactionService transactionService, ReferralCouponService referralCouponService) {
        this.transactionService = transactionService;
        this.referralCouponService = referralCouponService;
    }

    @GetMapping
    public Map<UUID, Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }

    @GetMapping(path = "{uuid}")
    public Transaction getTransactionByID(@PathVariable("uuid") UUID uuid){
        return transactionService.getTransactionByID(uuid);
    }

    @PostMapping
    public Boolean addTransaction(@RequestBody Transaction transaction){
        referralCouponService.increaseUsage(transaction.getCode());
        return transactionService.addTransaction(transaction);
    }

    @DeleteMapping(path = "{id}")
    public Boolean deleteTransaction(@PathVariable("id") UUID uuid){
        return Boolean.TRUE;
    }
}
