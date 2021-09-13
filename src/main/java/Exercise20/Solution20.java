/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise20;

import java.util.Scanner;

public class Solution20
{
    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is order amount? ");
        int amount = scan.nextInt();
        System.out.print("What state do you live in? ");
        String state = scan.next();

        double  taxes = 0.0, total = 0.0;


        if(state.contains("Wisconsin"))
        {
            System.out.print("What county do you live in? Choose 1 for Dunn or 2 for Eau Claire ");
            int county = scan.nextInt();

            if(county == 1)
            {
                taxes = (amount * 5.004) / 100;
                total = amount + taxes;
            }
            else if(county == 2)
            {
                taxes = (amount * 5.005) / 100;
                total = amount + taxes;
            }
            else
            {
                System.out.println("That is not a valid entry. Try again.");
            }
        }
        else if(state.contains("Illinois"))
        {
            taxes = amount * 8 / 100;
            total = amount + taxes;
        }
        else
        {
            System.out.println("There are no sales tax for this state.");
            taxes = 0.0;
            total = amount;
        }


        System.out.printf("The tax is  $ %.2f \n", taxes);
        System.out.printf("The total is  $ %.2f", total);
    }
}
