/*
IRS
Performs audits for customers
Ben Burger
8/18/2017
*/

import java.util.Scanner;

public class IRS
{
   public static boolean w2;
   public static boolean rec;
   public static boolean child;
   
   public static double price = 0;
   
   
   public static void main(String[] args)
   {  
      //Use Scanner class to prompt auditors
      Scanner sc = new Scanner(System.in);
      
      //Scenarios if customer provided w2
      setW2(sc);
      //Scenarios if customer provided receipts for donations
      setReceipts(sc);
      //Scenarios if customer deducted more than 3 children
      setChildren(sc);
      
      calculate();
      
      //Provides pass/fail and create bill
      showData();
   }
   
   public static void setW2(Scanner sc)
   {
      
      print("Did the customer provide a W-2?");
      
      String input = sc.next();
      
      switch(input)
      {
         case "yes":
         case "Yes":
         case "YES":
         case "y":
         case "Y":
         default:
            w2 = true;
            break;
         case "no":
         case "No":
         case "NO":
         case "n":
         case "N":
            w2 = false;
            break;
      }
   }
   
   public static void setReceipts(Scanner sc)
   {
      
      print("Did the customer provide receipts for donations?");
      
      String input = sc.next();
      
      switch(input)
      {
         case "yes":
         case "Yes":
         case "YES":
         case "y":
         case "Y":
         default:
            rec = true;
            break;
         case "no":
         case "No":
         case "NO":
         case "n":
         case "N":
            rec = false;
            break;
      }
   }
   
   public static void setChildren(Scanner sc)
   {
      print("Did the customer deduct more than 3 children?");
      
      String input = sc.next();
      
      switch(input)
      {
         case "yes":
         case "Yes":
         case "YES":
         case "y":
         case "Y":
         default:
            child = true;
            break;
         case "no":
         case "No":
         case "NO":
         case "n":
         case "N":
            child = false;
            break;
      }
   }
   
   
   //prints bill
   public static void showData()
   {
      printTopBit();
      printMidBit();
      printFinalBit();
   }
   
   
   //no w2 $500 fine
   public static void printTopBit()
   {
      print("The Customer");
      if(w2)
      {
         print("Has W2");
      }else
      {  
         print("Does not have W2 ($500 fine)");
      }
      
   //no receipts $300 fine
      if(rec)
      {
         print("Has Receipts");
      }else
      {  
         print("Does not have Receipts ($300 fine)");
      }
   }
   
   
   /*
   if other infractions and more than 3 children 
   claimed, charge $1000
   */
   public static void printMidBit()
   {
      String addFineHuh = "";
      
      if(!rec || !w2)
      {  
         addFineHuh = " ($1000.0 fine).";
      }  
      if(child)
      {
         print("Claimed more than 3 kids" + addFineHuh);
      }else
      {
         print("Claimed less than 3 kids");
      }
   }
   
   //provides a PASS/FAIL status
   public static void printFinalBit()
   {
      if(!w2)
      {
         print("Failed the audit");
      }else if(!rec)
      {
         print("Failed the audit");
      }else
      {
         print("Passed the audit");
      }
      
      print("For a total fine of $" + price);
      
   }
   
   public static void calculate()
   {
      if(!w2)
      {
         price += 500.0;
      }
      if(!rec)
      {
         price += 300.0;
      }
      
      boolean option1 = child && !w2 && !rec;
      boolean option2 = child && !rec;
      boolean option3 = child && !w2;
      boolean output = option1 || option2 || option3;
      
      if(output)
      {
         price += 1000.0;
      }
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }
}