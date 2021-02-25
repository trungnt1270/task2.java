package sesion01;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args){
        int orderedShirts, orderesTrouser, points =0;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int costOfShirts, costOfTrousers, totalCost;
        double discount, netPay;
        Scanner input = new Scanner(System.in);

        //Accept the order detals of the customer
        System.out.println("Enter the number of Shirts to order:");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to order:");
        orderesTrouser = input.nextInt();

        //compute the total price of t he order
        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouser * orderesTrouser;
        totalCost = costOfShirts + costOfTrousers;

        //Give a doscpimt pf tem [ercemt pnly if the total cost exceeds $3000
        discount = totalCost > 3000 ? totalCost * 10/100 :0;
        netPay = totalCost - discount;

        //Give one percent of the netPay as points only if the invoice amount exceeds #3000
        points = (int) (netPay > 3000 ? netPay / 100 : 0);

        //Display the invoice details
        System.out.println("\nItem \t\t Quantity \t Price \t Total");
        System.out.println("-----------------------------------------" + "---------------");
        System.out.printf("Shirts \t\t\t %d \t\t %d \t\t %d \n", orderedShirts, priceOfShirt, costOfShirts);
        System.out.printf("Trousers \t\t %d \t\t %d \t\t %d \n", orderesTrouser, priceOfTrouser, costOfTrousers);
        System.out.printf("Discount \t \t\t \t\t\t\t %.2f \n", discount);
        System.out.println("-----------------------------------------" + "---------------");
        System.out.printf("Net Total \t \t\t \t\t\t\t %.2f \n", netPay);
        System.out.println("-----------------------------------------" + "---------------");
        System.out.printf("Points Earned \t %d \n", points);
        System.out.println("Thank you!\n");
    }
}
