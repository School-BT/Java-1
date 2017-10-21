/*
Purchase

Ben Burger
CIS163AA
12695
BEN2160204 

9/15/2017
*/
import java.util.*;


public class Purchase
{
   int invoiceNum;
   double salesPrice;
   double salesTax;
   
   int getInvoice()
   {
      return invoiceNum;
   }
   
   double getTax()
   {
      return salesTax;
   }
   
   double getPrice()
   {
      return salesPrice;
   }
   
   double getTotal()
   {
      return salesPrice + salesTax;
   }
   
   void setInvoice(int num)
   {
      invoiceNum = num;
   }
   
   void setPrice(double num)
   {
      salesPrice = round(num);
      salesTax = round(.05 * salesPrice);
   }
   
   void display()
   {
      double total = salesTax + salesPrice;
      
      print("Invoidce Number: " + invoiceNum);
      print("Sales Price: " + round(salesPrice));
      print("Sales Tax: " + round(salesTax));
      print("Total Price: " + round(total));
   }
   
   void print(String str)
   {
      System.out.println(str);
   }
   
   
   
   double round(double num)
   {
      String str = num + "000000";
      int place = str.indexOf(".") + 4;
      String newStr = str.substring(0,place);
      
      double price = cutLast(newStr);
      
      return price;
   }
   
   
   //Str must be a double up to 3 decimal places
   double cutLast(String str)
   {
      int LEN = str.length();
      String numStr = str.substring(LEN - 1,LEN);
      int num = Integer.parseInt(numStr);
      double out = Double.parseDouble(str.substring(0,LEN - 1));
      
      if(num<5)
      {
         return out;
      }else
      {
         return out + .01;
      }
            
   }
   
}