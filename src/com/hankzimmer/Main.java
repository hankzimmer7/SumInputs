package com.hankzimmer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        //Continue taking in user inputs until 10 numbers have been input
        while (i <= 10) {
            System.out.println("Enter number #" + i + ":");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Input");
                scanner.next();
            }
            scanner.nextLine();
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
