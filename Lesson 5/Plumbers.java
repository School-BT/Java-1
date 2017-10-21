import java.util.Scanner;

public class Plumbers
{
   public static String type;
   public static int amtNum;
   public static double cost;
   
   
   public static void main(String[] args)
   {
      prompt();
      
      Print p = new Print(type,cost,amtNum);
      
      p.printMe();
   }
   
   //Prompting user to determine pricing
   public static void prompt()
   {
      Scanner sc = new Scanner(System.in);
      
      print("Are you needing priceing on pipe or flood damage?");
      String input = sc.next();
      promptHandler(input);
      
      if(type == "flood")
      {
         print("How many rooms are affected?");
      }else
      {
         print("How many pipes need fixed?");
      }
      
      int inInt = sc.nextInt();
      floodOrPipeCost(inInt);
      
   }
   
   //use AND,OR,NOT in if statements to obtain customer input
   public static void promptHandler(String input)
   {
                              //the OR
      if(input.equals("Pipe") || input.equals("pipe") || input.equals("PIPE"))
      {
         type = "pipe";
      }else if(input.equals("Flood") || input.equals("flood") || input.equals("FLOOD"))
      {
         type = "flood";
      }else
      {
         print("pleas use either pipe or flood");
         type = "";
      }
      
   }
   
   //handles pricing for floods and burst pipes
   //use AND,OR,NOT in if statements to obtain customer input
   public static void floodOrPipeCost(int selection)
   {
                        //the AND
      if(selection == 0 && type.equals("pipe"))
      {
         cost = 0;
         amtNum =0;
      }else if(selection == 1 && type.equals("pipe"))
      {
         cost = 50;
         amtNum = 1;
      }else if(selection == 2 && type.equals("pipe"))
      {
         cost = 70;
         amtNum = 2;
      }else if(selection > 2 && type.equals("pipe"))
      {
         cost = 100;
         amtNum = selection;
      }else if(selection == 0 && type.equals("flood"))
      {
         cost = 0;
         amtNum =0;
      }else if(selection == 1 && type.equals("flood"))
      {
         cost = 300;
         amtNum =1;
      }else if(selection == 2 && type.equals("flood"))
      {
         cost = 500;
         amtNum =2;
      }else if(selection > 2 && type.equals("flood"))
      {
         cost = 750;
         amtNum = selection;
                                 //the NOT
      }else if(selection >= 0 && !type.equals("pipe"))
      {
         print("neet to select pipe or flood");
      }
   }
   
   //Nested class to handle billing charges
   public static class Print
   {
      public static String type;
      public static double cost;
      public static int amtNumber;
      
      public Print(String inType,double inCost,int inAmt)
      {
         type = inType;
         cost = inCost;
         amtNumber = inAmt;
      }
      
      public static void printMe()
      {
         String outputWord;
         if(type == "pipe")
         {
            outputWord = "pipes";
         }else
         {
            outputWord = "rooms";
         }
         
         print("The cost to repair " + amtNumber +
               " " + outputWord + 
               " will be $" + cost);
      }
      
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }


}