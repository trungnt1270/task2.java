package sesion01;

import java.util.Scanner;

public class Account2 {
    public static void main(String[] args){
        double accountBalance = 10000.00;
        double withdraw = 0.00;
        boolean possible = false;
        String cusname;

        System.out.printf("Available accpimt balance : $%.2f \n", accountBalance);
        System.out.println("Enter the Amount to withdraw: $");
        Scanner scan = new Scanner(System.in);
        // withdraw = scan.nextDouble();
        withdraw = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the Customer Name: ");
        cusname = scan.nextLine();


        possible = (accountBalance > withdraw);
        accountBalance = possible ? accountBalance - withdraw : accountBalance;
        System.out.println("Wellcome " + cusname);
        System.out.printf("\n Current account balance: $%.2f", accountBalance);
        System.out.println("\nTransaction Successful: " + possible);
    }
}
