/*
Die.java

Ben Burger
CIS163AA
12695
BEN2160204 

9/15/2017
*/

import java.util.Random;


public class Die
{
   public static int HIGHVAL = 6;
   public int num;
   
   public Die()
   {
      roll();
   }
   
   public int roll()
   {
      Random rand = new Random();
      
      num = rand.nextInt(HIGHVAL) + 1;
      
      return num;
   }
   
   public int getNum()
   {
      return num;
   }
   
}