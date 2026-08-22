package com.javiercerro.portfolio.banking.web;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@RestController
public class ContractController {

    @Operation(summary = "Devuelve el contrato OpenAPI del que salen BankingApi y BankingApiDelegate")
    @GetMapping(value = "/api/banking/contract", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> contract() throws Exception {
        try (InputStream is = new ClassPathResource("contracts/banking-api.yaml").getInputStream()) {
            return ResponseEntity.ok(new String(is.readAllBytes(), StandardCharsets.UTF_8));
        }
    }
}
