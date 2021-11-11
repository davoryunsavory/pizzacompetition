package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import static com.company.Validation.validateInput;

public class Order
{
    public static ArrayList<String> orderform = new ArrayList<>();

    public static void orderCrust(Scanner sc)
    {
        Print.border(75);
        System.out.println("Please Choose One Crust Option");
        System.out.println("Options");
        System.out.println("1: Regular Crust");
        System.out.println("2: Gluten Free Crust");

        int option = validateInput(sc, 1, 2, "Not an option", "Choose either 1 or 2");
        switch(option)
        {
            case 1:
                System.out.println("REGULAR CRUST ADDED");
                orderform.add("Regular Crust");
                break;
            case 2:
                System.out.println("GLUTEN FREE CRUST ADDED");
                orderform.add("Gluten Free Crust");
                break;
        }
    }

    public static void orderSauce(Scanner sc)
    {
        Print.border(75);
        System.out.println("Please Choose One Sauce Option");
        System.out.println("1: White Sauce 2: Tomato Sauce 3: Balsamic Vinegar");

        int option = validateInput(sc, 1, 3,"Not an option", "Select between 1-3");
        switch(option)
        {
            case 1:
                System.out.println("WHITE SAUCE ADDED");
                orderform.add("White Sauce");
                Print.border(75);
                break;
            case 2:
                System.out.println("TOMATO SAUCE ADDED");
                orderform.add("Tomato Sauce");
                Print.border(75);
                break;
            case 3:
                System.out.println("BALSAMIC VINEGAR ADDED");
                orderform.add("Balsamic Vinegar");
                Print.border(75);
                break;
        }

    }

    public static void orderToppings(Scanner sc)
    {
        boolean keepGoing = true;
        String userInput;
        while(keepGoing) {
            System.out.println("Please choose one ingredient option");
            System.out.println("1: pizza cheese \t 2: Diced onion \t   3: Diced Green pepper\n4: Pepperoni \t     5: Sliced mushroom    6: Diced jalapenos \n7: Sardines \t \t 8: Pineapple Chunks   9: Tofu \n10: Ham Chunks \t \t 11: Dry red pepper    12: Dried Basil");

            int option = validateInput(sc, 1, 12, "Not an option select either 1 to 12", "Select between 1-12");
            switch(option)
            {
                case 1:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Pizza Cheese")) {
                        System.out.println("\n");
                        orderform.add("Pizza Cheese");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR PIZZA CHEESE\n");
                    }
                    Print.border(75);
                    break;
                case 2:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Diced Onions")) {
                        System.out.println("\n");
                        orderform.add("Diced Onions");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR DICED ONIONS\n");
                    }
                    Print.border(75);
                    break;
                case 3:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Diced Green Onions")) {
                        System.out.println("\n");
                        orderform.add("Diced Green Onions");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR DICED GREEN ONIONS\n");
                    }
                    Print.border(75);
                    break;
                case 4:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Pepperoni")) {
                        System.out.println("\n");
                        orderform.add("Pepperoni");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR PEPPERONI \n");
                    }
                    Print.border(75);
                    break;
                case 5:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Sliced Mushrooms")) {
                        System.out.println("\n");
                        orderform.add("Sliced Mushrooms");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR SLICED MUSHROOMS\n");
                    }
                    Print.border(75);
                    break;
                case 6:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Diced Jalapenos")) {
                        System.out.println("\n");
                        orderform.add("Diced Jalapenos");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR DICED JALAPENOS\n");
                    }
                    Print.border(75);
                    break;
                case 7:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Sardines")) {
                        System.out.println("\n");
                        orderform.add("Sardines");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR SARDINES\n");
                    }
                    Print.border(75);
                    break;
                case 8:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Pineapple Chunks")) {
                        System.out.println("\n");
                        orderform.add("Pineapple Chunks");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR PINEAPPLE CHUNKS\n");
                    }
                    Print.border(75);
                    break;
                case 9:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Tofu")) {
                        System.out.println("\n");
                        orderform.add("Tofu");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR TOFU\n");
                    }
                    Print.border(75);
                    break;
                case 10:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Ham Chunks")) {
                        System.out.println("\n");
                        orderform.add("Ham Chunks");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR HAM CHUNKS\n");
                    }
                    Print.border(75);
                    break;
                case 11:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Dry Red Pepper"))
                    {
                        System.out.println("\n");
                        orderform.add("Dry Red Pepper");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR DRY RED PEPPER\n");
                    }
                    Print.border(75);
                    break;
                case 12:
                    System.out.println(Print.printChoose());
                    Print.printcup(sc);
                    if (Check.checkifavaliable("Dry Basil")) {
                        System.out.println("\n");
                        orderform.add("Dry Basil");
                    }else {
                        System.out.println("REACHED MAX INGREDIENTS FOR DRY BASIL\n");
                    }
                    Print.border(75);
                    break;

            }
            System.out.println("\nDo you want to keep going? (yes or no)");
            userInput = sc.next();
            keepGoing = userInput.equalsIgnoreCase("yes");
        }
    }
}
