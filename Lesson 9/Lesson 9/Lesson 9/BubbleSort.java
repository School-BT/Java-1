/*
BubbleSort
use bubblesort algorithm to sort a list like ex. on pg 442 + 448
Ben Burger
9/5/2017
*/

public class BubbleSort
{
   public static int[] listCopy;
   
   //Print out a statement each time the algorithm runs
   //algorithm from page 442
   public static void algorithm(int[] listIn)
   {
      int temp;
      
      int[] list = copy(listIn);
      
      for(int a = 0;a<list.length - 1; ++a)
        for(int b = 0;b<list.length - 1; ++b)
          if(list[b] > list[b+1])
          {
            temp = list[b];
            list[b] = list[b+1];
            list[b+1] = temp;
          }
      printAll(list);
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
      
      print("\n");
   }
   
   public static int[] copy(int[] list)
   {
      int newLen = list.length;
      listCopy = new int[newLen];
      
      for(int i = 0;i<newLen;++i)
      {
         listCopy[i] = list[i];
      }
      
      return listCopy;
   }
   
   
   public static void print(String str)
   {
      System.out.print(str);
   }
}