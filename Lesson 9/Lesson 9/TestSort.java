/*
TestSort
testing my BubbleSort and InsertionSort classes
Ben Burger
9/5/2017
*/

public class TestSort
{
   public static int[] list = {23,4,2,52,3,64,65,5,3,1,56};
   
   //uses same array for BubbleSort and InsertionSort
   public static void main(String[] args)
   {      
      print("BubbleSort\n");
      printAll(list);
      print("\n");
      BubbleSort.algorithm(list);
      
      print("InsertionSort\n");
      printAll(list);
      print("\n");
      InsertionSort.algorithm(list);
      
   }
   
   
   public static void printAll(int[] list)
   {
      int LEN = list.length;
      
      for(int i = 0;i<LEN;++i)
      {
         if(i == LEN -1)
         {
            print(list[i] + "");
         }else
         {
            print(list[i] + ", ");
         }
      }
   }
      
      
   public static void print(String str)
   {
      System.out.print(str);
   }
   
}