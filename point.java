package sesion01;

import java.util.Scanner;

public class point {
    public static void  main(String[] args){
        double point1, point2, point3, avg;
        String name;

        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("Enter your point1:");
        point1 = scan.nextDouble();
        System.out.println("Enter your point2:");
        point2 = scan.nextDouble();
        System.out.println("Enter your point3:");
        point3 = scan.nextDouble();
        avg = (point1 + point2 + point3)/3;

        System.out.println("Your name is: " + name );
        System.out.println("Your point is : \nPoint1: " + point1 + "\nPoint2: " + point2 + "\nPoint3: " + point3);
        System.out.println("Avg is: " + avg);
    }
}
