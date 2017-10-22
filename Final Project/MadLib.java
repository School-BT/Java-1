/*
MadLib
Ben Burger
9/15/2017
*/

import javax.swing.JOptionPane;
import java.util.*;

public class MadLib
{
   public static String twinkleCap;
   public static String twinkle;
   public static String little;
   public static String star;
   
   public static String diamond;
   public static String sky;
   public static String world;
   
   public static int dialogResult = 0;
   
   
   public static void main(String[] args)
   {  
      while(dialogResult == 0)
      {
         input();
         makeCaps();
         printFin();
         askToPlay();
      }
   }
   
   public static void makeCaps()
   {
      String first = twinkle.substring(0,1);
      first = first.toUpperCase();
      int LEN = twinkle.length();
      String last = twinkle.substring(1,LEN);
      twinkleCap = first + last;
   }
   
   public static String handleInput()
   {
      String str = "";
      return str;
   }
   
   //aquire six words from user to include in a mad lib
   public static void input()
   {
      //1
      String ans = JOptionPane.showInputDialog("Please enter a verb.");
      twinkle = ans;
      //2
      ans = JOptionPane.showInputDialog("Please enter an adjective.");
      little = ans;
      //3
      ans = JOptionPane.showInputDialog("Please enter a large object.");
      star = ans;
      //4
      ans = JOptionPane.showInputDialog("Please enter a small object.");
      diamond = ans;
      //5
      ans = JOptionPane.showInputDialog("Please enter a place.");
      sky = ans;
      //6
      ans = JOptionPane.showInputDialog("Please enter a large object.");
      world = ans;
   }
   
   
   
   public static void printFin()
   {
      print(twinkleCap + ", " + twinkle + ", " + little + " " + star + "," +
            " how I wonder what you are.\n" +
            " Up above the " + world + " so high, " +
            " like a " + diamond + " in the " + sky + ".\n" +
            twinkleCap + ", " + twinkle + ", " + little + " " + star + "," +
            " how I wonder what you are. ");
   }
   
   public static void print(String str)
   {
      JOptionPane.showMessageDialog(null,str);
   }
   
   
   //ask to play again with yes no option
   public static void askToPlay()
   {
      dialogResult = JOptionPane.showConfirmDialog(
               null,
               "Would you like to play again?",
               "Replay",
               JOptionPane.YES_NO_OPTION);
   }  
}
