

public class DemoBlock
{
   public static void main(String[] args)
   {  
      System.out.println("Demonstratng block scope");
      int x = 1111;
      System.out.println("in first block x is " + x);
      {
         int y = 2222;
         System.out.println("in second block x is " + x);
         System.out.println("y is " + y);
      }

      {
         int y = 3333;
         System.out.println("block 3 x is " + x);
         System.out.println("y is " + y);
         demoMethod();
         System.out.println("new x is " + x);
         System.out.println("new y is " + y);
      }
      
      System.out.println("the final x is " + x);
   }
   public static void demoMethod()
      {
         int x = 1234;
         int y = 2431;
         System.out.println("dMeth x is " + x);
         System.out.println("dMeth y is " + y);
      }
}