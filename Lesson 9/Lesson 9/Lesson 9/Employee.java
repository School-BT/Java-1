/*
Employee
Holds data for employees
Ben Burger
8/24/2017
*/

class Employee
{
   String name;
   String last;
   int id;
   double wage;
   
   
   Employee(String namex, String lastx,int idx,double wagex)
   {
      name = namex;
      last = lastx;
      id = idx;
      wage = wagex;
   }
   
   
   void setName(String str)
   {
      name = str;
   }
   
   void setLast(String str)
   {
      last = str;
   }
   
   void setId(int num)
   {
      id = num;
   }
   
   void setWage(double num)
   {
      wage = num;
   }
   
   String getName()
   {
      return name;
   }
   
   String getLast()
   {
      return last;
   }
   
   int getId()
   {
      return id;
   }
   
   double getWage()
   {
      return wage;
   }
   
}