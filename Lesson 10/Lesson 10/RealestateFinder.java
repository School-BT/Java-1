/*
RealestateFinder
Assists user interface with Realestate objects
Ben Burger
9/8/2017
*/
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;


public class RealestateFinder
{      
   public static ArrayList<Realestate> realList = new ArrayList<Realestate>();
   public static double selector = 0;
 
   public static void main(String[] args)
   {
      readFile();
      askMe();
   }
   
   
   public static void askMe()
   {
      while(selector == 0)
      {
         questions();
         print("");
      }
   }
   
   
   
   public static void questions()
   {
      Scanner sc = new Scanner(System.in);
      
      print("Would you like to sort by price or location? " +
            "\nType exit to exit.");
      
      String input = sc.next();
      
      switch(input)
      {
         case "exit":
            selector = 1;
            break;
         case "price":
            sortPrice(arrayBreakdown(realList));
            printList(realList);
            break;
         case "location":
            sortLocation(arrayBreakdown(realList));
            printList(realList);
            break;
      }
      
   }
   
//allows an arraylist to be sorted by Arrays.sort()
   public static Realestate[] arrayBreakdown(ArrayList<Realestate> realestateList)
   {
      int LEN = realestateList.size();
      
      Realestate[] realestateArray = new Realestate[LEN];
      
      for(int i = 0;LEN > i;++i)
      {
         realestateArray[i] = realestateList.get(i);
      }
      
      return realestateArray;
   }   
   
   
   //allows an Arrays.sort() outcome to become an ArrayList<>
   public static void arrayBuild(Realestate[] realestateList)
   {
      int LEN = realestateList.length;
      
      for(int i = 0;LEN > i;++i)
      {
         realList.set(i,realestateList[i]);
      }
   }
   
  //sorts by location using Arrays.sort()
   public static void sortLocation(Realestate[] realestateList)
   {   
      Arrays.sort(realestateList, new Comparator<Realestate>()
      {
         @Override
         public int compare(Realestate r1, Realestate r2)
         {
              return r1.location.compareTo(r2.location);
         }
      });
      
      arrayBuild(realestateList);
   }
  
   //sorts by price using Arrays.sort()
   public static void sortPrice(Realestate[] realestateList)
   {
      Arrays.sort(realestateList, new Comparator<Realestate>()
      {
         public int compare(Realestate r1, Realestate r2)
         {
              return Double.compare(r1.getPrice(), r2.getPrice());
         }
      });
      
      
      arrayBuild(realestateList);
   }
   
   
   
   public static void printList(double[] list)
   {
      int LEN = realList.size();
      for(int i = 0; i<LEN;++i)
      {
         print(list[i] + "");
      }
   }
   
   //prints all fields of an ArrayList
   public static void printList(ArrayList<Realestate> realestateList)
   {
      int LEN = realestateList.size();
      for(int i = 0; i<LEN;++i)
      {
         print(realestateList.get(i).getLocation() + "");
         print(realestateList.get(i).getPrice() + "");
         print(realestateList.get(i).getDescription() + "");
      }
   }
   
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   
   
   
   
 //Reads in a student file, creates student objects and
 //places it in an array of students
   static void readFile()
   {
  
      try 
      {         
         BufferedReader in = new BufferedReader(new FileReader("realestate.txt"));
         int i = 0;
         String location;
   
         while((location = in.readLine()) != null)
         {          
            String priceStr = in.readLine();
            String description = in.readLine();
            
            whileLoop(location,priceStr,description);
            
            i += 1;
         }

         in.close();
         
      }catch (IOException e) 
      {
      }
   }
   
     
   static void whileLoop(String loc,String priceStr,String des)
   {
      Realestate re = new Realestate();
      
      re.setLocation(loc);
      double price = Double.parseDouble(priceStr);
      re.setPrice(price);
      re.setDescription(des);
      
      realList.add(re);
   }

}