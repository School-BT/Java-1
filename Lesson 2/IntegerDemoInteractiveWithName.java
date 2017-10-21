import java.util.Scanner;

public class IntegerDemoInteractiveWithName
{
   public static void main(String[] args){
      int anInt;
      byte aByte;
      short aShort;
      long aLong;
      
      String name;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter an integer >> ");
      anInt = input.nextInt();
      System.out.print("Please enter a byte >> ");
      aByte = input.nextByte();
      System.out.print("Please enter a short >> ");
      aShort = input.nextShort();
      System.out.print("Please enter a long >> ");
      aLong = input.nextLong();
      
      System.out.println("anInt = " + anInt);
      System.out.println("aByte = " + aByte);
      System.out.println("aShort = " + aShort);
      System.out.println("aLong = " + aLong);
      
      System.out.println("Please print your name >> ");
      name = input.nextLine();
      name = input.nextLine();
      System.out.println("Thank you " + name);
      
      
      
      
   }
}