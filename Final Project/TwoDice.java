/*
TwoDice

Ben Burger
CIS163AA
12695
BEN2160204 

9/15/2017
*/


import java.util.Random;

public class TwoDice
{   
   public static Die one = new Die();
   public static Die two = new Die();
   
   public static void main(String[] args)
   {
      print(one.getNum() + "");
      print(two.getNum() + "");
   }
   
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }  
   
}