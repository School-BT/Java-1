/*
MyContacts
Handles an array of Contact objects
Ben Burger
8/28/2017
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MyContacts
{
   public static ArrayList<Contact> contacts = new ArrayList<Contact>();
   public static int listLen;
   
   public static void main(String[] args)
   {
      add();
      printList();
      
   }
   
   //The Add option should allow 
   //the user to enter in a new contact 
   public static void add()
   {
      listLen = contacts.size() - 1;
      Contact cont = new Contact(listLen);
      Scanner sc = new Scanner(System.in);
      
      print("Please enter a name");
      String input = sc.nextLine();
      cont.setName(input);
      
      print("Please enter an address");
      input = sc.nextLine();
      cont.setAddress(input);
      
      print("Please enter a number");
      int inputN = sc.nextInt();
      cont.setNumber(inputN);
      
      contacts.add(cont);
   }
     
   //The Remove option should print 
   //the contact list with its array index.
   public static void remove()
   {
      Scanner sc = new Scanner(System.in);
      
      printList();
      print("Please type the index of the" +
            " Contact you would like to remove");
      int i = sc.nextInt();
      contacts.remove(i);
   }
      
   
   
   public static void reorder()
   {
      Scanner sc = new Scanner(System.in);
      
      printList();
      
      print("Please type the indexes of the" + 
            " items you would like to swap");
            
      int i1 = sc.nextInt();
      int i2 = sc.nextInt();
      
      Contact placeHolder = contacts.get(i1);
      
      if(i1>i2)
      {
         reorderAction(i1,i2);
      }else if(i2>i1)
      {
         reorderAction(i2,i1);
      }else
      {
         print("The indexes must be different");
      }
   }
   
   public static void reorderAction(int i1,int i2)
   {
      ArrayList<Contact> part1 = new ArrayList<Contact>();
      ArrayList<Contact> part2 = new ArrayList<Contact>();
      ArrayList<Contact> part3 = new ArrayList<Contact>();
      
      Contact cont1 = contacts.get(i1);
      Contact cont2 = contacts.get(i2);
      
      
   }
   
   public static void parseArray(ArrayList<Contact> arr)
   {
      for(int i = i1;i<i2;++i)
      {
         Contact cont1 = contacts.get(i);
         arr.add(cont1);
         
      }
   }
   
   //The print option will print the contact list with the array index
   public static void printList()
   {
      listLen = contacts.size();
      
      for(int i = 0; i < listLen ; ++i)
      {
         printCont(i);
      }
   }
      
   public static void printCont(int i)
   {
      Contact cont = contacts.get(i);
      String str = cont.getName() + " at index [" +
      contacts.indexOf(cont) + "]";
      print(str);
   }
      
   public static void exit()
   {
   
   }
   
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }
}