/*
Restaurant
Allow customer to select food and add toppings
  while calculating and presenting price.
Ben Burger
8/17/2017
*/


import java.util.Scanner;


public class Restaurant
{
   public static boolean let = false;
   public static boolean tom = false;
   public static boolean che = false;
   
   public static boolean type = false; // false is Salad true is Sandwich
   
   
   

   //use the Scanner class to prompt the customer for a salad or sandwich
   public static String prompt()
   {
      String passMe;
      Scanner sc = new Scanner(System.in);
      
      print("Would you like a Salad or Sandwich?");
      passMe = sc.next();
            
      return passMe;
   }
   
   //use a switch statement to handle the customer input
   public static String inputHandler(String str)
   {
      String input = str;
      
      switch(input)
      {
         case "Salad":
         case "salad":
         case "SALAD":
            input = "salad";
            type = false;
            break;
         case "Sandwich":
         case "SANDWICH":
         case "sandwich":
            input = "sandwich";
            type = true;
            break;
         case "Lettuce":
         case "lettuce":
         case "LETTUCE":
         case "let":
            input = "let";
            break;
         case "Tomato":
         case "tomato":
         case "TOMATO":
         case "tom":
            input = "tom";
            break;
         case "Cheese":
         case "cheese":
         case "CHEESE":
         case "che":
            input = "che";
            break;
      }
      
      return input;
      
   }
   
   
   //sandwich selected if...else statements to pick toppings 
   //      tomatoes, lettuce, cheese
   public static void sandwichTop(String input)
   {  
      if(input == "let")
      {
         let = true;
      }else 
      {
         let = false;
      }
      
      if(input == "tom")
      {
         tom = true;
      }else 
      {
         tom = false;
      }
      
      if(input == "che")
      {
         che = true;
      }else
      {
         che = false;
      }
   }
   
   
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }

}