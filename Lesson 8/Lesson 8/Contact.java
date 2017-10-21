/*
Contact
Class with a name, number, and address
Ben Burger
8/28/2017
*/

public class Contact
{
   //fields
   String name;
   String address;
   int number;
   
   public Contact(int i)
   {
      name = "";
      address = "";
      number = i;
   }
   
   void setName(String inName)
   {
      name = inName;
   }
   
   void setAddress(String inAddress)
   {
      address = inAddress;
   }
   
   void setNumber(int num)
   {
      number = num;
   }
   
   String getName()
   {
      return name;
   }
   
   String getAddress()
   {
      return address;
   }
   
   int getNumber()
   {
      return number;
   }
}