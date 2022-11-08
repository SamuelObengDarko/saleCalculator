import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Hello world!");

        //Declaration of variables
        String fName;
        String lName;
        String item;
        double purchase;
        double stateSalesTax = 0.04;
        double countySalesTax = 0.02;
        double totalSalesTax;
        double totalSale;

        //Accept user's firstname
        System.out.println("Enter your firstname:");
        fName = sc.nextLine();

        //Accept user's lastname
        System.out.println("Enter your lastname:");
        lName = sc.nextLine();

        //Accept the name of item the user is purchasing
        System.out.println("Enter the item you want to purchase:");
        item = sc.nextLine();

        //Accept the amount of the item purchasing
        System.out.println("Enter the amount of purchase:");
        purchase = sc.nextDouble();

        //Calculate the total sales tax
        totalSalesTax = stateSalesTax + countySalesTax;
        totalSale = purchase + totalSalesTax;

        //Display amount of purchased
        System.out.println("Amount of purchase = " + purchase);

        //Display state sales tax
        System.out.println("State sales tax = " + stateSalesTax);

        //Display county sales tax
        System.out.println("County sales tax = " + countySalesTax);

        //Display total sales tax
        System.out.println("The total sales tax = " + totalSalesTax);

        //Display total sale
        System.out.println("Hello, " + fName + " the total sale of the " + item  + " is " + totalSale);
    }
}