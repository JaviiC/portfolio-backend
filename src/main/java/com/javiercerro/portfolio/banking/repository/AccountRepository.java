package com.javiercerro.portfolio.banking.repository;

import com.javiercerro.portfolio.banking.domain.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class AccountRepository {

    private final Map<String, BankAccount> accounts = new ConcurrentHashMap<>();

    public BankAccount save(BankAccount account) {
        accounts.put(account.accountId(), account);
        return account;
    }

    public BankAccount findById(String accountId) {
        BankAccount account = accounts.get(accountId);
        if (account == null) throw new NoSuchElementException("No existe la cuenta " + accountId);
        return account;
    }

    public BankAccount deleteById(String accountId) {
        BankAccount removed = accounts.remove(accountId);
        if (removed == null) throw new NoSuchElementException("No existe la cuenta " + accountId);
        return removed;
    }

    public Collection<BankAccount> findAll() {
        return accounts.values();
    }
}
