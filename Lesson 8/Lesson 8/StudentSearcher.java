/*
StudentSearcher
searches a list of students and returns gpa
Ben Burger
8/29/2017
*/


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentSearcher
{
   //The objects will be stored in an array of Students
   static Student[] students = new Student[999999];
   
   static int trigger = 1;
   
   public static void main(String[] args)
   {
      readFile();
      
      //Provide the user with a list of student IDs
      idList(students);
      
      getUserInput();
   }
   
   
//When a user enters a Student Id, this searches for it
//and continues to search students until the user exits
   public static void getUserInput()
   {
      Scanner sc = new Scanner(System.in);
      
      do{
         println("Please enter a student Id or -1 to quit");
         int input = sc.nextInt();
         find(input);
         trigger = input;
      }while(trigger != -1);
      
      print("Search Terminated");
   }
   
   
   public static void idList(Student[] studs)
   {
      int LEN = studs.length - 1;
      for(int i = 0;i<LEN;++i)
      {
         print(studs[i].getId() + ", ");
      }
      println(studs[LEN].getId() + "");
      students = studs;
   }
   
   
   
   //searches for the gpa of the Student Id entered
   public static void find(int id)
   {
      int LEN = students.length;
      
      
      for(int i = 0;i<LEN;++i)
      {
         int item = students[i].getId();      
         if(id == item)
         {
            println(students[i].getGpa() + "");
         }
      }
   }
   
 //Reads in a student file, creates student objects and
 //places it in an array of students
   static void readFile()
   {
      try 
      {         
         BufferedReader in = new BufferedReader(new FileReader("readMe.txt"));
         int i = 0;
         String first;
   
         while((first = in.readLine()) != null)
         {          
            String last = in.readLine();
            String gpa = in.readLine();
            String id = in.readLine();
            
            whileLoop(first,last,gpa,id,i);
            
            i += 1;
         }

         in.close();
         inputHelper(i);
         
      }catch (IOException e) 
      {
      }
   }
   
   
   
   static void whileLoop(String first,String last,String gpaStr,String idStr,int i)
   {
            Student s = new Student(i);
            
            s.setFirst(first);
            s.setLast(last);
            double gpa = Double.parseDouble(gpaStr);
            s.setGpa(gpa);
            int id = Integer.parseInt(idStr);
            s.setId(id);
  
            students[i] = s;  
   }
   
   
   
   static void inputHelper(int i)
   {
      Student[] mem = students;
      students = new Student[i];
      for(int j = 0;j<i;++j)
      {            
         students[j] = mem[j];
      }
   }
   
   
   
   public static void print(String str)
   {
      System.out.print(str);
   }
   
   public static void println(String str)
   {
      System.out.println(str);
   }
}