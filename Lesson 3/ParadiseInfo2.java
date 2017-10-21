//YDI 126 Ben Burger
import java.util.Scanner;

public class ParadiseInfo2
{
   public static void main(String[] args)
   {
      double price;
      double discount;
      double savings;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("input cutoff price of Discount >> ");
      price = keyboard.nextDouble();
      
      System.out.print("input discount rate (whole Num) >> ");
      discount = keyboard.nextDouble();
      
      savings = calculateDiscountInfo(price,discount);
      
      System.out.print("Savings is " + savings);
              
      displayInfo();
   }  
   
   public static double calculateDiscountInfo(double price,double discount)
   {
      double savings;
      savings = price * discount/100;
      return savings;
   }
   
   public static void displayInfo()
   {
      System.out.println("Paradise Day Spa wants to pamper you.");
      System.out.println("We will make you look good.");
   }  
}