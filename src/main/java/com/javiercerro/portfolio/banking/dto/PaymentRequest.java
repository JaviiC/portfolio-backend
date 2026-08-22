package com.javiercerro.portfolio.banking.dto;

import java.math.BigDecimal;

public record PaymentRequest(String accountId, BigDecimal amount, String currency) {}
