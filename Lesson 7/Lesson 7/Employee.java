/*
Employee
Holds data for employees
Ben Burger
8/24/2017
*/

public class Employee
{
   public static String name;
   public static String last;
   public static int id;
   public static double wage;
   
   public static void setName(String str)
   {
      name = str;
   }
   
   public static void setLast(String str)
   {
      last = str;
   }
   
   public static void setId(int num)
   {
      id = num;
   }
   
   public static void setWage(double num)
   {
      wage = num;
   }
   
   public static String getName()
   {
      return name;
   }
   
   public static String getLast()
   {
      return last;
   }
   
   public static int getId()
   {
      return id;
   }
   
   public static double getWage()
   {
      return wage;
   }
}