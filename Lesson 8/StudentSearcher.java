/*
   StudentSearcher
   Populates an array of Student objects
   Ben Burger
   8/25/2017
*/

import java.util.Arrays;

public class StudentSearcher
{
   static int[] ids;
   static double[] gpas;
   
   
   //Objects will be stored in this array
   static Student[] students;   
   
   public static void main(String[] args)
   {     
      buildStudList(5);
      splitArrays(students);
      printIds(ids);
   }
   
   public static void buildStudList(int input)
   { 
      students = new Student[input];  
      
      for(int i = 0; i<input ; ++i)
      {
         students[i] = new Student(i);
         print("" + students[i].getId());
         println(i + "");
         
      }
   }
   
   public static void printIds(int[] studentList)
   {
      
      for(int i = 0;i<studentList.length;++i)
      {
         print(studentList[i] + " ");
      }
   }
   
   public static void splitArrays(Student[] inArray)
   {
      int START_LEN = inArray.length - 1;
      
      ids = new int[START_LEN + 1];
      gpas = new double[START_LEN + 1];
      
      for(int i = START_LEN;i>0;--i)
      {
         ids[i] = inArray[i].getId();
         gpas[i] = inArray[i].getGpa();
      }
   }
   
   public static void findGpa(int studentId)
   {
      int END_LEN = students.length;
      
      for(int i = 0; i<END_LEN ; ++i)
      {
         int lookedUp = students[i].getId();
         
         if(studentId == lookedUp)
         {
            println("" + gpas[i]);
         }
      }
   }  
   
   
   public static void println(String str)
   {
      System.out.println(str);
   }  
   
   public static void print(String str)
   {
      System.out.print(str);
   }  
   
}