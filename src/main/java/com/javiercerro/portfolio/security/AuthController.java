package com.javiercerro.portfolio.security;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Auth", description = "Emisión de JWT de invitado para poder probar los endpoints que escriben estado")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @Operation(summary = "Emite un JWT de invitado válido durante 15 minutos")
    @PostMapping("/demo-token")
    public Map<String, String> demoToken() {
        return Map.of(
                "token", jwtService.issueGuestToken(),
                "tokenType", "Bearer",
                "expiresInSeconds", "900"
        );
    }
}
