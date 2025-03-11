package com.example.helloworld;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public String sayHello() {

        return "Hello, World!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Program started");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        logger.info("Name entered: " + name);


        System.out.println("Enter your major: ");
        String major = scanner.nextLine();
        logger.info("Major entered: " + major);

        System.out.println("Hello, " + name + " Congratulations on your " + major + " major!");
        logger.info("Greeting displayed");


        scanner.close();
        logger.info("Scanner closed");
        System.out.println("Program has ended.");
        logger.info("Program ended");

        System.exit(0);
    }
}
