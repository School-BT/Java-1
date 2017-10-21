/*
Eggs
This program will calculate the price of a number of eggs 
   based on 3.25/dozen and .45/egg not in a dozen
   ***modified task: Use JOptionPane for input and output***
Ben Burger
8/5/2017
*/

import javax.swing.JOptionPane;

public class Eggs
{
   final static double PRICE_PER_DOZEN = 3.25;
   final static double PRICE_PER_EGG = 0.45;
   final static int DOZEN = 12;
   static String prntStr;
   
   static int numberOfEggs;
   static int numberOfDozen;
   static int remainderAfterDozen;
   
   static double checkoutPrice;
   static double costOfDozOrdered;
   static double costOfRemainingOrdered;
   
   
   public static void main(String[] args)
   {
      startQuestion();
      
      calculate(numberOfEggs);
      createPrntStr();
      
      //Displays message on popup GUI
      JOptionPane.showMessageDialog(null,prntStr); 
      
   }
   
   //Opens GUI and sets numberOfEggs as input
   public static void startQuestion()
   {
      String inStr = JOptionPane.showInputDialog(null,"How many Eggs would you like?");
      numberOfEggs = Integer.parseInt(inStr);
   }
   
   
   //does the work
   public static void calculate(int numOfEggs)
   {
      numberOfDozen = numOfEggs / DOZEN;
      remainderAfterDozen = numOfEggs % DOZEN;
      
      costOfDozOrdered = numberOfDozen * PRICE_PER_DOZEN;
      costOfRemainingOrdered = remainderAfterDozen * PRICE_PER_EGG;

      
      checkoutPrice = costOfDozOrdered + costOfRemainingOrdered;
   }
   
   
   //Creates String to print the Full explination and final price
   public static void createPrntStr()
   {
      prntStr = "You ordered " + numberOfEggs +
                " eggs.\nThat is " + numberOfDozen +
                " dozen eggs at $" + PRICE_PER_DOZEN +
                " per dozen.\nLeaving " + remainderAfterDozen +
                " loose eggs at $" + PRICE_PER_EGG +
                " per egg.\nThis makes your total $" + 
                checkoutPrice + ".";
   }
   
   
}