/*
ShowStudent2
Demonstrating Constructers 
Ben Burger
8/7/2017
*/


public class ShowStudent2
{

   //instatiation of Student
   static Student student = new Student();
   
   
   
   public static void main(String[] args)
   {
      print("Constructed Student \n");
      
      //Constructed student
      displayStudent(student);
      
   }   
   
   
   //uses getters and displays data from student
   public static void displayStudent(Student stdnt)
   {  
      print("Student ID: ");
      print(""+stdnt.getId());
      print("\nCredit Hours: ");
      print(""+stdnt.getCredHr());
      print("\nPoints: ");
      print(""+stdnt.getPoints());
      print("\nGPA: ");
      print(""+stdnt.getGPA());
   }
   
   // to reduce my errors
   public static void print(String str)
   {
      System.out.print(str);
   }
   
}