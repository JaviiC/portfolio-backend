package com.javiercerro.portfolio.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.Map;

/**
 * Emisión y validación de JWT de demostración (jjwt 0.12.x, API fluida moderna).
 * La clave vive solo en memoria y se regenera en cada arranque: es una demo pública,
 * no un sistema de autenticación real. En producción viviría en un Secret de OpenShift.
 */
@Service
public class JwtService {

    private final SecretKey key = Jwts.SIG.HS256.key().build();
    private static final long EXPIRATION_MS = 15 * 60 * 1000; // 15 minutos

    public String issueGuestToken() {
        Date now = new Date();
        Date expiry = new Date(now.getTime() + EXPIRATION_MS);
        return Jwts.builder()
                .subject("visitante-invitado")
                .claims(Map.of("role", "GUEST", "scope", "lab:write"))
                .issuedAt(now)
                .expiration(expiry)
                .signWith(key)
                .compact();
    }

    public Claims parse(String token) {
        return Jwts.parser().verifyWith(key).build()
                .parseSignedClaims(token).getPayload();
    }
}
