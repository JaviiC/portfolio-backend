package com.javiercerro.portfolio.patterns.command.exception;

public class TypeNotValidException extends RuntimeException {

    public TypeNotValidException(String type){
        super("El tipo de operación " + "[" + type + "]" + " no es válido");
    }

}
