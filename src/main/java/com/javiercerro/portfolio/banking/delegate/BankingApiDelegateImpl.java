package com.javiercerro.portfolio.banking.delegate;

import com.javiercerro.portfolio.banking.domain.AccountStatus;
import com.javiercerro.portfolio.banking.domain.BankAccount;
import com.javiercerro.portfolio.banking.dto.AccountResponse;
import com.javiercerro.portfolio.banking.dto.OpenAccountRequest;
import com.javiercerro.portfolio.banking.dto.PaymentRequest;
import com.javiercerro.portfolio.banking.dto.PaymentResponse;
import com.javiercerro.portfolio.banking.dto.UpdateAccountRequest;
import com.javiercerro.portfolio.banking.generated.BankingApiDelegate;
import com.javiercerro.portfolio.banking.repository.AccountRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Aquí vive la lógica de negocio real. Así se estructuró, pieza a pieza,
 * cada microservicio migrado de MuleSoft a Java nativo en el proyecto de
 * Santander USA: contrato -> Api generada -> Delegate -> esta clase.
 */
@Service
public class BankingApiDelegateImpl implements BankingApiDelegate {

    private final AccountRepository repository;

    public BankingApiDelegateImpl(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<List<AccountResponse>> listAccounts() {
        return ResponseEntity.ok(repository.findAll().stream().map(AccountResponse::from).toList());
    }

    @Override
    public ResponseEntity<AccountResponse> getAccount(String accountId) {
        return ResponseEntity.ok(AccountResponse.from(repository.findById(accountId)));
    }

    @Override
    public ResponseEntity<AccountResponse> openAccount(OpenAccountRequest request) {
        String accountId = "CTA-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
        BankAccount account = new BankAccount(accountId, request.holderId(), request.accountType());
        repository.save(account);
        return ResponseEntity.ok(AccountResponse.from(account));
    }

    @Override
    public ResponseEntity<AccountResponse> updateAccount(String accountId, UpdateAccountRequest request) {
        BankAccount account = repository.findById(accountId);
        account.update(request.holderId(), request.accountType(), AccountStatus.valueOf(request.status().toUpperCase()));
        return ResponseEntity.ok(AccountResponse.from(account));
    }

    @Override
    public ResponseEntity<AccountResponse> deleteAccount(String accountId) {
        BankAccount removed = repository.deleteById(accountId);
        return ResponseEntity.ok(AccountResponse.from(removed));
    }

    @Override
    public ResponseEntity<PaymentResponse> createPayment(PaymentRequest request) {
        if (request.amount() == null || request.amount().signum() <= 0) {
            return ResponseEntity.badRequest().body(new PaymentResponse(null, "REJECTED", "java-native"));
        }
        repository.findById(request.accountId());
        String paymentId = "PAY-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        return ResponseEntity.ok(new PaymentResponse(paymentId, "ACCEPTED", "java-native"));
    }
}
