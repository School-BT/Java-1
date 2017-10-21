/*
   Student
   Student class with specific fields
   Ben Burger
   8/25/2017
*/

public class Student
{
   static String first;
   static String last;
   static double gpa;
   static int id;
   
   public Student(int num)
   {
      first = "Name" + num;
      last = "Last" + num;
      gpa = 2.3 + num;
      id = 4 + num;
   }
   
   
   public static void setFirst(String str)
   {
      first = str;
   }
   
   public static void setLast(String str)
   {
      last = str;
   }
   
   public static void setGpa(double num)
   {
      gpa = num;
   }
   
   public static void setId(int num)
   {
      id = num;
   }
   
   public static String getFirst()
   {
      return first;
   }
   
   public static String getLast()
   {
      return last;
   }
   
   public static double getGpa()
   {
      return gpa;
   }
   
   public static int getId()
   {
      return id;
   }


}