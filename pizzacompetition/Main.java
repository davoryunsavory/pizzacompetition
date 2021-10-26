import java.util.Scanner;

public class Main {

    public static int validateInput(Scanner sc, int max, String errormessage, String promptquesiton) {
        int output = 0;
        do {
            System.out.println(promptquesiton);

            while (sc.hasNextInt() == false) {
                System.out.println(errormessage);
                sc.next();
            }
            output = sc.nextInt();
        } while (output > max);

        return output;
    }

    public static boolean validateUser(Scanner sc, String errormessage) {
        String user = "admin";
        String pass = "admin";
        boolean active = true;
        boolean valid = false;

        

        while (active == true) {
            System.out.print("input username: ");
            String inputUser = sc.nextLine();
            System.out.print("input password: ");
            String inputPass = sc.nextLine();
            if (inputUser.equals(user) && inputPass.equals(pass)) {
                active = false;
                valid = true;
            } else {
                System.out.print(errormessage);
            }
        }        
        return valid;
    }

    public static void login(Scanner sc) {
        System.out.print("Would you like to login or register? (l or r) ");
        if (sc.nextLine().equals("l")) {
            if (validateUser(sc, "incorrect credentials try again\n") == true) {
                System.out.println("You have logged in\n");
            }
        }
    }

    public static void border (int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void order(Scanner sc) {
        border(50);
        System.out.println("Options");
        System.out.println("1: Select Crust");
        System.out.println("2: Select Sauce");
        System.out.println("3: Select Toppings");
        int option = validateInput(sc, 3, "Not an option", "Select between 1 - 3: ");
        System.out.print("\n");
        
        switch(option) {
            case 1: orderCrust(sc);
                break;
            case 2: orderSauce(sc);
                break;
            case 3: orderToppings(sc);
                break;
        }

    }

    public static void orderCrust(Scanner sc) {
        System.out.println("Entered Crust");
        border(50);
        System.out.println("Options");
        System.out.println("1: Regular Crust");
        System.out.println("2: Gluten Free Crust");
        System.out.println("3: Return to Order Menu");

        int option = validateInput(sc, 3, "Not an option", "Select between 1 - 3: ");
        System.out.print("\n");

        switch(option) {
            case 1: System.out.println("Regular Crust Added");
                break;
            case 2: System.out.println("Gluten Free Crust Added");
                break;
            case 3: order(sc);;
                break;
        }
    }

    public static void orderSauce(Scanner sc) {
        System.out.println("Entered Sauce");

    }

    public static void orderToppings(Scanner sc) {
        System.out.println("Entered Toppings");

    }

    public static void main(String[] args) {
        String[] order = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        login(sc);
        order(sc);
    }
        
}