/*
EmployeeData
Write a program that takes a single String of user input that
 is separated by spaces and parses the input into separate
 variables using looping and String methods. 
Ben Burger
8/24/2017
*/

import java.util.Scanner;


//employee input program
public class EmployeeData
{
   static String userIn;
   
   static String name;
   static String last;
   static int id;
   static double wage;
   
   static int first;
   static int second;
   static int third;
   static int len;
   
   static int selector;
   
   //uses looping to accept additional input
   //until the user enters a value -> inputSelector
   public static void main(String[] args)
   {
      do
      {
      printTop();
      fullMonte();
      inputSelector();
      }while(selector == 1);
   }
   
   public static void printTop()
   {
      print("Please enter the Employee's Data" +
            " seperated by exactly one space\n" +
            "first name, last name, numeric" +
            " ID and hourly wage.\n");    
      
      print("For example:\nJohn Smith 123456 12.50\n");      
                
   }
   
   public static void fullMonte()
   {
      getInput();
      getSections();
      breakDown();
      sets();
      printAll();
   }
   
   //user ends input
   public static void inputSelector()
   {
      Scanner sc = new Scanner(System.in);
      
      String str = sc.next();
      if(str.equals("Y")||str.equals("y")||str.equals("yes"))
      {
         selector = 0;
      }else
      {
         selector = 1;
      }
   }
   
   //takes 1 line of user input data seperated by spaces
   //single input String, reads in the first, last name,
   //id#, and wage
   public static void getInput()
   {
      Scanner sc = new Scanner(System.in);
      
      userIn = sc.nextLine();
   }
   
   
   public static void getSections()
   {
      first = userIn.indexOf(' ');
      second = userIn.indexOf(' ',++first);
      third = userIn.indexOf(' ',++second);
      len = userIn.length();
   }
   
   //parses user input into seperate variables
   public static void breakDown()
   {
      name = userIn.substring(0,first - 1);
      last = userIn.substring(first,second - 1);
      id = Integer.parseInt(userIn.substring(second,third));
      wage = Double.parseDouble(userIn.substring(third,len));
   }   
   
   //create an Employee class object to contain input info
   public static void sets()
   {
      Employee emp = new Employee();
      
      emp.setName(name);
      emp.setLast(last);
      emp.setId(id);
      emp.setWage(wage);
   }
   
   public static void printAll()
   {
      print("  Employee name: " + name + " " + last);
      print("  ID: " + id);
      print("  Hourly wage: $" + wage);
      print("Are you finished? Y/N");
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }

}