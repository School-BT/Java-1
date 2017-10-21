/*
Student
create a data type "Student" with fields id number,
 number of credit hours earned, number of points
 earned, and gpa. include setters, getters, and display methods.
Ben Burger
8/7/2017
*/

public class Student
{
   static int idNum; //ID Nmber field
   static double creditHours; // Credit Hours Earned Field
   static int pointsEarned; // Points Earned Field
   static double gpa; //Grade Point Average
   
   
   //*****CONSTRUCTOR*****
   public Student()
   {      
      idNum = 9999;
      creditHours = 3;
      pointsEarned = 12;     
      gpa = 4;
   }
   
   
   
 ////////////////Setters and Getters\\\\\\\\\\\\\\
 
   //***** ID Handlers *****
   static void setId(int inputNum)
   {
      idNum = inputNum;
   }
   
   static int getId()
   {  
      return idNum;
   }
   
   static void disId()
   {
      printLn("" + getId());
   }
   
   
   //*****Credit Hour Handlers *****
   static void setCredHr(double credHrs)
   {
      creditHours = credHrs;
   }
   
   static double getCredHr()
   {
      return creditHours;
   }
   
   public void disCredHr()
   {
      printLn("" + getCredHr());
   }
   
   
   //***** Points Handlers *****
   static void setPoints(int points)
   {
      pointsEarned = points;
   }
   
   static int getPoints()
   {
      return pointsEarned;
   }
   
   static void disPoints()
   {
      printLn("" + getPoints());
   }
   
   
   //***** GPA *****
   static void setGPA()
   {
      gpa = calGPA(); 
   }
   
   static double getGPA()
   {
      return gpa;
   }
   
   static void disGPA()
   {
      printLn("" + getGPA());
   }
   
   static double calGPA()
   {
      return pointsEarned / creditHours;
   }
   
   //////////////////////End Setters and Getters////////////////////////
   
   
   //To reduce my errors 
   static void printLn(String str)
   {
      System.out.println(str);
   }
   
   
   

}