/*
InchesToFeet
Inches and feet converter
Ben Burger
8/4/2017
*/


import javax.swing.JOptionPane;
import java.util.Scanner;

public class InchesToFeet
{
   final static int INCHES = 86;
   static int feet;
   static int remainder;
   final static int CONVERSION_FACTOR = 12;
   
   
      
   public static void main(String[] args)
   {
      //sets feet and remainder values
      calculate(INCHES);
   
      //displays data
      displayLine(INCHES + " Inches = " +
                  feet + " Feet " +
                  remainder + " Inches");
                  
   } 
   
   //does the work
   static void calculate(int lengthInches)
   {
      //ft = inches/12
      feet = lengthInches / CONVERSION_FACTOR;
      
      //inches remaining = remainder of in/12
      remainder = lengthInches % CONVERSION_FACTOR;
   }
   
   
   //displays strings to terminal, reduces personal errors
   public static void displayLine(String str)
   {
      System.out.println(str);
   }
   
  
   
}
