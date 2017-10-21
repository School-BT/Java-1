/*
Sale
a class to track sale items
Ben Burger
8/23/2017
*/

public class Sale
{   
   //Receipt number, cost of item, discount rate
   //, and sales tax rate for class data fields
   public static int recNum;
   public static double cost;
   public static double discount;
   final static double tax = 0.08;//must be a percent****

   public static double endPrice = 0.0;
   
   
   //*******SETTERS********
   public void setRecNum(int num)
   {
      recNum = num;
   }
   
   public void setCost(double num)
   {
      cost = num;
   }
   
   public void setDiscount(int num)
   {
      
      discount = num / 100.0;
   }
   //*****END SETTERS*****
   
   
   
   public int getRecNum()
   {
      return recNum;
   }
   
   public double getCost()
   {
      return cost;
   }
   
   public double getDiscount()
   {
      return discount;
   }
   
   public double getTax()
   {
      return tax;
   }
   
   public double getEndPrice()
   {
      return endPrice;
   }
   
   
   //calculates item price after discount and
   //       tax is applied and prints results.
   public static void printFinal()
   {
      double disPrice = cost * discount;
      double price = cost - disPrice; 
      double taxPrice = tax * price;
      endPrice = price + taxPrice;
      
      System.out.println("Invoice #" + recNum +
                         " Price of item: $" + cost +
                         "\nDiscount subtracted: $" +
                         disPrice + " Tax rate: " +
                         tax + " Tax: $" + taxPrice +
                         "\nDiscounted price including tax: $" +
                         endPrice);
   }
}