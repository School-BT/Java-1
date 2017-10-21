/*
CreatePurchase

Ben Burger
CIS163AA
12695
BEN2160204 

9/15/2017
*/

import java.util.*;

public class CreatePurchase
{
   
   
   public static void main(String[] args)
   {
      print("You will be creating a purchase item.");
      makePurchase();
   }
   
   
   static void makePurchase()
   {
      Scanner sc = new Scanner(System.in);
      Purchase purchase = new Purchase();
      
      invoice(purchase,sc);
      
      pricing(purchase,sc);      
      
      purchase.display();
   }
   
   public static void invoice(Purchase purchase,Scanner sc)
   {
      int inNum = 0;
      
      while(inNum < 1000 || inNum > 8000)
      {   
         print("Please enter Invoice Number. 1000 to 8000");
         String input = sc.next();
         inNum = Integer.parseInt(input);
      }
      
      purchase.setInvoice(inNum);
   }
   
   public static void pricing(Purchase purchase,Scanner sc)
   {
      double inPrice = 0;
      
      while(inPrice<=0)
      {   
         print("Please enter product Price.");
         String input = sc.next();
         inPrice = Double.parseDouble(input);
      }
      
      purchase.setPrice(inPrice);
   }
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   
}