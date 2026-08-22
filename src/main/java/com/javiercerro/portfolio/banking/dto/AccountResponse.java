package com.javiercerro.portfolio.banking.dto;

import com.javiercerro.portfolio.banking.domain.BankAccount;

import java.time.LocalDateTime;

public record AccountResponse(String accountId, String holderId, String accountType, String status, LocalDateTime openedAt) {
    public static AccountResponse from(BankAccount account) {
        return new AccountResponse(account.accountId(), account.holderId(), account.accountType(),
                account.status().name(), account.openedAt());
    }
}
