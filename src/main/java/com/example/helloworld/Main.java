package com.example.helloworld;

import java.util.Scanner;

public class Main {
    public String sayHello() {
        return "Hello, World!";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your major: ");
        String major = scanner.nextLine();

        System.out.print("Hello, " + name + " Congratulations on your " + major + " major!");

        scanner.close();
    }
}
