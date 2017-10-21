/*
BurmaShave
display in dialog box in a burma shave style fassion, a burma shave slogan
Ben Burger
8/7/2017
*/

import javax.swing.JOptionPane;

public class BurmaShave
{
   //Gathered from http://www.skypoint.com/members/schutz19/burma2.htm
   //the first option from 1927
   public static String strOne = "Shave the modern way";
   public static String strTwo = "No brush";
   public static String strThree = "No lather";
   public static String strFour = "No rub-in";
   public static String strFive = "Big tube 35 cents drug stores";
   public static String strSix = "Burma-Shave";
   

   public static void main(String[] args)
   {
        displayLine(strOne);
        displayLine(strTwo);
        displayLine(strThree);
        displayLine(strFour);
        displayLine(strFive);
        displayLine(strSix);
   }
      
   
   public static void displayLine(String str)
   {
      JOptionPane.showMessageDialog(null,str);
   }
   
}