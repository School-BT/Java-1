/*
SalesReceipts
Facilitate Sales class with allowing user input
Ben Burger
8/23/2017   
*/
import java.util.*;
import java.math.BigDecimal;
import java.lang.Math;


public class SalesReceipts
{
   public static int selector = 0;
   
   //runnig total of items discount prices
   public static double total = 0.00;
   
   public static void main(String[] args)
   {
      //continues looping while user inputs 1, stops for 0
      do
      {
         buildItem();
         keepGoing();
      }while(selector == 1);
      
      //prints total bill befor program ends
      print("Your total sales receipt is: $" + total);
   }
   
   public static void keepGoing()
   {
      print("Do you want to input another Item?" +
            " 1=Yes 0=No");
      Scanner sc = new Scanner(System.in);
      
      selector = sc.nextInt();
   }
   
   
   //allows user input for Sale.class objects
   //calls method to print resulting discounted
   //price plus tax
   public static void buildItem()
   {
      Scanner sc = new Scanner(System.in);
      Sale sale = new Sale();
      
      setRecNum(sc,sale);
      setPrice(sc,sale);
      setDiscount(sc,sale);
      printItemTotal(sale);
   }
   
   public static void setRecNum(Scanner sc,Sale sale)
   {
      print("Please enter the Invoice Number");
      sale.setRecNum(sc.nextInt());
   }
   
   public static void setPrice(Scanner sc,Sale sale)
   {
      print("Please enter the item's original price");
      sale.setCost(sc.nextDouble());
   }
   
   public static void setDiscount(Scanner sc,Sale sale)
   {
      print("Please enter the Discount as a whole number");
      sale.setDiscount(sc.nextInt());
   }
   
   public static void printItemTotal(Sale sale)
   {
      sale.printFinal();
      total += sale.getEndPrice();
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   

}