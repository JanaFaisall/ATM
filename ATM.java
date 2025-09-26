package atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter passcode : ");
        int password = input.nextInt();
        final int credit = 100;
        if (password != 1234) {
            System.out.println("Wrong Passcode");
        } else {
            System.out.println("Your Credit : " + credit);
            System.out.println("Enter Service No :\n1. Withdraw\n2. Deposit");
            double num = input.nextInt();

            if (num == 1) {
                System.out.println("Enter Amount you want to Withdraw: ");
                double Withdraw = input.nextDouble();
                double result = credit - Withdraw;
                System.out.printf("Your Credit : %.0f ", result);
            } else {
                System.out.println("Enter Amount you want to Deposit: ");
                double Deposit = input.nextDouble();
                double result = credit + Deposit;
                System.out.printf("Your Credit : %.0f ", result); 
            }
        }

    }
}
