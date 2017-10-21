/*
EmployeeData
improve on project 7 
Ben Burger
9/5/2017
*/

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeData
{
   public static ArrayList<Employee> employees = new ArrayList<Employee>();
      
   public static String name;
   public static String last;
   public static int id;
   public static double wage;
   
   public static int first;
   public static int second;
   public static int third;
   public static int len;
   
   public static int selector;
   public static String userIn;
   
   public static void main(String[] args)
   {
      settingLoop();

      printTop();
      for(int i = selector;i>0;--i)
      {
         if(i == selector)
         {
         }else
         {
            printLoopTop();
         }
         //load the objects into an array of objects
         add(buildEmp());
      }
      printArr(employees);
   }
   
   
   public static void settingLoop()
   {
      Scanner sc = new Scanner(System.in);
      print("How many Employees do you want to enter?\n");
      
      selector = sc.nextInt();
   }
   
   
   public static void printTop()
   {
      print("Please enter the Employee's Data" +
            " seperated by exactly one space\n" +
            "first name, last name, numeric" +
            " ID and hourly wage.\n");    
      
      print("For example:\nJohn Smith 123456 12.50\n");      
                
   }
   
   
   public static void printLoopTop()
   {
      print("Input the next Employee\n");
   }
   
  
   //takes 1 line of user input data seperated by spaces
   //single input String, reads in the first, last name,
   //id#, and wage
   public static void input()
   {
      Scanner sc = new Scanner(System.in);
      
      userIn = sc.nextLine();
   }
   
   
   public static void getSections()
   {
      input();
 
      first = userIn.indexOf(' ');
      second = userIn.indexOf(' ',++first);
      third = userIn.indexOf(' ',++second);
      len = userIn.length();
   }
   
   
   //parses user input into seperate variables
   public static void breakDown()
   {
      getSections();
      
      name = userIn.substring(0,first - 1);
      last = userIn.substring(first,second - 1);
      id = Integer.parseInt(userIn.substring(second,third));
      wage = Double.parseDouble(userIn.substring(third,len));
   }   
   
   
   public static Employee buildEmp()
   {
      breakDown();
      
      Employee emp = new Employee(name,last,id,wage);
      
      return emp;
   }
   
   
   public static void add(Employee emp)
   {
      employees.add(emp);
   }
   
   
 //for loop to print a list of all the Employee objects’
 // information
   public static void printArr(ArrayList<Employee> emps)
   {
      int LEN = emps.size() ;
      for(int i = 0; i<LEN ; ++i)
      {
         print("Employee #" + (i+1));
         printEmp(emps.get(i));
      }
   }
   
   
   
   public static void printEmp(Employee emp)
   {
      print("  Employee name: " + emp.getName() + " " + emp.getLast());
      print("  ID: " + emp.getId());
      print("  Hourly wage: $" + emp.getWage());   
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   
}