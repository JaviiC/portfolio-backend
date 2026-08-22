package com.javiercerro.portfolio.banking.domain;

import java.time.LocalDateTime;

/**
 * Entidad de dominio simple, a propósito SIN ningún patrón de diseño "de
 * escaparate": en una API bancaria real, la mayoría del código es así de
 * directo. Los patrones con vocación pedagógica viven aparte, en `patterns`.
 */
public class BankAccount {
    private final String accountId;
    private String holderId;
    private String accountType;
    private AccountStatus status;
    private final LocalDateTime openedAt;

    public BankAccount(String accountId, String holderId, String accountType) {
        this.accountId = accountId;
        this.holderId = holderId;
        this.accountType = accountType;
        this.status = AccountStatus.ACTIVE;
        this.openedAt = LocalDateTime.now();
    }

    public void update(String holderId, String accountType, AccountStatus status) {
        this.holderId = holderId;
        this.accountType = accountType;
        this.status = status;
    }

    public String accountId() { return accountId; }
    public String holderId() { return holderId; }
    public String accountType() { return accountType; }
    public AccountStatus status() { return status; }
    public LocalDateTime openedAt() { return openedAt; }
}
