public class demoArray
{
   static double[] salaries  = {1.1,1.2,1.3,1.4};

   public static void main(String[] args)
   {
      iterate();
      
      salaries[0] = 1.1;
      salaries[1] = 1.2;
      salaries[2] = 1.3;
      salaries[3] = 1.4;
      
      print(salaries[0]);
      print(salaries[1]);
      print(salaries[2]);
      print(salaries[3]);
      
   }
   
   public static void iterate()
   {
      for(int i = 0;i<4;++i)
      {
         print(salaries[i]);
      }
   }
   
   public static void print(double str)
   {
      System.out.println(str + "");
   }
}