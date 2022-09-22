import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator
{
    public static void main(String[]args)
    {
       // Importing
        Scanner question = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        double price = 0;
        double totalB4Tip = 0;
        double totalTip = 0;


        System.out.println("");
        System.out.println("Welcome to the tip calculator!");
        System.out.println("");
        System.out.print("How many people are in your group? ");
        int partySize = question.nextInt();

        System.out.print("What is the tip percentage? (0 - 100): ");
        int tip = question.nextInt();

        while (price != -1)
        {
            System.out.print("Enter the cost of an item in dollars and cents (Type -1 to End): ");
            price = question.nextDouble();
            totalB4Tip += price;
            System.out.println("");
        }
        totalB4Tip ++;

        System.out.println("--------------------------------------------------------");


        totalTip = (tip / 100) * totalB4Tip;


        System.out.println("Total Bill Before Tip: " + totalB4Tip);
        System.out.println("Tip Percentage: ");
        System.out.println("Total Tip: ");
        System.out.println("Total Bill With Tip: ");
        System.out.println("Per Person Cost Before Tip: ");
        System.out.println("Tip Per Person: ");
        System.out.println("Total Cost Per Person: ");





        question.close();
    }
}
