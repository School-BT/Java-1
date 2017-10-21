/*
Realestate
Class to hold realestate fields
Ben Burger
9/8/2017
*/

public class Realestate
{
   String location;
   double price;
   String description;
   
   void setLocation(String str)
   {
      location = str;
   }
   
   void setPrice(double num)
   {
      price = roundPrice(num);
   }
   
   
   void setDescription(String str)
   {
      description = str;
   }
   
   String getLocation()
   {
      return location;
   }
   
   double getPrice()
   {
      return price;
   }
   
   String getDescription()
   {
      return description;
   }
   
   
   double roundPrice(double input)
   {
      String str = input + "0000";
      int place = str.indexOf(".") + 4;
      String lastStr = str.substring(place - 1,place);
      double last = Integer.parseInt(lastStr);
      double num = Double.parseDouble(str);
      if(last>=5)
      {
         num += .01;
      }
      str = "" + num;
      place = str.indexOf(".") + 3;
      str = str.substring(0,place);
      num = Double.parseDouble(str);
      return num;
   }
}
