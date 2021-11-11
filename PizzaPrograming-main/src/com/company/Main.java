package com.company;
import java.util.Scanner;

import static com.company.Order.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Pizza Project! You will be making you own Pizza!");
        orderCrust(sc);
        orderSauce(sc);
        orderToppings(sc);
        System.out.println("\nThis is your pizza order!" + Order.orderform);
    }
}
