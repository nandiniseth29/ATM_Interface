import java.util.Scanner;

public class Atmtrans {
    public static void main(String args[]) {
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to your favourite Automated Teller Machine! Kindly help us by selecting any one of the following options to help you!");
            System.out.println("Choose 1 for Withdrawal of Money");
            System.out.println("Choose 2 for Deposit of Money ");
            System.out.println("Choose 3 to Check Account Balance ");
            System.out.println("Choose 4 to EXIT");
            System.out.print("Enter the operation you want to perform:");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter  the amount of money to be withdrawn:");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited!");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);

                     

            }
            System.out.println("THANK YOU. WISH TO SEE YOU SOON AGAIN ! :)");
        }
          
    }
}