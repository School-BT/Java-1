/*
InchesToFeet
intches and feet converter with keyboard input
Ben Burger
8/7/2017
*/

import java.util.Scanner;

public class InchesToFeetInteractive
{
   
   static int inches;
   static int feet;
   static int remainder;
   final static int CONVERSION_FACTOR = 12;
      
      
      
   public static void main(String[] args)
   {
      System.out.print("Enter inches >> ");
      calculate(inputBox());
      
      System.out.print(inches + " Inches = " + feet + " Feet " +
                  remainder + " Inches");      
   }   
   
   
   //does the work
   static void calculate(int lengthInches)
   {
      inches = lengthInches;
      feet = inches / CONVERSION_FACTOR;
      remainder = inches % CONVERSION_FACTOR;
   }


   //takes keyboard input
   public static int inputBox(){
      Scanner input = new Scanner(System.in);
      
      return input.nextInt();
     
   }
   

}
