package com.java.davoryunsavory.PizzaComp;

import java.util.Scanner;

public class Main {

    public static int validateInput(Scanner sc, int max, String errormessage) {
        int output = 0;
        do {
            System.out.println("enter quantity <" + max + ": ");

            while (sc.hasNextInt() == false) {
                System.out.println(errormessage);
                sc.next();
            }
            output = sc.nextInt();
        } while (output > max);

        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(validateInput(sc, 4, "Error Try Again") + validateInput(sc, 4, "Error Try Again"));
    }
}
