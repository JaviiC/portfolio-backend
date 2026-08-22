package com.javiercerro.portfolio.patterns.command.entity;

public class UniqueOperation extends Operation{

    private Integer value;

    public UniqueOperation(String[] operation){
        super();
        if(Character.isDigit(operation[0].charAt(0))){
            this.operation = operation[1];
            this.value = Integer.parseInt(operation[0]);
        } else {
            this.operation = operation[0];
            this.value = Integer.parseInt(operation[1]);
        }
    }

    public Integer getValue(){
        return value;
    }

}
