/*
Sentence
A program that creates a sentence. 
Ben Burger
8/25/2017
*/

import java.lang.StringBuilder;
import java.util.Scanner;

public class Sentence
{
   static String subject;
   static String adverb;
   static String verb;
   static StringBuilder sb = new StringBuilder();
   
   public static void main(String[] args)
   {
      inputs();
      builder();
   }
   
   
   //use StringBuilder to build a sentance
   //print sentence to console.
   public static void builder()
   {
      sb.append("The " + subject + " " + verb +
                " " + adverb + ".");
      String fullSentance = sb.toString();
      
      print(fullSentance);
      
   }
   
   
   // ask for three words
   public static void inputs()
   {
      Scanner sc = new Scanner(System.in);
      print("Please type a subject >> ");
      subject = sc.next();
      print("Please type an adverb >> ");
      adverb = sc.next();
      print("Please type a verb >> ");
      verb = sc.next();
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }
}