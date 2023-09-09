import ATM.Account;
import ATM.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int command = 0;

        while (command == 0){
            System.out.println("====Select in option====");
            System.out.println("1 - Registration");
            System.out.println("2 - Sign in\n");
            while (command < 1 || command > 2){
                System.out.println("Type your choice: ");
                command = sc.nextInt();
            }
        }
        switch (command){
            case 1:
                System.out.println("====Creat new account====");
                System.out.println("Enter your first name: ");
                String firstName = sc.next().trim();
                System.out.println("Enter your second name: ");
                String secondName = sc.next().trim();

                Account account = new Account(firstName, secondName);
                account.createAccount();
                break;
            case 2:
                System.out.println("====Sign in====");
                System.out.println("Enter your card number: ");
                String cardNumber = sc.next();
                System.out.println("Enter your pin code: ");
                String pin = sc.next();

                Operation operation = new Operation(cardNumber, pin);

                break;
            default:
                System.out.println("Sorry, there is no such func yet");
        }
    }
}