/*
InsertionSort
sorts a list with the insertionSort algorithm
Ben Burger
9/5/2017
*/

public class InsertionSort
{   
   public static int[] listCopy;
   
   
   //Print out a statement each time the algorithm runs
   //algorithm from page 448
   public static void algorithm(int[] listIn)
   {
      int a = 1;
      int b;
      int temp;
      int[] list = copy(listIn);
      
      while(a < list.length)
      {
         temp = list[a];
         b = a - 1;
         while(b >= 0 && list[b] > temp)
         {
            list[b+1] = list[b];
            --b;
         }
         list[b+1] = temp;
         ++a;
      }
      
      printAll(list);
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
   
   
   public static void print(String str)
   {
      System.out.print(str);
   }
   
   
}