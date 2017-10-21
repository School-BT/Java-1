/*
ShowStudent
Creates and shows an instance of Student
Ben Burger
8/7/2017
*/


public class ShowStudent
{
   //instatiation of Student
   static Student student = new Student();
   
   static int id = 5555;
   static double cred = 3;
   static int point = 5; 
   
   
   public static void main(String[] args)
   {
      populateStudent();
      
      displayStudent(student);
   }   
   
   
   //Assigning field values to student
   public static void populateStudent()
   {
      student.setId(id);
      student.setCredHr(cred);
      student.setPoints(point);
      
      //the act of setting GPA also calculates for it
      student.setGPA();
   }  
   
   

   
   //uses getters and displays data from student
   public static void displayStudent(Student stdnt)
   {  
      print("Student ID: ");
      print("" + stdnt.getId());
      print("\nCredit Hours: ");
      print("" + stdnt.getCredHr());
      print("\nPoints: ");
      print("" + stdnt.getPoints());
      print("\nGPA: ");
      print("" + stdnt.getGPA());
   }

   
   //to reduce errors
   //converts number to string and displays them to terminal
   public static void printLn(double num)
   {
      System.out.println(num + "");
   }
   
   // to reduce my errors
   public static void print(String str)
   {
      System.out.print(str);
   }
   
}