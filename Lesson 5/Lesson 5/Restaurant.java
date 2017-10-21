/*
Restaurant
Calculates price from user input
Ben Burger
8/14/2017
*/

import java.util.Scanner;


public class Restaurant
{
   final static int SALAD_NUM = 0;
   final static double SALAD_PRICE = 5; 
   final static double SALAD_EXTRA = 0.50;
   
   final static int SANDWICH_NUM = 1;
   final static double SANDWICH_PRICE = 7;
   final static double SANDWICH_EXTRA = 1;
   
   
   public static void main(String[] args)
   {
      selectItem();
   }
   
     
   //Selecting toppings if..else statements sandwich
   //use of the scanner class to get user input
   public static Sandwich buildSandwich()
   {
      Sandwich sandwich = new Sandwich();
      
      Scanner sc = new Scanner(System.in);
      print("Please respond with Yes or No");
      
      sandwich = setSanLet(sandwich,sc);
      sandwich = setSanTom(sandwich,sc);
      sandwich = setSanChe(sandwich,sc);
      
      return sandwich;
   }
      
   public static Sandwich setSanLet(Sandwich sandwich,Scanner sc)
   {
      print("Would you like lettus? ");
      String let = sc.next();
      if(convertToBool(let))
      {
         sandwich.setLet(true);
      }else
      {
         sandwich.setLet(false);
      }
      return sandwich;
   }
   
   public static Sandwich setSanTom(Sandwich sandwich,Scanner sc)
   {  
      print("Would you like tomatoes? ");
      String tom = sc.next();
      if(convertToBool(tom))
      {
         sandwich.setTom(true);
      }else
      {
         sandwich.setTom(false);
      }
      return sandwich;
   }
   
   public static Sandwich setSanChe(Sandwich sandwich,Scanner sc)
   {   
      print("Would you like cheese? ");
      String che = sc.next();
      if(convertToBool(che))
      {
         sandwich.setChe(true);
      }else
      {
         sandwich.setChe(false);
      }
      
      return sandwich;
   }



   //Selecting toppings if..else statements salad
   //use of the scanner class to get user input
   public static Salad buildSalad()
   {
      Salad salad = new Salad();
      
      Scanner sc = new Scanner(System.in);
      print("Please respond with Yes or No");
      
      salad = setSalTom(salad,sc);
      salad = setSalChe(salad,sc);
      
      return salad;
   }
   
   public static Salad setSalTom(Salad salad,Scanner sc)
   {
      print("Would you like tomatoes? ");
      String tom = sc.next();
      
      if(convertToBool(tom))
      {
         salad.setTom(true);
      }else
      {
         salad.setTom(false);
      }
      return salad;
   }
  
   public static Salad setSalChe(Salad salad,Scanner sc)
   {
      print("Would you like cheese? ");
      String che = sc.next();
      
      if(convertToBool(che))
      {
         salad.setChe(true);
      }else
      {
         salad.setChe(false);
      }
      
      return salad;
   }


//Use a switch statement to handle the customer input.
   public static boolean convertToBool(String input)
   {
      String str = input;
      boolean placeHolder;
      
      switch(str)
      {
         case "Yes":
         case "yes":
         case "YES":
         case "y":
         case "Y":
            placeHolder = true;
            break;
         case "No":
         case "no":
         case "NO":
         case "n":
         case "N":
         default:
            placeHolder = false;
            break;
      }
      return placeHolder;
   }



   
//Use the Scanner class to prompt the customer for a salad or sandwich.
   public static void selectItem()
   {
      Scanner sc = new Scanner(System.in);
      print("Would you like a Salad or Sandwich?");
      
      String input = sc.next();


      switch(input)
      {
         case "Salad":
         case "salad":
         case "SALAD":
         default:
            print(buildSalad());
            break;
         case "Sandwich":
         case "sandwich":
         case "SANDWICH":
            print(buildSandwich());
      }
   }
   
   
   public static class Sandwich
   {
      boolean letHuh;
      boolean tomHuh;
      boolean cheHuh;
      double price;
      
      public Sandwich()
      {
         letHuh = false;
         tomHuh = false;
         cheHuh = false;
         price = SANDWICH_PRICE;
      }
            
      public void setLet(boolean input)
      {
         letHuh = input;
      }
      public void setTom(boolean input)
      {
         tomHuh = input;
      }
      public void setChe(boolean input)
      {
         cheHuh = input;
      }
      
      public boolean getLet()
      {
         return letHuh;
      }
      public boolean getTom()
      {
         return tomHuh;
      }
      public boolean getChe()
      {
         return cheHuh;
      }      
      public double getPrice()
      {
         return price;
      }
   }
   
   
   public static class Salad
   {
      boolean tom;
      boolean che;
      double price;
      
      public Salad()
      {
         tom = false;
         che = false;
         price = SALAD_PRICE;
      }
      
      void setTom(boolean input)
      {
         tom = input;
      }
      void setChe(boolean input)
      {
         che = input;
      }
      
      boolean getTom()
      {
         return tom;
      }
      boolean getChe()
      {
         return che;
      }
   }


 //After the customer has completed the order, 
 //the bill will need to be presented to the customer.
   public static void print(Sandwich sandwich)
   {
      print("--------------------------------");
      print("You have ordered a Sandwich at $" + SANDWICH_PRICE);
      
      if(sandwich.getLet())
      {
         print("Add $" + SANDWICH_EXTRA + " For Lettus");
      }
      if(sandwich.getTom())
      {
         print("Add  $" + SANDWICH_EXTRA + " For Tomato");
      }
      if(sandwich.getChe())
      {
         print("Add $" + SANDWICH_EXTRA + " For Cheese");
      }
      print("For a total of $" + calculate(sandwich));
   }
   
   
   //A sandwich is $7.00 and each additional topping is $1.00. 
   public static double calculate(Sandwich sandwich)
   {
      double finalPrice = SANDWICH_PRICE;
      
      if(sandwich.getLet())
      {
         finalPrice += SANDWICH_EXTRA;
      }
      if(sandwich.getTom())
      {
         finalPrice += SANDWICH_EXTRA;
      }
      if(sandwich.getChe())
      {
         finalPrice += SANDWICH_EXTRA;
      }
      
      return finalPrice;
   }
   
   
 //After the customer has completed the order, 
 //the bill will need to be presented to the customer.
   public static void print(Salad salad)
   {
      print("--------------------------------");
      print("You have ordered a Salad at $" + SALAD_PRICE);
      if(salad.getTom())
      {
         print("Add $" + SALAD_EXTRA + " For Tomato");
      }
      if(salad.getChe())
      {
         print("Add $" + SALAD_EXTRA + " For Cheese");
      }
      print("For a total of $" + calculate(salad));
   }
   
   
   //Salad price Additional toppings are 50 cents. 
   public static double calculate(Salad salad)
   {
      double finalPrice = SALAD_PRICE;
      
      if(salad.getTom())
      {
         finalPrice += SALAD_EXTRA;
      }
      if(salad.getChe())
      {
         finalPrice += SALAD_EXTRA;
      }
      
      return finalPrice;
      
   }
         
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   
}