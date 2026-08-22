package com.javiercerro.portfolio.migration.web;

import com.javiercerro.portfolio.migration.java.PaymentValidationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/api/migration")
@Tag(name = "Migración MuleSoft -> Java", description = "Antes (flujo Mule ilustrativo) y después (Java nativo) de la misma validación")
public class MigrationController {

    private final PaymentValidationService validationService;

    public MigrationController(PaymentValidationService validationService) {
        this.validationService = validationService;
    }

    @Operation(summary = "Flujo de Mule original (ilustrativo), tal cual antes de migrar")
    @GetMapping(value = "/legacy-flow", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> legacyFlow() throws Exception {
        try (InputStream is = new ClassPathResource("legacy/payment-validation-flow.xml").getInputStream()) {
            return ResponseEntity.ok(new String(is.readAllBytes(), StandardCharsets.UTF_8));
        }
    }

    public record ValidateRequest(String accountId, BigDecimal amount, String currency) {}

    @Operation(summary = "La misma validación, ya migrada a Java nativo. Requiere JWT")
    @PostMapping("/validate-payment")
    public PaymentValidationService.ValidationResult validate(@RequestBody ValidateRequest req) {
        return validationService.validate(req.accountId(), req.amount(), req.currency());
    }
}
