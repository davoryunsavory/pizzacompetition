package com.company;
import java.util.Scanner;

public class Validation
{
    public static int validateInput(Scanner sc, int min, int max, String errormessage, String promptquesiton)
    {
        int output = 52;
        do {
            if (output == 52) {
                System.out.println(promptquesiton);
            }else {
                System.out.println(errormessage);
            }while (!sc.hasNextInt()) {
                System.out.println(errormessage);
                sc.next();
            }
            output = sc.nextInt();
        }
        while (output < min || output > max);
        return output;
    }
}
