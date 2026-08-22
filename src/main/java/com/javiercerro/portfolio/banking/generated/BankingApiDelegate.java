package com.javiercerro.portfolio.banking.generated;

import com.javiercerro.portfolio.banking.dto.AccountResponse;
import com.javiercerro.portfolio.banking.dto.OpenAccountRequest;
import com.javiercerro.portfolio.banking.dto.PaymentRequest;
import com.javiercerro.portfolio.banking.dto.PaymentResponse;
import com.javiercerro.portfolio.banking.dto.UpdateAccountRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * DELEGATE — el patrón que usa openapi-generator en modo contract-first.
 * El contrato se regenera solo cuando cambia el YAML; esta interfaz no se toca.
 */
public interface BankingApiDelegate {
    ResponseEntity<List<AccountResponse>> listAccounts();
    ResponseEntity<AccountResponse> getAccount(String accountId);
    ResponseEntity<AccountResponse> openAccount(OpenAccountRequest request);
    ResponseEntity<AccountResponse> updateAccount(String accountId, UpdateAccountRequest request);
    ResponseEntity<AccountResponse> deleteAccount(String accountId);
    ResponseEntity<PaymentResponse> createPayment(PaymentRequest request);
}
