/*
MyContacts
Handles an array of Contact objects
Ben Burger
8/28/2017
*/

import java.util.Scanner;

public class MyContacts
{
   public static Contact[] contacts = new Contact[1];
   static int selector = 0;
   
//keeps looping untill exit
//presents options add,remove,change order, print,exit
   public static void main(String[] args)
   {               
      do{      
         println("** Your comands are add, remove, **" +
               "\n** change order, print, and exit **");
      
         handleInput();        
               
      }while(selector == 0);
   }
   
  
//handles user input, on exit program terminates
   static void handleInput()
   {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      
      switch(input)
      {
         case "add":
         case "Add":
         case "ADD":
            add();
            break;
         case "Remove":
         case "remove":
         case "REMOVE":
            remove();
            break;
         case "Change Order":
         case "change order":
         case "change Order":
         case "Change order":
         case "changeOrder":
         case "changeorder":
         case "ChangeOrder":
         case "Changeorder":
         case "ReOrder":
         case "reorder":
         case "reOrder":
         case "REORDER":
            reorder();
            break;
         case "Print":
         case "print":
         case "PRINT":
            printList();
            break;
         case "Exit":
         case "exit":
         case "EXIT":
            selector = 1;
            break;
      
      }      
   }
   
  
  
//The Add option should allow the user to
//enter in a new contact to the end of the list
   static void add()
   {
      Scanner sc = new Scanner(System.in);
      Contact cont = new Contact(1);
            
      print("Please enter a name >> ");
      String input = sc.nextLine();
      cont.setName(input);
      
      print("Please enter an address >> ");
      input = sc.nextLine();
      cont.setAddress(input);
            
      print("Please enter a number >> ");
      int inputN = sc.nextInt();
      cont.setNumber(inputN);
      
      extendArr();
      
      int LAST = contacts.length - 1;
      contacts[LAST] = cont;
   }
   
  
  
//helper for add()
   static void extendArr()
   {
      int LEN = contacts.length;
      
      Contact[] temp = new Contact[LEN + 1];
      
      for(int i = 0 ; i < LEN ; ++i)
      {
         Contact con = contacts[i];
         temp[i] = con;
      }
      
      contacts = temp;
   }  
  
        
//prints contact list with array index
//user selects index # to be deleted
   static void remove()
   {
      printList();
      
      println("Type the index of the contact\n" +
            " you would like to remove.");
      
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      remove(input);
   }
  
  
  
   
//remove() helper function
//item removed, items shifted, hole filled
   static void remove(int input)
   {
      int LEN = contacts.length;
      
      Contact[] temp = new Contact[LEN - 1];
      int j = 0;
      
      for(int i = 0 ; i < LEN ; ++i)
      {
         if(i == input)
         {     
         }else
         {
            Contact con = contacts[i];
            temp[j] = con;
            j += 1; 
         }
      }
      contacts = temp;
   }
 
  
   
//This is the Change Order option
//prints contact list with array index
//handles user input
   static void reorder()
   {
      printList();
      println("Please select the index of which contact");
      println("you would like to move, and then the index");
      println("of which contact you would like it to be");
      println("switched with.");
      
      Scanner sc = new Scanner(System.in);
      int first = sc.nextInt();
      
      int second = sc.nextInt();

      reorder(first,second);
      
      printList();
      
   }
 
   
   
//First number is the contact they want to move
//Second is the index of where to move it to
//second contact is moved to index of first
//first is placed in selected index.
   static void reorder(int start,int end)
   {
      Contact first = contacts[start];
      Contact second = contacts[end];
         
      contacts[start] = second;
      contacts[end] = first;
   }
  
  
     
//The print option will print the contact list with the array index
   static void printList()
   {
      int LENG = contacts.length;
            
      for(int i = 1;i<LENG;++i)
      {
         printCont(i);
      }
   }
   
//Print option Helper function  
   static void printCont(int i)
   {
      println("Name: " + contacts[i].getName() + " at index : " + i);
   }
    
    
    
    
//Helper Function
   static void print(String str)
   {
      System.out.print(str);
   }
   static void println(String str)
   {
      System.out.println(str);
   }
}