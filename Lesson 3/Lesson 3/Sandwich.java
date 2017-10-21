/*
Sandwich
Creates an object Sandwich with a main ingredient, bread type, and a price
Ben Burger
8/5/2017
*/

public class Sandwich
{
   static String mainIng;
   static String bread;
   static double price;
   
   //Constructor setting main ingrediant to turkey, bread type to ry, and price to 5.99
   public Sandwich()
   {
      setMainIng("turkey");
      setBread("rye");
      setPrice(5.99);
     
   }
   
   
   //Setters and getters
   public static void setMainIng(String str)
   {
      mainIng = str;
   }
   
   public static String getMainIng()
   {
      return mainIng;
   }
   
   
   public static void setBread(String str)
   {
      bread = str;
   }
   
   public static String getBread()
   {
      return bread;
   }
   
   
   public static void setPrice(double num)
   {
      price = num;
   }
   
   public static double getPrice()
   {
      return price;
   }
   
}