/*
Contact
Class with a name, number, and address
Ben Burger
8/28/2017
*/

public class Contact
{
   
   public static String name;
   public static String address;
   public static int number;
   
   public Contact(int i)
   {
      name = "";
      address = "";
      number = i;
   }
   
   public static void setName(String inName)
   {
      name = inName;
   }
   
   public static void setAddress(String inAddress)
   {
      address = inAddress;
   }
   
   public static void setNumber(int num)
   {
      number = num;
   }
   
   public static String getName()
   {
      return name;
   }
   
   public static String getAddress()
   {
      return address;
   }
   
   public static int getNumber()
   {
      return number;
   }
}