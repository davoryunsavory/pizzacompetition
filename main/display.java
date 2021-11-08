package main;

import java.io.*;
import java.util.Scanner;

public class display {

    public static final char ESC = 27;

    public static void main(String argv[]) {
        Console c = System.console();
        c.writer().print(ESC + "[2J");
        c.flush();

        for (int i = 0; i < 100; ++i) {
            // reposition the cursor to 1|1
            c.writer().print(ESC + "[1;1H");
            c.flush();

            c.writer().println("hello " + i);
            c.flush();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread2 thing didnt work");
                e.printStackTrace();
            }
        }

        Scanner sc = new Scanner(System.in);
        gotopage(c, sc);
    }


    public static void updatecount(Console c) {
        c.writer().print("");
    }
    
    public static void gotopage(Console c, Scanner sc) {
        c.writer().print(ESC+"[2J");
        c.writer().print(ESC + "[1;1H");
        c.writer().print("Options\n");
        c.writer().print("1: Select Crust\n");
        c.writer().print("2: Select Sauce\n");
        c.writer().print("3: Select Toppings\n");
        c.writer().print("4: See Current Order\n");
        c.flush();
        int option = validation.val_int(sc, 4, "Not an option", "Select between 1 - 4: ");
        switch(option) {
            case 1: 
            c.writer().print(ESC+"[2J");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.print("Something f up");
                e.printStackTrace();
            }
            crust(c, sc);
                break;
            case 2: 
            c.writer().print(ESC+"[2J");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.print("Something f up");
                e.printStackTrace();
            }
            sauce(c, sc);
                break;
            case 3: 
            c.writer().print(ESC+"[2J");
            toppings(c, sc);
                break;
            case 4: 
            c.writer().print(ESC + "[2J");
            c.writer().println("Going to order");
                gotopage(c, sc);
        }
        c.flush();
    }
    public static void crust(Console c, Scanner sc) {
        c.writer().print(ESC+"[2J");
        c.writer().print(ESC + "[1;1H");
        c.writer().print("Options\n");
        c.writer().print("1: Regular Crust\n");
        c.writer().print("2: Gluten Free Crust\n");
        c.writer().print("3: Go back to menu\n");
        c.flush();

        int option = validation.val_int(sc, 3, "Not an option", "Select between 1 - 3: ");

        switch(option) {
            case 1:
            c.writer().print(ESC+"[2J");
            c.writer().println("regular added");
            crust(c, sc);
                break;
            case 2: 
            c.writer().print(ESC+"[2J");
            c.writer().println("gluten free added");
            crust(c, sc);
                break;
            case 3: 
            gotopage(c, sc);;
                break;
        }
        c.flush();
    }

    public static void sauce(Console c, Scanner sc) {
        c.writer().print(ESC+"[2J");
        c.writer().print(ESC + "[1;1H");
        c.writer().print("Options\n");
        c.writer().print("1: Pizza Sauce\n");
        c.writer().print("2: Garlic Sauce\n");
        c.writer().print("3: Go back to menu\n");
        c.flush();

        int option = validation.val_int(sc, 3, "Not an option", "Select between 1 - 3: ");

        switch(option) {
            case 1:
            c.writer().print(ESC+"[2J");
            c.writer().println("regular added");
            crust(c, sc);
                break;
            case 2: 
            c.writer().print(ESC+"[2J");
            c.writer().println("gluten free added");
            crust(c, sc);
                break;
            case 3: 
            gotopage(c, sc);;
                break;
        }
        c.flush();
    }
    public static void toppings(Console c, Scanner sc) {
        c.writer().print(ESC+"[2J");
        c.writer().print(ESC + "[1;1H");
        c.writer().print("Options\n");
        c.writer().print("1: Pizza Cheese\t2: Diced Onion\t\t3: Diced Green Onion\n");
        c.writer().print("4: Pepporoni\t5: Sliced Mushrooms\t6: Diced Jalepenos\n");
        c.writer().print("7: Sardines\t8: Pinapple Chunks\t9: Tofu\n");
        c.writer().print("10: Ham Chunks\t11: Diced Onion\t\t12: Diced Green Onion\n");
        c.writer().print("13: Go back to menu\n");
        c.flush();

        int option = validation.val_int(sc, 13, "Not an option", "Select between 1 - 13: ");

        switch(option) {
            case 1:
            c.writer().print(ESC+"[2J");
            c.writer().println("Pizza Cheese Added");
            crust(c, sc);
                break;
            case 2: 
            c.writer().print(ESC+"[2J");
            c.writer().println("Diced Onion");
            crust(c, sc);
                break;
            case 13: 
            gotopage(c, sc);;
                break;
        }
        c.flush();
    }
}