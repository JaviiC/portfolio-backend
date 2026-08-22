package com.javiercerro.portfolio.banking.generated;

import com.javiercerro.portfolio.banking.dto.AccountResponse;
import com.javiercerro.portfolio.banking.dto.OpenAccountRequest;
import com.javiercerro.portfolio.banking.dto.PaymentRequest;
import com.javiercerro.portfolio.banking.dto.PaymentResponse;
import com.javiercerro.portfolio.banking.dto.UpdateAccountRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Interfaz "generada" a partir de resources/contracts/banking-api.yaml.
 * En un proyecto real la produce openapi-generator-maven-plugin en cada build.
 * Regla de oro: esta interfaz NUNCA se edita a mano.
 */
public interface BankingApi {
    ResponseEntity<List<AccountResponse>> listAccounts();
    ResponseEntity<AccountResponse> getAccount(String accountId);
    ResponseEntity<AccountResponse> openAccount(OpenAccountRequest request);
    ResponseEntity<AccountResponse> updateAccount(String accountId, UpdateAccountRequest request);
    ResponseEntity<AccountResponse> deleteAccount(String accountId);
    ResponseEntity<PaymentResponse> createPayment(PaymentRequest request);
}
