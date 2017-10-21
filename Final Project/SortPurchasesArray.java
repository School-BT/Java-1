/*
SortPurchasesArray

Ben Burger
CIS163AA
12695
BEN2160204 

9/15/2017
*/

import java.util.*;

public class SortPurchasesArray
{
   public static Purchase[] purchases = new Purchase[5];
   
   public static int selector = 1;  
   
   public static void main(String[] args)
   {
      print("You will be building a purchases list of 5 purchases.");
      buildPurchase();
      do
      {
         startLoop();
         inputHandler();
      }while(selector == 1);
   }
   
   public static void startLoop()
   {
      print("How would you like to sort your purchase items");
      print("by Invoice (1), by Price (2), or by Sales Tax(3)?\nTo exit type exit (0)");
   }
   
   public static void inputHandler()
   {
      Scanner sc = new Scanner(System.in);
      String input = sc.next();
      
      switch(input)
      {
         case "Invoice":
         case "invoice":
         case "INVOICE":
         case "1":
            sortInvoice();
            break;
         case "Price":
         case "PRICE":
         case "price":
         case "2":
            sortPrice();
            break;
         case "Tax":
         case "tax":
         case "TAX":
         case "3":
            sortTax();
            break;
         case "exit":
         case "Exit":
         case "EXIT":
         case "0":
            selector = 0;
            break;
      }
      
   }
   
   
   public static void buildPurchase()
   {
      Scanner sc = new Scanner(System.in);
      
      for(int i = 0;i<5;++i)
      {  
         Purchase purchase = new Purchase();
         int j = i + 1;
         print("Please enter Invoice Number for item " + j);
         int inputX = Integer.parseInt(sc.next());
         purchase.setInvoice(inputX);
         
         print("Please enter item Price for item " + j);
         double inputY = Double.parseDouble(sc.next());
         purchase.setPrice(inputY);
         
         purchases[i] = purchase;
      }
   }
   
   
   public static void printTopLoop()
   {
      int selector = 0;
      while(selector == 0)
      {
         print("Please select if you wish to sort by " + 
               "\nInvoice Number(1) or by " + 
               "Price (2).");
      }
   }
   
  
   public static void sortPrice()
   {
      int LEN = purchases.length;
      
      double[] prices = new double[LEN];
      
      for(int i = 0;i<LEN;++i)
      {
         prices[i] = purchases[i].getPrice();
      }
                         
      sort(prices);
   }
 
   
   public static void sortInvoice()
   {
      int LEN = purchases.length;
      
      double[] inv = new double[LEN];
      
      for(int i = 0;i<LEN;++i)
      {
         inv[i] = purchases[i].getInvoice();
      }
                         
      sort(inv);
   }
   
   public static void sortTax()
   {
      int LEN = purchases.length;
      
      double[] tax = new double[LEN];
      
      for(int i = 0;i<LEN;++i)
      {
         tax[i] = purchases[i].getTax();
      }
      
      sort(tax);
   }
   
   
   public static void sort(double[] listIn)
   {
      double temp;
      
      double[] list = copy(listIn);
      
      for(int a = 0;a<list.length - 1; ++a)
        for(int b = 0;b<list.length - 1; ++b)
          if(list[b] > list[b+1])
          {
            temp = list[b];
            list[b] = list[b+1];
            list[b+1] = temp;
            Purchase tempPur = purchases[b];
            purchases[b] = purchases[b+1];
            purchases[b+1] = tempPur;
            
          }
      printAll();
   }
   
   
   public static double[] copy(double[] list)
   {
      double[] newList = new double[5];
      int LEN = list.length;
      for(int i = 0;i<LEN;++i)
      {
         newList[i] = list[i];
      }
      
      return newList;  
   }
   
   public static void sort(double[] list,int x)
   {
      int LEN = purchases.length - x - 1;
      for(int i = 0;i<LEN;++i)
      {
         if(list[i] > list[i+1])
         {
            Purchase temp = purchases[i];
            purchases[i] = purchases[i+1];
            purchases[i+1] = temp;
         }
      }
   }
   
   public static void printAll()
   {
      int LEN = purchases.length;
      for(int i = 0;i<LEN;++i)
      {
         Purchase pur = purchases[i];
         pur.display();
         print("");
      }
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }  
}