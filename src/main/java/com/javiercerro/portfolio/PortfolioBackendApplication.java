package com.javiercerro.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Backend real del portfolio de Javier del Cerro de Nava, organizado en 4 paquetes
 * independientes para no mezclar código de producción con ejemplos didácticos:
 *  - security/  -> JWT + Spring Security, compartido por toda la API
 *  - banking/   -> API bancaria contract-first (OpenAPI + Delegate), CRUD completo, la más parecida a Santander
 *  - migration/ -> ejemplo simple de migración de un flujo MuleSoft a Java nativo
 *  - patterns/  -> Factory, Singleton, Observer, Strategy, Command, State y Builder — Java puro, sin
 *                  dependencia de Spring ni exposición HTTP: solo se muestran, no se ejecutan en la web
 */
@SpringBootApplication
public class PortfolioBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortfolioBackendApplication.class, args);
    }
}
