package com.javiercerro.portfolio.banking.web;

import com.javiercerro.portfolio.banking.dto.AccountResponse;
import com.javiercerro.portfolio.banking.dto.OpenAccountRequest;
import com.javiercerro.portfolio.banking.dto.PaymentRequest;
import com.javiercerro.portfolio.banking.dto.PaymentResponse;
import com.javiercerro.portfolio.banking.dto.UpdateAccountRequest;
import com.javiercerro.portfolio.banking.generated.BankingApi;
import com.javiercerro.portfolio.banking.generated.BankingApiDelegate;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Banking (CRUD contract-first)", description = "API bancaria real: OpenAPI + Delegate, CRUD completo sobre cuentas")
public class BankingController implements BankingApi {

    private final BankingApiDelegate delegate;

    public BankingController(BankingApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    @GetMapping("/api/banking/accounts")
    public ResponseEntity<List<AccountResponse>> listAccounts() {
        return delegate.listAccounts();
    }

    @Override
    @GetMapping("/api/banking/accounts/{accountId}")
    public ResponseEntity<AccountResponse> getAccount(@PathVariable String accountId) {
        return delegate.getAccount(accountId);
    }

    @Override
    @PostMapping("/api/banking/accounts")
    public ResponseEntity<AccountResponse> openAccount(@RequestBody OpenAccountRequest request) {
        return delegate.openAccount(request);
    }

    @Override
    @PutMapping("/api/banking/accounts/{accountId}")
    public ResponseEntity<AccountResponse> updateAccount(@PathVariable String accountId, @RequestBody UpdateAccountRequest request) {
        return delegate.updateAccount(accountId, request);
    }

    @Override
    @DeleteMapping("/api/banking/accounts/{accountId}")
    public ResponseEntity<AccountResponse> deleteAccount(@PathVariable String accountId) {
        return delegate.deleteAccount(accountId);
    }

    @Override
    @PostMapping("/api/banking/payments")
    public ResponseEntity<PaymentResponse> createPayment(@RequestBody PaymentRequest request) {
        return delegate.createPayment(request);
    }
}
