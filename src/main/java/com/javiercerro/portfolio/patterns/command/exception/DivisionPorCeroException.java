package com.javiercerro.portfolio.patterns.command.exception;

public class DivisionPorCeroException extends RuntimeException {

    public DivisionPorCeroException(){
        super("No se puede dividir por cero");
    }

}
