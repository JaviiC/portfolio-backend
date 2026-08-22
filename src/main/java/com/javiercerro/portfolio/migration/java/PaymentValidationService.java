package com.javiercerro.portfolio.migration.java;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Misma validación que antes vivía en el flujo de Mule (transform-message +
 * choice), ahora como Java plano: testeable con JUnit, sin runtime de Mule,
 * sin DataWeave — un método normal.
 */
@Service
public class PaymentValidationService {

    public record ValidationResult(String status, String reason) {}

    public ValidationResult validate(String accountId, BigDecimal amount, String currency) {
        if (accountId == null || accountId.isBlank()) {
            return new ValidationResult("REJECTED", "accountId es obligatorio");
        }
        if (amount == null || amount.signum() <= 0) {
            return new ValidationResult("REJECTED", "importe inválido");
        }
        String finalCurrency = (currency == null || currency.isBlank()) ? "USD" : currency;
        return new ValidationResult("ACCEPTED", "validado en " + finalCurrency);
    }
}
