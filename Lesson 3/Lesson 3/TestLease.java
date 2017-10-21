/*
TestLease
allows creation of Lease objects by user input
Ben Burger
8/7/2017
*/

import java.util.Scanner;

public class TestLease
{
   public static void main(String[] args)
   {
      //Declaration of 4 Lease Objects
      Lease lease1 = new Lease();
      Lease lease2 = new Lease();
      Lease lease3 = new Lease();
      Lease lease4 = new Lease();
      
      //Assigns input data to these Lease objects
      // calling getData
      lease1 = getData();
      lease2 = getData();
      lease3 = getData();
      
      //Shows the addPetFee() method works
      showValues(lease1);
      lease1.addPetFee();
      showValues(lease1);
      
      //shows value retention from getData
      showValues(lease2);      
      showValues(lease3);
      
      //untouched Lease object showing constructor works       
      showValues(lease4);
      
   }
   
   
   //Gets user input and returns that input as fields of Lease object
   public static Lease getData()
   {
      Lease leasex = new Lease();
      Scanner scanner = new Scanner(System.in);
      System.out.print("Input Name >> ");
      leasex.setName(scanner.next());
      System.out.print("Input Rent >> ");
      leasex.setRent(scanner.nextDouble());
      System.out.print("Input Lease Length >> ");
      leasex.setTerm(scanner.nextInt());
      System.out.print("Input Appartment Number >> ");
      leasex.setUnit(scanner.nextInt());
      System.out.println("");
      return leasex;
   }
   
   //Just shows the values of fields of Lease objects.
   public static void showValues(Lease leasex)
   {
      System.out.println("\nTenent Name:" + leasex.getName());
      System.out.println("Rent Is: $" + leasex.getRent());
      System.out.println("Months Left: " + leasex.getTerm());
      System.out.println("Apartment Number: " + leasex.getUnit());
   }
   
   
}