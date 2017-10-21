/*
TestSandwich
instantiates one sandwich object and demonstrate the
   use of the set and get methods.
Ben Burger
8/5/2017
*/

public class TestSandwich
{
   //***** Instantiation of Sandwich *****
   static Sandwich sandwich = new Sandwich();
      
   //These variables make Changing the new sandwich fields easier
   static String mainIngUsed = "Meat";
   static String breadUsed = "White";
   static double priceUsed = 5.23;

   public static void main(String[] args)
   {  
      printLn("This is the Constructor Sandwich");
      showSand(sandwich);
   
      printLn("\nThis is the new Sandwich");
      
      buildSand(mainIngUsed,breadUsed,priceUsed);
      
      showSand(sandwich);
   }
   
   
   //demonstration of set Methods
   static void buildSand(String mainIng,String bread,double price)
   {  
      sandwich.setMainIng(mainIng);
      sandwich.setBread(bread);
      sandwich.setPrice(price);
   }
   
   //demonstration of get Methods
   static void showSand(Sandwich wich)
   {
      printLn
      ("Main Ingrediant : " + wich.getMainIng() + 
       "\nBread : " + wich.getBread() +
       "\nPrice : $" + wich.getPrice()
      );
   }
   
   //simplifies System.out.println(String) for my personal use
   static void printLn(String str)
   {
      System.out.println(str);
   }
}