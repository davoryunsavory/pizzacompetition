package com.company;
import java.util.Scanner;
import static com.company.Validation.validateInput;

public class Print
{
    public static void printcup(Scanner sc)
    {
        int option = validateInput(sc, 1, 2,"Not an option Select between 1 or 2", "");

        switch(option)
        {
            case 1:
                System.out.print("You choose 1/4 cup of ");
                break;
            case 2:
                System.out.print("You choose 1/2 cup of ");
                break;
        }
    }

    public static String printChoose()
    {
        return "Please choose one amount\n1: 1/4 cup \t\t 2: 1/2 cup";
    }

    public static void border (int length)
    {
        for (int i = 0; i < length; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
