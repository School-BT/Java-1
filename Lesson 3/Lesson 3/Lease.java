/*
Lease
Create a class Lease holds lease data and
      computes added pet fee with warning.
Ben Burger
8/7/2017
*/

public class Lease
{
   
   String name;//Tenant's name
   int unit;// Apartment number
   double rent; //Rent price per month
   int term; //term of lease in months
   
   final static double PET_FEE = 10;
   
   //Constructor 
   public Lease()
   {
   name = "XXX";
   unit = 0;
   rent = 1000;
   term = 12;
   }
   
//**************setters and getters*****************
   //name handlers
   void setName(String input)
   {
      name = input;
   }
   
   String getName()
   {
      return name;
   }
   
   //apt number handlers
   void setUnit(int num)
   {
      unit = num;
   }
   
   int getUnit()
   {
      return unit;
   }
   
   
   //rent per month handlers
   void setRent(double num)
   {
      rent = num;
   }
   
   double getRent()
   {
      return rent;
   }
   
   //term handlers
   void setTerm(int num)
   {
      term = num;
   }
   
   int getTerm()
   {
      return term;
   }
//**********End Setters and Getters*********************



   
   //nonstatic method to add a pet fee and explain it
   void addPetFee()
   {
      rent += PET_FEE;
      explainPetPolicy();
   }
   
   //Static Method explination for the pet fee used in addPetFee
   static void explainPetPolicy()
   {
      System.out.println("*****An extra $" + PET_FEE +
                         " per month is added to your rent for a pet*****");
   }
   
}  