/*
StudentFinder
reads a list of students, searches list by first letter of name
Ben Burger
9/11/2017
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;


public class StudentFinder
{   
   public static List<String> abcs = new ArrayList<String>(
      Arrays.asList("a","b","c","d","e","f","g","h",
      "i","j","k","l","m","n","o","p",
      "q","r","s","t","u","v","w","x",
      "y","z"));
   public static List<Student> students = new ArrayList<Student>();
   public static List<String> letters = new ArrayList<String>();
   public static int selector = 0;
   
   
   public static void main(String[] args)
   {
      readFile(students);
      
      while(selector == 0)
      {
         prompt();
      }
   }
    
      
   public static void streamStuff(String letter)
   {
      List<Student> results = students.stream()
            .filter(student -> student.getName().startsWith(letter.toUpperCase()))
            .collect(Collectors.toList());
            
      results.forEach(students -> System.out.println("Name: " + students.getName() +
                                                   "\nID:   " + students.getId() + 
                                                   "\nGPA:  " + students.getGpa()));
   }
      
   
      
   public static void prompt()
   {
      Scanner sc = new Scanner(System.in);
      
      print("Please enter the first letter of a student's name." +
            "\nType exit to exit");
      
      String input = sc.next();
      
      switch(input)
      {
         case "exit":
            selector = 1;
            break;
         default:
            streamStuff(input);
            break;
      }
      
      print("");
   }
   
   
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   
   
   
 //Reads in a student file, creates student objects and
 //places it in an array of students
   static void readFile(List<Student> students)
   {
  
      try 
      {         
         BufferedReader in = new BufferedReader(new FileReader("studentFile.txt"));
         int i = 0;
         String name;
   
         while((name = in.readLine()) != null)
         {          
            String gpaStr = in.readLine();
            String idStr = in.readLine();
            
            whileLoop(name,gpaStr,idStr,students);
            
            i += 1;
         }

         in.close();
         
      }catch (IOException e) 
      {
      }
   }
   
     
   static void whileLoop(String name,String gpaStr,String idStr,List<Student> students)
   {
      Student st = new Student();
      
      st.setName(name);
      
      double gpa = Double.parseDouble(gpaStr);
      st.setGpa(gpa);
      
      int id = Integer.parseInt(idStr);
      st.setId(id);
      
      students.add(st);
   }
   
   
  

}