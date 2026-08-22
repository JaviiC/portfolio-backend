package com.javiercerro.portfolio.patterns.command;

import com.javiercerro.portfolio.patterns.command.entity.Calculator;
import com.javiercerro.portfolio.patterns.command.manager.CommandManager;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Calculator c = Calculator.getInstance();
        CommandManager manager = new CommandManager();

        String answer;
        while (!(answer = sc.nextLine()).equalsIgnoreCase("end")) {
            manager.registrarOperacion(answer);
            double total = manager.execute();
            System.out.println("TOTAL: " + total);
        }

    }

}
